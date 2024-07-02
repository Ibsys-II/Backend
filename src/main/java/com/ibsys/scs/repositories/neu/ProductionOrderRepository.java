package com.ibsys.scs.repositories.neu;

import com.ibsys.scs.entities.neu.ProductionOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductionOrderRepository extends JpaRepository<ProductionOrder, UUID> {

    ProductionOrder findByUsedForAndArticleNumber(final String usedFor, final Integer articleNumber);

    List<ProductionOrder> findByArticleNumber(final Integer articleNumber);
}
