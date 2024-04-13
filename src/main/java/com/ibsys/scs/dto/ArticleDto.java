package com.ibsys.scs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibsys.scs.entities.Article;

public record ArticleDto(
        Double amount,

        @JsonProperty("startamount")
        Double startAmount,
        Double pct,
        Double price,
        @JsonProperty("stockvalue")
        Double stockValue
) {
    public Article toArticle() {
        return Article.builder()
                .id(null)
                .amount(amount)
                .startAmount(startAmount)
                .pct(pct)
                .price(price)
                .stockValue(stockValue)
                .build();
    }
}
