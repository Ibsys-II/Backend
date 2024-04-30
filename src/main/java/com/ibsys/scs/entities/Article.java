package com.ibsys.scs.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // TODO: Remove. Not Master data
    private Double amount;

    // Bezeichnung des Artikels
    private String number;

    private String description;

    // Produkt bei dem der Artikel verwendet wird.
    private String usedFor;

    //@JsonProperty("startamount")
    private Double startAmount;

    // TODO: What is this ??? Ask Robert
    //  Remove if not master data
    private Double pct;

    private Double price;

    // TODO: Remove. Not Master data
    //@JsonProperty("stockvalue")
    private Double stockValue;
}
