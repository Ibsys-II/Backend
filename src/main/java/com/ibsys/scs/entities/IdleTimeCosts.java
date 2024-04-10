package com.ibsys.scs.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IdleTimeCosts {

    private List<WorkPlace> workPlaces;

    // TODO: "sum" hier später rechnen !!!
}
