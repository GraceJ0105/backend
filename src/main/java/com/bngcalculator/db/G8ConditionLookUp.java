package com.bngcalculator.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="g8_condition_lookup")
public class G8ConditionLookUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g8_id")
    private Integer g8Id;

    @Column(name = "broad_habitat")
    private String broadHabitat;

    @Column(name = "habitat_type")
    private String habitatType;

    @Column(name = "good")
    private Double good;

    @Column(name = "fairly_good")
    private Double fairlyGood;

    @Column(name = "moderate")
    private Double moderate;

    @Column(name = "fairly_poor")
    private Double fairly_poor;

    @Column(name = "poor")
    private Double poor;

    @Column(name = "condition_assessment_na")
    private Double condition_assessment_na;

    @Column(name = "na_other")
    private Double na_other;

}
