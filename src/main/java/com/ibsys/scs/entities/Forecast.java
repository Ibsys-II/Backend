package com.ibsys.scs.entities;

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
    private UUID id;
    private Integer p1;
    private Integer p2;
    private Integer p3;
}
