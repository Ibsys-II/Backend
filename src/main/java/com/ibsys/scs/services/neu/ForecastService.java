package com.ibsys.scs.services.neu;

import com.ibsys.scs.dto.neu.ForecastDto;
import com.ibsys.scs.entities.neu.Forecast;
import com.ibsys.scs.repositories.neu.ForecastRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
