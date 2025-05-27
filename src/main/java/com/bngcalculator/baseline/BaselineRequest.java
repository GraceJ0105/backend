package com.bngcalculator.baseline;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class BaselineRequest {

    private String broadHabitat;
    private String habitatType;
    private double baselineAreaValue;
    private String condition;
    private String strategicSignificance;

    @Override
    public String toString() {
        return "BaselineRequest{" +
                "broadHabitat='" + broadHabitat + '\'' +
                ", habitatType=" + habitatType +
                ", condition='" + condition + '\'' +
                '}';
    }


}
