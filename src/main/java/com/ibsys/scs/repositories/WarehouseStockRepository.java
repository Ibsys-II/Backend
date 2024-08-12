package com.ibsys.scs.repositories;

import com.ibsys.scs.entities.WarehouseStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WarehouseStockRepository extends JpaRepository<WarehouseStock, Integer> {
    List<WarehouseStock> findWarehouseStocksByPeriod(final Integer period);

    Optional<WarehouseStock> findByArticleId(final Integer articleId);
}
