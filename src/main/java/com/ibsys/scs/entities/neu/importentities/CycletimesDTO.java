package com.ibsys.scs.entities.neu.importentities;

import com.ibsys.scs.dto.AppOrderDto;
import lombok.*;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CycletimesDTO {
    private Integer startedorders;
    private Integer waitingorders;
    private List<AppOrderDto> order;
}
