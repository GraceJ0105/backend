package com.bngcalculator.baseline;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BaselineRequest {

    private String broadHabitat;
    private String habitatType;
    private double baselineAreaValue;
    private String condition;
    private String strategicSignificance;

}
