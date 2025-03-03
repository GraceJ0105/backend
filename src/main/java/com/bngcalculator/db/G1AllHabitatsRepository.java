package com.bngcalculator.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface G1AllHabitatsRepository extends JpaRepository<G1AllHabitats, Integer> {
    DistinctivenessProjection findByHabitatTypeAndBroadHabitat(String habitatType, String broadHabitat);
}
