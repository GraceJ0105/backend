package com.bngcalculator.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="g1_all_habitats")
public class G1AllHabitats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g1_id")
    private Integer g1Id;

    @Column(name = "broad_habitat")
    private String broadHabitat;

    @Column(name = "habitat_type")
    private String habitatType;

    @Column(name = "distinctiveness_category")
    private String distinctivenessCategory;

    @Column(name = "distinctiveness_score")
    private Integer distinctivenessScore;

}
