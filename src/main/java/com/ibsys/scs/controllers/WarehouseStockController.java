package com.ibsys.scs.controllers;

import com.ibsys.scs.dto.WarehouseStockDto;
import com.ibsys.scs.entities.WarehouseStock;
import com.ibsys.scs.services.WarehouseStockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.WAREHOUSE_STOCK)
public class WarehouseStockController {

    private final WarehouseStockService warehouseStockService;

    @GetMapping
    public List<WarehouseStock> findWarehouseStocksByPeriod(@RequestParam(name = "period") final Integer period) {
        return warehouseStockService.findWarehouseStocksByPeriod(period);
    }

    @PostMapping
    public void createWarehouseStock(@RequestBody final WarehouseStockDto warehouseStockDto) {
        warehouseStockService.createWarehouseStock(warehouseStockDto);
    }

    @PostMapping("/many")
    public void createMultipleWarehouseStocks(@RequestBody final List<WarehouseStockDto> warehouseStockDtoList) {
        warehouseStockService.createMultipleWarehouseStocks(warehouseStockDtoList);
    }
}
