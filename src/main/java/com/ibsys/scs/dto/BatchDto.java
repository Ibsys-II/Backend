package com.ibsys.scs.dto;

import com.ibsys.scs.entities.Batch;

public record BatchDto(
        Integer period,
        Integer amount,
        //@JsonProperty("cycletime")
        Integer cycleTime,
        Double cost,
        Integer itemNumber
) {
    public Batch toBatch() {
        return Batch.builder()
                .id(null)
                .period(period)
                .amount(amount)
                .cycleTime(cycleTime)
                .cost(cost)
                .itemNumber(itemNumber)
                .build();
    }
}
