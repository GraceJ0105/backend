package com.bngcalculator.baseline;

public class BaselineCaculation {

    public double findStrategicMultiplier(String strategicSignificance){
        double strategicMultiplier;
        switch (strategicSignificance){
            case "High":
                strategicMultiplier = 1.15;
                break;
            case "Medium":
                strategicMultiplier = 1.1;
                break;
            case "Low":
                strategicMultiplier = 1;
                break;
            default:
                strategicMultiplier = 0;
                break;
        }
        return strategicMultiplier;
    }
}
