package com.ibsys.scs.services.neu;

import com.ibsys.scs.entities.neu.CapacityPlanSumUp;
import com.ibsys.scs.repositories.neu.CapacityPlanSumUpRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CapacityPlanSumUpService {

    private final CapacityPlanSumUpRepository capacityPlanSumUpRepository;

    public List<CapacityPlanSumUp> findAll() {
        return capacityPlanSumUpRepository.findAll();
    }
}
