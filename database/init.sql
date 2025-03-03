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