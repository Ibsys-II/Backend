package com.ibsys.scs.repositories;

import com.ibsys.scs.entities.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer> {

    List<Batch> findBatchesByItemNumber(final Integer itemNumber);
}
