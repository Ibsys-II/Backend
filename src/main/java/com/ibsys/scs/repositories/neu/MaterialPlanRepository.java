package com.ibsys.scs.repositories.neu;

import com.ibsys.scs.entities.neu.MaterialPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MaterialPlanRepository extends JpaRepository<MaterialPlan, UUID> {
}
