package com.ibsys.scs.services.neu;

import com.ibsys.scs.entities.neu.SaleAndProductionProgram;
import com.ibsys.scs.repositories.neu.SaleAndProductionProgramRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SaleAndProductionProgramService {

    private final SaleAndProductionProgramRepository saleAndProductionProgramRepository;
    private final ProductionOrderService productionOrderService;

    public List<SaleAndProductionProgram> findAll() {
        return saleAndProductionProgramRepository.findAll();
    }

    public void update(final List<SaleAndProductionProgram> saleAndProductionProgramList) {
        saleAndProductionProgramRepository.saveAll(saleAndProductionProgramList);
        productionOrderService.updateProductionOrderOfAllArticles();
    }
}
