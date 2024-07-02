package com.ibsys.scs.entities.neu;

import com.ibsys.scs.dto.neu.WaitingliststockWaitinglistDTO;
import lombok.*;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WaitingListStockWorkPlaceDto {
    private List<WaitingliststockWaitinglistDTO> waitinglist;
    private int id;
    private int timeneed;
}
