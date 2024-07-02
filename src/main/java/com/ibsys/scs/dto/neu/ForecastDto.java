package com.ibsys.scs.dto.neu;

import com.ibsys.scs.entities.neu.Forecast;

public record ForecastDto(
        Integer p1,
        Integer p2,
        Integer p3,
        Integer period
) {

    public Forecast toForecast() {
        return Forecast.builder()
                .id(null)
                .p1(p1)
                .p2(p2)
                .p3(p3)
                .period(period)
                .build();
    }
}
