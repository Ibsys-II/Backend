package com.ibsys.scs.services.neu;

import com.ibsys.scs.dto.neu.ArticleDto;
import com.ibsys.scs.entities.neu.*;
import com.ibsys.scs.repositories.ArticleRepository;
import com.ibsys.scs.repositories.neu.*;
import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
@Slf4j
public class ImportService {

    private final ForecastRepository forecastRepository;
    private final ArticleRepository articleRepository;
    private final WaitinglistWorkplaceRepository waitinglistWorkplaceRepository;
    private final WorkPlaceRepositoryNew workplaceRepository;
    private final OrdersInWorkWorkplaceRepository ordersInWorkWorkplaceRepository;
    private final PurchasePartDispositionRepository purchasePartDispositionRepository;
    private final WaitingliststockWaitlinglistRepository waitingliststockWaitlinglistRepository;
    private final FutureInwardStockmovementRepository futureInwardStockmovementRepository;
    //private final DispositionEigenfertigungRepository dispositionEigenfertigungRepository;
    private final ProductionOrderRepository productionOrderRepository;

    // private final DispositionEigenfertigungService dispositionEigenfertigungService;
    private ProductionOrderService productionOrderService;

    @Transactional
    public void processImport(ImportData importData) {
        List<Article> articles = importData.getWarehousestock().getArticle().stream()
                .map(ArticleDto::toArticle)
                .toList();

        importArticles(articles);

        var forecast = Forecast.builder()
                .p1(importData.getForecastDto().p1())
                .p2(importData.getForecastDto().p2())
                .p3(importData.getForecastDto().p3())
                .period(importData.getPeriod())
                .build();

        importForecast(forecast);

        importWaitingListWorkstation(importData);

        importOrdersInWorkWorkplace(importData);

        importWaitingliststockWaitinglist(importData);

        importFutureInwardStockmovement(importData);

        importProductionOrder();

        productionOrderService.updateProductionOrderOfAllArticles();
    }

    @Transactional
    public void importForecast(Forecast forecast) {
        forecast.setId(UUID.randomUUID());
        forecastRepository.saveAndFlush(forecast);
    }

    @Transactional
    public void importWaitingListWorkstation(ImportData importData) {
        importData.getWaitinglistworkstations().forEach(
                workplaceDTO -> {
                    log.debug(workplaceDTO.toString());
                    WorkPlace workplace = workplaceRepository.saveAndFlush(workplaceDTO.toWorkPlace());
                    if(workplaceDTO.getWaitinglist() == null) {
                        return;
                    }
                    List<WaitingListWorkPlace> waitingListWorkplace = workplaceDTO.getWaitinglist().stream()
                            .map(waitingListDTO -> {
                                waitingListDTO.setWorkplace(workplace);
                                return waitingListDTO.toWaitinglistWorkplace();
                            })
                            .toList();
                    waitinglistWorkplaceRepository.saveAllAndFlush(waitingListWorkplace);
                }
        );
    }

    @Transactional
    public void importWaitingliststockWaitinglist(ImportData importData) {
        List<WaitingliststockWaitinglist> waitinglists = new ArrayList<>();
        importData.getWaitingliststock()
                .forEach(missingPartDTO ->
                                missingPartDTO.getWorkplace()
                                        .forEach(waitinglistWorkplaceDTO ->
                                                waitinglistWorkplaceDTO.getWaitinglist().forEach(
                                                        waitinglistDTO -> waitinglists.add(waitinglistDTO.toWaitingliststockWaitinglist())
                                                )
                                        )
                );
        waitingliststockWaitlinglistRepository.saveAllAndFlush(waitinglists);
    }

    @Transactional
    public void importOrdersInWorkWorkplace(ImportData importData) {
        ordersInWorkWorkplaceRepository.saveAllAndFlush(importData.getOrdersinwork().stream()
                .map(OrdersInWorkWorkplaceDTO::toOrdersInWorkWorkplace)
                .toList());
    }

    @Transactional
    public void importProductionOrder() {
        List<OrdersInWorkWorkplace> allOrdersInWorkWorkplaces = ordersInWorkWorkplaceRepository.findAll();
        List<ProductionOrder> productionOrderList = productionOrderRepository.findAll();
        productionOrderList.forEach(p -> {
            p.setOrdersInWaitingQueue(
                    productionOrderService.sumUpAllAuftraegeOfItemInWarteschlange(p.getArticleNumber())
            );
            OrdersInWorkWorkplace ordersInWorkWorkplace = allOrdersInWorkWorkplaces.stream()
                    .filter(workplace -> workplace.getItem() == p.getArticleNumber())
                    .findFirst()
                    .orElse(null);

            int auftraegeInBearbeitung = 0;

            if (ordersInWorkWorkplace != null) {
                auftraegeInBearbeitung = ordersInWorkWorkplace.getAmount();
            }
            var workInProgress = (int) Math.ceil((double) auftraegeInBearbeitung / 3);
            p.setWorkInProgress(workInProgress);
        });
        productionOrderRepository.saveAll(productionOrderList);
    }

