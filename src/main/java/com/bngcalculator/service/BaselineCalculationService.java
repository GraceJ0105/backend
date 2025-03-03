package com.bngcalculator.service;

import com.bngcalculator.db.DistinctivenessProjection;
import com.bngcalculator.db.G1AllHabitatsRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;


@RequiredArgsConstructor
@Service
public class BaselineCalculationService {

    private final Logger logger = LoggerFactory.getLogger(BaselineCalculationService.class);

    @Autowired
    private G1AllHabitatsRepository repository;

    public ResponseEntity<?> findDistinctiveness(String broadHabitat, String habitatType) {
        logger.info("Finding distinctiveness for habitatType: {}", habitatType);

        try {

            DistinctivenessProjection result = repository.findByHabitatTypeAndBroadHabitat(habitatType, broadHabitat);
            String distinctivenessCategory = result.getDistinctivenessCategory();
            Integer distinctivenessScore = result.getDistinctivenessScore();

            logger.info("Distinctiveness Score is: {} & Distinctiveness Catergory is {} ", distinctivenessScore, distinctivenessCategory);
            Map<String, Object> response = new LinkedHashMap<>();
            response.put("distinctivenessCategory", distinctivenessCategory);
            response.put("distinctivenessScore", distinctivenessScore);

            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (DataAccessException e) {
            logger.error("Database connectivity error: {}", e.getMessage());
            return new ResponseEntity<>("Failed to connect to database and retrieve distinctiveness values" + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
