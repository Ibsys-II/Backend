package com.ibsys.scs.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkPlace {

    @Id
    private Integer id;

    private Integer period;

    @JsonProperty("order")
    private Integer appOrder;

    private Integer batch;

    private Integer item;

    private Integer amount;

    @JsonProperty("setupevents")
    private Integer setupEvents;

    @JsonProperty("idletime")
    private Integer idleTime;

    @JsonProperty("wageidletimecosts")
    private Double wageIdleTimeCosts;

    @JsonProperty("wagecosts")
    private Double wageCosts;

    @JsonProperty("machineidletimecosts")
    private Double machineIdleTimeCosts;

    // Needed for other wrapper classes
    @JsonProperty("timeneed")
    private Integer timeNeed;

    private Integer missingPartFk;
}
