package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.dto.neu.ForecastDto;
import com.ibsys.scs.entities.neu.Forecast;
import com.ibsys.scs.services.neu.ForecastService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.FORECAST)
public class ForecastController {

    private final ForecastService forecastService;

    @PostMapping
    public void createForecast(@RequestBody final ForecastDto forecastDto) {
        forecastService.createForecast(forecastDto);
    }

    @GetMapping
    public List<Forecast> findAllForecast() {
        return forecastService.findAllForecast();
    }
}
