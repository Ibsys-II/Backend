package com.ibsys.scs.entities.neu.importentities;

import com.ibsys.scs.dto.WorkPlaceDto;
import lombok.*;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class IdleTimeCostsDto {

    private List<WorkPlaceDto> workplaceDTOS;
    private SumDto sumDTO;
}
