package com.ibsys.scs.dto.neu;

import com.ibsys.scs.entities.neu.ProductionOrder;

public record ProductionOrderDto(
        String article,
        Integer saleOrder,
        Integer waitingQueue,
        Integer plannedSafetyStock,
        Integer warehousePreviousPeriod,
        Integer ordersInWaitingQueue,
        Integer workInProgress,
        Integer productionOrder,
        String usedFor
) {

    public ProductionOrder toProductionOrder() {
        return ProductionOrder.builder()
                .id(null)
                .article(article)
                .saleOrder(saleOrder)
                .waitingQueue(waitingQueue)
                .plannedSafetyStock(plannedSafetyStock)
                .warehousePreviousPeriod(warehousePreviousPeriod)
                .ordersInWaitingQueue(ordersInWaitingQueue)
                .workInProgress(workInProgress)
                .productionOrder(productionOrder)
                .usedFor(usedFor)
                .build();
    }
}
