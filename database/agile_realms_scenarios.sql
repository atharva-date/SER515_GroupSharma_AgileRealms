-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: agile_realms
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `scenarios`
--

DROP TABLE IF EXISTS `scenarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scenarios` (
  `s_id` int NOT NULL,
  `s_title` varchar(1500) DEFAULT NULL,
  `best_option` varchar(1500) DEFAULT NULL,
  `good_option` varchar(1500) DEFAULT NULL,
  `bad_option` varchar(1500) DEFAULT NULL,
  `worst_option` varchar(1500) DEFAULT NULL,
  `player` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scenarios`
--

LOCK TABLES `scenarios` WRITE;
/*!40000 ALTER TABLE `scenarios` DISABLE KEYS */;
INSERT INTO `scenarios` VALUES (1,'You, as the Scrum Master, have noticed that the team has been facing challenges during the Daily Scrum meetings. The team members often seem disengaged, and the discussions do not effectively address the impediments they are facing. Recognizing the need to adapt the Daily Scrum to better suit the team\'s changing needs, you decide to make adjustments.','You propose a format change in the Daily Scrum, introducing a quick round where each team member highlights the obstacles they are facing. This allows the team to collaboratively find solutions and ensures everyone is on the same page.','You organize a brief retrospective after a few Daily Scrums to gather feedback from the team. Based on their input, you make adjustments to the meeting structure, encouraging more open discussions about impediments.','Ignoring the signs of dissatisfaction, you continue with the existing Daily Scrum format, assuming that it\'s the team\'s responsibility to adapt. This results in ongoing disengagement, and team members become increasingly frustrated, impacting both morale and productivity.','Without consulting the team, you abruptly change the Daily Scrum format by adding detailed status updates for each team member. This unintentionally makes the meetings longer and more tedious, leading to decreased engagement.','SM');
/*!40000 ALTER TABLE `scenarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-23 15:58:53
