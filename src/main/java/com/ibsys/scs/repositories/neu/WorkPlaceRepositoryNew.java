package com.ibsys.scs.repositories.neu;

import com.ibsys.scs.entities.neu.WorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkPlaceRepositoryNew extends JpaRepository<WorkPlace, Integer> {
}
