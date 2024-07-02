package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.dto.neu.ProductionOrderDto;
import com.ibsys.scs.entities.neu.ProductionOrder;
import com.ibsys.scs.services.neu.ProductionOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.PRODUCTION_ORDERS)
public class ProductionOrderController {

    private final ProductionOrderService productionOrderService;

    @GetMapping
    List<ProductionOrder> findAll() {
        return productionOrderService.findAll();
    }

    @PostMapping
    void createMany(@RequestBody final List<ProductionOrderDto> productionOrderDtoList) {
        productionOrderService.createMany(productionOrderDtoList);
    }

    @PutMapping
    void update(@RequestBody final ProductionOrder productionOrder) {
        productionOrderService.update(productionOrder);
    }
}
