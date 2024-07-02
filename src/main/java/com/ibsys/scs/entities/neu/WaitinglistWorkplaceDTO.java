package com.ibsys.scs.entities.neu;

import com.ibsys.scs.entities.neu.WorkPlace;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WaitinglistWorkplaceDTO {

    private int period;
    private int order;
    private int firstbatch;
    private int lastbatch;
    private int item;
    private int amount;
    private String timeneed;
    private WorkPlace workplace;

    public WaitingListWorkPlace toWaitinglistWorkplace() {
        return WaitingListWorkPlace.builder()
                .period(period)
                .order(order)
                .firstbatch(firstbatch)
                .lastbatch(lastbatch)
                .item(item)
                .amount(amount)
                .timeneed(Integer.parseInt(timeneed))
                .workplace(workplace)
                .build();
    }
}
