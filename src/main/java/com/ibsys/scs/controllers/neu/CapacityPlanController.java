package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.entities.neu.CapacityPlan;
import com.ibsys.scs.services.neu.CapacityPlanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.CAPACITY_PLAN)
public class CapacityPlanController {

    private CapacityPlanService capacityPlanService;

    @GetMapping
    List<CapacityPlan> findAll() {
        return capacityPlanService.findAll();
    }
}
