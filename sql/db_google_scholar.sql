
DROP DATABASE IF EXISTS `google_scholar`;

CREATE DATABASE `google_scholar`;

USE `google_scholar`;

DROP TABLE IF EXISTS `organic_results`;

CREATE TABLE `organic_results` (
  `organic_results_id` int NOT NULL,
  `position` int DEFAULT NULL,
  `result_id` varchar(45) DEFAULT NULL,
  `link` varchar(45) DEFAULT NULL,
  `snippet` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`organic_results_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

