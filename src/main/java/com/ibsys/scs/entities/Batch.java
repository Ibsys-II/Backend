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
public class Batch {

    @Id
    private Integer id;

    private Integer amount;

    @JsonProperty("cycletime")
    private Integer cycleTime;

    private Double cost;

    private Integer orderFk;
}
