package com.ibsys.scs.repositories.neu;

import com.ibsys.scs.entities.neu.Vertriebswunsch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VertriebswunschRepository extends JpaRepository<Vertriebswunsch, UUID> {
}
