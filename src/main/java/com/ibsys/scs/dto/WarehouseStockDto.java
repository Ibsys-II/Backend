package com.ibsys.scs.dto;

import com.ibsys.scs.entities.WarehouseStock;

public record WarehouseStockDto(
        Double amount,

        Double pct,

        Double price,

        //@JsonProperty("stockvalue")
        Double stockValue,

        Integer period,

        Integer articleId
) {

    public WarehouseStock toWarehouseStock() {
        return WarehouseStock.builder()
                .id(null)
                .amount(amount)
                .pct(pct)
                .price(price)
                .stockValue(stockValue)
                .period(period)
                .articleId(articleId)
                .build();
    }
}
