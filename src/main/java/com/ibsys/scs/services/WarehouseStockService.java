package com.ibsys.scs.services;

import com.ibsys.scs.entities.Article;
import com.ibsys.scs.entities.WarehouseStock;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WarehouseStockService {

    private final ArticleService articleService;

    public WarehouseStock getWarehouseStock() {
        var articles = articleService.findAllArticles();

        var amountList = articles.stream().map(Article::getAmount).toList();

        var totalStockValue = amountList.stream().reduce(0.0, Double::sum);

        return WarehouseStock.builder()
                .articles(articles)
                .totalStockValue(totalStockValue)
                .build();
    }
}
