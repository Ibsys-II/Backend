package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.entities.neu.MaterialPlan;
import com.ibsys.scs.services.neu.MaterialPlanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.MATERIAL_PLAN)
public class MaterialPlanController {

    private final MaterialPlanService materialPlanService;

    @GetMapping
    List<MaterialPlan> findAll() {
        return materialPlanService.findAll();
    }

    @PutMapping
    void update(@RequestBody final MaterialPlan materialPlan) {
        materialPlanService.update(materialPlan);
    }
}
