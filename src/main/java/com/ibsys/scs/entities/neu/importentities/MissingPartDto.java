package com.ibsys.scs.entities.neu.importentities;

import com.ibsys.scs.dto.neu.WaitingliststockWorkplaceDTO;
import com.ibsys.scs.entities.neu.WaitinglistWorkplaceDTO;
import lombok.*;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MissingPartDto {
    private Integer id;
    private List<WaitingliststockWorkplaceDTO> workplace;
}
