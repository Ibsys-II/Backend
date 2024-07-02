package com.ibsys.scs.repositories.neu;

import com.ibsys.scs.entities.neu.PurchasePartDisposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchasePartDispositionRepository extends JpaRepository<PurchasePartDisposition, Long> {
}

