package com.ibsys.scs.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Forecast {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
    @JsonIgnore // Property wird im Json nicht auftauchen...
    private UUID id;
    // Bedarf (p1, p2, p3)
    private Integer p1;
    private Integer p2;
    private Integer p3;
}
