package com.ibsys.scs.services;

import com.ibsys.scs.dto.ForecastDto;
import com.ibsys.scs.entities.Forecast;
import com.ibsys.scs.repositories.ForecastRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ForecastService {

    private final ForecastRepository forecastRepository;

    public void createForecast(final ForecastDto forecastDto) {
        var forcast = forecastDto.toForecast();
        forecastRepository.save(forcast);
    }

    public List<Forecast> findAllForecast() {
        return forecastRepository.findAll();
    }
}
