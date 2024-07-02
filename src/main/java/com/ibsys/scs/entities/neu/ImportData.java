package com.ibsys.scs.entities.neu;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibsys.scs.dto.AppOrderDto;
import com.ibsys.scs.dto.neu.ForecastDto;
import com.ibsys.scs.entities.neu.importentities.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImportData {
    private Integer game;
    private Integer group;
    private Integer period;
    @JsonProperty("forecast")
    private ForecastDto forecastDto;
    private WarehouseStock warehousestock;
    private List<AppOrderDto> inwardstockmovement;
    private List<FutureInwardStockmovement> futureinwardstockmovement;
    private IdleTimeCostsDto idletimecosts;
    private List<WorkPlaceDto> waitinglistworkstations;
    private List<MissingPartDto> waitingliststock;
    private List<OrdersInWorkWorkplaceDTO> ordersinwork;
    private List<AppOrderDto> completedorders;
    private CycletimesDTO cycletimes;
}
