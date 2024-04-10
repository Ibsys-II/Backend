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
public class Order {

    @Id
    private Integer id;

    private Integer period;

    private Integer item;

    private Integer quantity;

    private Double cost;

    @JsonProperty("averageunitcosts")
    private Double averageUnitCosts;

    @JsonProperty("orderperiod")
    private Integer orderPeriod;

    private Integer mode;

    private Integer article;

    private Integer amount;

    private Integer time;

    @JsonProperty("materialcosts")
    private Double materialCosts;

    @JsonProperty("ordercosts")
    private Double orderCosts;

    @JsonProperty("entirecosts")
    private Double entireCosts;

    @JsonProperty("piececosts")
    private Double pieceCosts;

    @JsonProperty("starttime")
    private String startTime;

    @JsonProperty("finishtime")
    private String finishTime;

    @JsonProperty("cycletimemin")
    private Integer cycleTimeMin;

    @JsonProperty("cycletimefactor")
    private Double cycleTimeFactor;
}