    @Transactional
    public void importArticles(List<Article> articles) {
        List<ProductionOrder> productionOrderList = new ArrayList<>();
        articles = articles.stream().map(article -> {
            switch (article.getId()) {
                case 1, 4, 7, 10, 13, 18, 51, 50, 49 -> {
                    article.setUsedFor(StuecklistenGroup.P1);
                    productionOrderList.add(
                            ProductionOrder.builder()
                                    .article(article.getId() == 1 ? "P1" : "E" + article.getId())
                                    .articleNumber(article.getId())
                                    .usedFor(StuecklistenGroup.P1)
                                    .warehousePreviousPeriod((int) Math.floor(article.getAmount()))
                                    .build()
                    );
                }
                case 2, 5, 8, 11, 14, 19, 56, 55, 54 -> {
                    article.setUsedFor(StuecklistenGroup.P2);
                    productionOrderList.add(
                            ProductionOrder.builder()
                                    .article(article.getId() == 2 ? "P2" : "E" + article.getId())
                                    .articleNumber(article.getId())
                                    .usedFor(StuecklistenGroup.P2)
                                    .warehousePreviousPeriod((int) Math.floor(article.getAmount()))
                                    .build()
                    );
                }
                case 3, 20, 6, 9, 12, 15, 31, 30, 29 -> {
                    article.setUsedFor(StuecklistenGroup.P3);
                    productionOrderList.add(
                            ProductionOrder.builder()
                                    .article(article.getId() == 3 ? "P3" : "E" + article.getId())
                                    .articleNumber(article.getId())
                                    .usedFor(StuecklistenGroup.P3)
                                    .warehousePreviousPeriod((int) Math.floor(article.getAmount()))
                                    .build()
                    );
                }
                case 26, 16, 17 -> {
                    article.setUsedFor(StuecklistenGroup.ALLE);
                    var warehousePreviousPeriodForAllGoods = Math.floor(article.getAmount());
                    var warehousePreviousPeriodShared = (int) Math.ceil(warehousePreviousPeriodForAllGoods / 3);
                    productionOrderList.add(
                            ProductionOrder.builder()
                                    .article(article.getId() == 1 ? "P1" : "E" + article.getId())
                                    .articleNumber(article.getId())
                                    .usedFor(StuecklistenGroup.P1)
                                    .warehousePreviousPeriod(warehousePreviousPeriodShared)
                                    .build()
                    );
                    productionOrderList.add(
                            ProductionOrder.builder()
                                    .article(article.getId() == 2 ? "P2" : "E" + article.getId())
                                    .articleNumber(article.getId())
                                    .usedFor(StuecklistenGroup.P2)
                                    .warehousePreviousPeriod(warehousePreviousPeriodShared)
                                    .build()
                    );
                    productionOrderList.add(
                            ProductionOrder.builder()
                                    .article(article.getId() == 3 ? "P3" : "E" + article.getId())
                                    .articleNumber(article.getId())
                                    .usedFor(StuecklistenGroup.P3)
                                    .warehousePreviousPeriod(warehousePreviousPeriodShared)
                                    .build()
                    );
                }
                default -> article.setUsedFor(null);
            }
            return article;
        }).toList();

        // Feed the stock values for the purchase parts into the purchase-part-disposition table
        List<PurchasePartDisposition> purchasePartDispositions = purchasePartDispositionRepository.findAll();

        for (int i = 0; i < purchasePartDispositions.size(); i++) {
            int itemNumber = purchasePartDispositions.get(i).getItemNumber();

            purchasePartDispositions.get(i).setInitialStock(
                    Integer.parseInt(
                            String.valueOf(articles.get(itemNumber-1).getAmount())
                    )
            );
        }

        purchasePartDispositionRepository.saveAllAndFlush(purchasePartDispositions);
        articleRepository.saveAllAndFlush(articles);
        productionOrderRepository.saveAll(productionOrderList);
    }

    public void importWaitinglist(List<WaitingListWorkPlace> waitinglistWorkplace) {
        waitinglistWorkplaceRepository.saveAllAndFlush(waitinglistWorkplace);
    }

    @Transactional
    public void importFutureInwardStockmovement(ImportData importData) {
        futureInwardStockmovementRepository.deleteAll();

        List<FutureInwardStockmovement> futureInwardStockmovements = importData
                .getFutureinwardstockmovement()
                .stream()
                .toList();

        futureInwardStockmovementRepository.saveAllAndFlush(futureInwardStockmovements);
    }
}
