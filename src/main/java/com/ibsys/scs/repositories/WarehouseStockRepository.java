package com.ibsys.scs.repositories;

import com.ibsys.scs.entities.WarehouseStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseStockRepository extends JpaRepository<WarehouseStock, Integer> {
    List<WarehouseStock> findWarehouseStocksByPeriod(final Integer period);
}
