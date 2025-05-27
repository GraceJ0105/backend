CREATE DATABASE IF NOT EXISTS bng_assessment;

USE bng_assessment;

CREATE TABLE g1_all_habitats (
                              g1_id bigint NOT NULL AUTO_INCREMENT,
                              broad_habitat varchar(60) NOT NULL,
                              habitat_type varchar(60) NOT NULL,
                              distinctiveness_category varchar(20) NOT NULL,
                              distinctiveness_score int NOT NULL,
                              PRIMARY KEY (g1_id)
);

INSERT INTO g1_all_habitats (broad_habitat, habitat_type, distinctiveness_category, distinctiveness_score) VALUES
                                                                                                               ('Cropland', 'Arable field margins cultivated annually', 'Medium', 4),
                                                                                                               ('Cropland', 'Arable field margins game bird mix', 'Medium', 4),
                                                                                                               ('Cropland', 'Arable field margins pollen and nectar', 'Medium', 4),
                                                                                                               ('Cropland', 'Arable field margins tussocky', 'Medium', 4),
                                                                                                               ('Cropland', 'Cereal crops', 'Low', 2),
                                                                                                               ('Cropland', 'Winter stubble', 'Low', 2),
                                                                                                               ('Cropland', 'Horticulture', 'Low', 2),
                                                                                                               ('Cropland', 'Intensive orchards', 'Low', 2),
                                                                                                               ('Cropland', 'Non-cereal crops', 'Low', 2),
                                                                                                               ('Cropland', 'Temporary grass and clover leys', 'Low', 2),
                                                                                                               ('Grassland', 'Traditional orchards', 'High', 6),
                                                                                                               ('Grassland', 'Bracken', 'Low', 2),
                                                                                                               ('Grassland', 'Floodplain wetland mosaic and CFGM', 'High', 6),
                                                                                                               ('Grassland', 'Lowland calcareous grassland', 'High', 6),
                                                                                                               ('Grassland', 'Lowland dry acid grassland', 'V.High', 8),
                                                                                                               ('Grassland', 'Lowland meadows', 'V.High', 8),
                                                                                                               ('Grassland', 'Modified grassland', 'Low', 2),
                                                                                                               ('Grassland', 'Other lowland acid grassland', 'Medium', 4),
                                                                                                               ('Grassland', 'Other neutral grassland', 'Medium', 4),
                                                                                                               ('Grassland', 'Tall herb communities (H6430)', 'High', 6),
                                                                                                               ('Grassland', 'Upland acid grassland', 'Medium', 4),
                                                                                                               ('Grassland', 'Upland calcareous grassland', 'High', 6),
                                                                                                               ('Grassland', 'Upland hay meadows', 'V.High', 8);


CREATE TABLE g8_condition_lookup (
                                 g8_id bigint NOT NULL AUTO_INCREMENT,
                                 broad_habitat varchar(60) NOT NULL,
                                 habitat_type varchar(60) NOT NULL,
                                 good DOUBLE NULL,
                                 fairly_good DOUBLE NULL,
                                 moderate DOUBLE NULL,
                                 fairly_poor DOUBLE NULL,
                                 poor DOUBLE NULL,
                                 condition_assessment_na DOUBLE NULL,
                                 na_other DOUBLE NULL,
                                 PRIMARY KEY (g8_id)
);

INSERT INTO g8_condition_lookup (
    broad_habitat, habitat_type, good, fairly_good, moderate, fairly_poor, poor, condition_assessment_na, na_other
) VALUES
      ('Cropland', 'Arable field margins cultivated annually', null, null, null, null, null, 1, null),
      ('Cropland', 'Arable field margins game bird mix', null, null, null, null, null, 1, null),
      ('Cropland', 'Arable field margins pollen and nectar', null, null, null, null, null, 1, null),
      ('Cropland', 'Arable field margins tussocky', null, null, null, null, null, 1, null),
      ('Cropland', 'Cereal crops', null, null, null, null, null, 1, null),
      ('Cropland', 'Winter stubble', null, null, null, null, null, 1, null),
      ('Cropland', 'Horticulture', null, null, null, null, null, 1, null),
      ('Cropland', 'Intensive orchards', null, null, null, null, null, 1, null),
      ('Cropland', 'Noncereal crops', null, null, null, null, null, 1, null),
      ('Cropland', 'Temporary grass and clover leys', null, null, null, null, null, 1, null),
      ('Grassland', 'Traditional orchards', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Bracken', null, null, null, null, null, 1, null),
      ('Grassland', 'Floodplain wetland mosaic and CFGM', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Lowland calcareous grassland', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Lowland dry acid grassland', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Lowland meadows', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Modified grassland', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Other lowland acid grassland', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Other neutral grassland', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Tall herb communities (H6430)', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Upland acid grassland', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Upland calcareous grassland', 3, 2.5, 2, 1.5, 1, null, null),
      ('Grassland', 'Upland hay meadows', 3, 2.5, 2, 1.5, 1, null, null);
