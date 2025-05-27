package com.bngcalculator.db;

import org.springframework.stereotype.Component;

import java.sql.*;
@Component
public class G8ConditionLookUpRepository {

    public Double getConditionScore(String broadHabitat, String habitatType, String condition) {
        Double conditionScore = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Condition format received: " + condition);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bng_assessment", "root", "password");

            if (con != null) {
                // Make sure the condition column is valid if dynamic
                String selectQuery = "SELECT `" + condition + "` FROM g8_condition_lookup WHERE broad_habitat = ? AND habitat_type = ?";
                PreparedStatement preparedStatement = con.prepareStatement(selectQuery);
                System.out.println("Condition format received: " + condition);


                preparedStatement.setString(1, broadHabitat);
                preparedStatement.setString(2, habitatType);

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    conditionScore = resultSet.getDouble(condition);
                    System.out.println("Habitat: " + habitatType + ", condition score: " + conditionScore);
                }
            } else {
                System.out.println("Database not connected.");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return conditionScore;
    }

}
