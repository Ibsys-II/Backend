package com.ibsys.scs.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Lager
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseStock {

    private List<Article> articles;

    @JsonProperty("totalstockvalue")
    private Double totalStockValue;
}
