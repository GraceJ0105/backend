package com.bngcalculator.controller;

import com.bngcalculator.baseline.BaselineRequest;
import com.bngcalculator.service.BaselineCalculationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BaselineController {

    private final Logger logger = LoggerFactory.getLogger(BaselineController.class);

    @Autowired
    private BaselineCalculationService service;

    @PostMapping("/distinctivenessScore")
    public ResponseEntity<?> getDistinctiveness(@RequestBody BaselineRequest request) {
        String broadHabitat = request.getBroadHabitat();
        String habitatType = request.getHabitatType();

        Object response = service.findDistinctiveness(broadHabitat, habitatType);

        logger.info("Response being returned: {}", response);

        return (ResponseEntity<?>) response;
    }
}
