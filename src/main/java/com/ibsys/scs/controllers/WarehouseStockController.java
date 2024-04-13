package com.ibsys.scs.controllers;

import com.ibsys.scs.entities.WarehouseStock;
import com.ibsys.scs.services.WarehouseStockService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.WAREHOUSE_STOCK)
public class WarehouseStockController {

    private final WarehouseStockService warehouseStockService;

    @GetMapping
    public WarehouseStock getWarehouseStock() {
        return warehouseStockService.getWarehouseStock();
    }
}
