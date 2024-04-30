package com.ibsys.scs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibsys.scs.entities.Article;

public record ArticleDto(
        Double amount,
        String number,
        String usedFor,
        String description,
        //@JsonProperty("startamount")
        Double startAmount,
        Double pct,
        Double price,
        //@JsonProperty("stockvalue")
        Double stockValue
) {
    public Article toArticle() {
        return Article.builder()
                .id(null)
                .amount(amount)
                .number(number)
                .usedFor(usedFor)
                .description(description)
                .startAmount(startAmount)
                .pct(pct)
                .price(price)
                .stockValue(stockValue)
                .build();
    }
}
