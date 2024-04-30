package com.ibsys.scs.services;

import com.ibsys.scs.dto.AppOrderDto;
import com.ibsys.scs.entities.AppOrder;
import com.ibsys.scs.repositories.AppOrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppOrderService {

    private final AppOrderRepository appOrderRepository;

    public List<AppOrder> findOrdersByPeriod(final Integer period) {
        return appOrderRepository.findAppOrdersByPeriod(period);
    }

    public List<AppOrder> findAppOrderByIsInwardStockMovement(final Boolean isInwardStockMovement) {
        return appOrderRepository.findAppOrdersByIsInwardStockMovement(isInwardStockMovement);
    }

    public void createOrder(final AppOrderDto appOrderDto) {
        var appOrder = appOrderDto.toAppOrder();
        appOrderRepository.save(appOrder);
    }

    public void createMultipleOrders(final List<AppOrderDto> appOrderDtoList) {
        var appOrderList = appOrderDtoList.stream()
                .map(AppOrderDto::toAppOrder)
                .toList();
        appOrderRepository.saveAll(appOrderList);
    }
}
