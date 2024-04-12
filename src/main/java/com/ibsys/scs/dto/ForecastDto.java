package com.ibsys.scs.dto;

import com.ibsys.scs.entities.Forecast;

public record ForecastDto(
        Integer p1,
        Integer p2,
        Integer p3
) {

    public Forecast toForecast() {
        return Forecast.builder()
                .id(null)
                .p1(p1)
                .p2(p2)
                .p3(p3)
                .build();
    }
}
