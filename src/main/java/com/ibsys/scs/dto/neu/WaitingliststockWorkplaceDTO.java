package com.ibsys.scs.dto.neu;

import lombok.*;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WaitingliststockWorkplaceDTO {
    private List<WaitingliststockWaitinglistDTO> waitinglist;
    private int id;
    private int timeneed;
}