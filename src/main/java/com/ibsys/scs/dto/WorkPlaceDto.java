package com.ibsys.scs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibsys.scs.entities.WorkPlace;

public record WorkPlaceDto(
        Integer idFromXml,
        Integer period,
        //@JsonProperty("setupevents")
        Integer setupEvents,
        //@JsonProperty("idletime")
        Integer idleTime,
        //@JsonProperty("wageidletimecosts")
        Double wageIdleTimeCosts,
        //@JsonProperty("wagecosts")
        Double wageCosts,
        //@JsonProperty("machineidletimecosts")
        Double machineIdleTimeCosts,
        // Needed for other wrapper classes
        //@JsonProperty("timeneed")
        Integer timeNeed,
        @JsonProperty("order")
        Integer appOrder,
        Integer batch,
        Integer item,
        Integer amount,
        Integer number,
        Boolean isMissingPart,
        Boolean isIdleTimeCosts,
        Boolean isWaitingListWorkStations,
        Boolean isWaitingListStock,
        Boolean isOrdersInWork
) {
    public WorkPlace toWorkPlace() {
        return WorkPlace.builder()
                .id(null)
                .idFromXml(idFromXml)
                .period(period)
                .setupEvents(setupEvents)
                .idleTime(idleTime)
                .wageIdleTimeCosts(wageIdleTimeCosts)
                .wageCosts(wageCosts)
                .machineIdleTimeCosts(machineIdleTimeCosts)
                .timeNeed(timeNeed)
                .appOrder(appOrder)
                .batch(batch)
                .item(item)
                .amount(amount)
                .number(number)
                .isMissingPart(isMissingPart)
                .isIdleTimeCosts(isIdleTimeCosts)
                .isWaitingListWorkStations(isWaitingListWorkStations)
                .isWaitingListStock(isWaitingListStock)
                .isOrdersInWork(isOrdersInWork)
                .build();
    }
}
