package com.ibsys.scs.controllers;

import com.ibsys.scs.dto.AppOrderDto;
import com.ibsys.scs.entities.AppOrder;
import com.ibsys.scs.services.AppOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.ORDERS)
public class AppOrderController {

    private final AppOrderService appOrderService;

    @GetMapping
    public List<AppOrder> findOrders(
            @RequestParam(name = "period", required = false) final Integer period,
            @RequestParam(name = "isInwardStockMovement", required = false) final Boolean isInwardStockMovement
    ) {
        if (isInwardStockMovement != null) {
            return appOrderService.findAppOrderByIsInwardStockMovement(isInwardStockMovement);
        }
        return appOrderService.findOrdersByPeriod(period);
    }

    @PostMapping
    public void createOrder(@RequestBody final AppOrderDto appOrderDto) {
        appOrderService.createOrder(appOrderDto);
    }

    @PostMapping("/many")
    public void createMultipleOrders(@RequestBody final List<AppOrderDto> appOrderDtoList) {
        appOrderService.createMultipleOrders(appOrderDtoList);
    }
}
