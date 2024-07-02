package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.entities.neu.CapacityPlanSumUp;
import com.ibsys.scs.services.neu.CapacityPlanSumUpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.CAPACITY_PLAN_SUM_UP)
public class CapacityPlanSumUpController {

    private final CapacityPlanSumUpService capacityPlanSumUpService;

    @GetMapping
    List<CapacityPlanSumUp> findAll() {
        return capacityPlanSumUpService.findAll();
    }
}
