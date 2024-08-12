package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.entities.neu.WorkPlace;
import com.ibsys.scs.repositories.*;
import com.ibsys.scs.repositories.neu.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.DB_CONFIG)
public class DbConfigController {

    private final ArticleRepository articleRepository;
    //private final CapacityPlanRepository capacityPlanRepository;
    //private final CapacityPlanSumUpRepository capacityPlanSumUpRepository;
    private final ForecastRepository forecastRepository;
    private final OrdersInWorkWorkplaceRepository ordersInWorkWorkplaceRepository;
    private final ProductionOrderRepository productionOrderRepository;
    private final PurchasePartDispositionRepository purchasePartDispositionRepository;
    //private final SaleAndProductionProgramRepository saleAndProductionProgramRepository;
    private final WaitingliststockWaitlinglistRepository waitingliststockWaitlinglistRepository;
    private final WaitinglistWorkplaceRepository waitinglistWorkplaceRepository;
    private final WorkPlaceRepository workPlaceRepository;
    private final WarehouseStockRepository warehouseStockRepository;
    private final AppOrderRepository appOrderRepository;
    private final BatchRepository batchRepository;
    private final MaterialPlanRepository materialPlanRepository;

    @GetMapping("/clear-db")
    void clearDb() {
        articleRepository.deleteAll();
        //capacityPlanRepository.deleteAll();
        //capacityPlanSumUpRepository.deleteAll();
        forecastRepository.deleteAll();
        ordersInWorkWorkplaceRepository.deleteAll();
        productionOrderRepository.deleteAll();
        purchasePartDispositionRepository.deleteAll();
        //saleAndProductionProgramRepository.deleteAll();
        waitingliststockWaitlinglistRepository.deleteAll();
        waitinglistWorkplaceRepository.deleteAll();
        workPlaceRepository.deleteAll();
        warehouseStockRepository.deleteAll();
        appOrderRepository.deleteAll();
        batchRepository.deleteAll();
        materialPlanRepository.deleteAll();
    }
}
