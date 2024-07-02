package com.ibsys.scs.entities.neu.importentities;

import com.ibsys.scs.entities.neu.WaitinglistWorkplaceDTO;
import com.ibsys.scs.entities.neu.WorkPlace;
import lombok.*;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WorkPlaceDto {
    private int id;
    private int setupevents;
    private int idletime;
    private String wageidletimecosts;
    private String wagecosts;
    private String machineidletimecosts;
    private String timeneed;
    private List<WaitinglistWorkplaceDTO> waitinglist;
    private int period;
    private int order;
    private int batch;
    private int item;
    private int amount;

    public WorkPlace toWorkPlace() {
        return WorkPlace.builder()
                .id(id)
                .setupevent(setupevents)
                .idletime(idletime)
                .wageidletimecosts(wageidletimecosts)
                .wagecosts(wagecosts)
                .machineidletimecosts(machineidletimecosts)
                .timeneed(Integer.parseInt(timeneed))
                .period(period)
                .orderNumber(order)
                .batch(batch)
                .item(item)
                .amount(amount)
                .build();
    }
}
