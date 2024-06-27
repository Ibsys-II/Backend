package com.ibsys.scs.controllers.neu;

import com.ibsys.scs.controllers.ApiRoutes;
import com.ibsys.scs.entities.neu.SaleAndProductionProgram;
import com.ibsys.scs.services.neu.SaleAndProductionProgramService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(ApiRoutes.SALE_AND_PRODUCTION_PROGRAM)
public class SaleAndProductionProgramController {

    private final SaleAndProductionProgramService saleAndProductionProgramService;

    @GetMapping
    List<SaleAndProductionProgram> findAll() {
        return saleAndProductionProgramService.findAll();
    }

    @PutMapping
    void update(@RequestBody final List<SaleAndProductionProgram> saleAndProductionProgramDtoList) {
        saleAndProductionProgramService.update(saleAndProductionProgramDtoList);
    }
}
