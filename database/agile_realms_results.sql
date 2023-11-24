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
-- Table structure for table `results`
--

DROP TABLE IF EXISTS `results`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `results` (
  `r_id` int NOT NULL,
  `s_id` int DEFAULT NULL,
  `best_result` varchar(1500) DEFAULT NULL,
  `good_result` varchar(1500) DEFAULT NULL,
  `bad_result` varchar(1500) DEFAULT NULL,
  `worst_result` varchar(1500) DEFAULT NULL,
  PRIMARY KEY (`r_id`),
  KEY `s_id` (`s_id`),
  CONSTRAINT `results_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `scenarios` (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `results`
--

LOCK TABLES `results` WRITE;
/*!40000 ALTER TABLE `results` DISABLE KEYS */;
INSERT INTO `results` VALUES (1,1,'The impromptu meeting helps the team collaboratively address the technical challenge, fostering a sense of unity. The project stays on track, and the team appreciates your quick response.','While the issue is eventually resolved, the delay in addressing it impacts the team\'s morale slightly. Some team members feel the urgency could have been better communicated.','Miscommunication leads to confusion among team members, resulting in a delay in addressing the technical challenge. The impact is felt in a slight setback in the project timeline.','Panic spreads among team members, causing a breakdown in communication. The technical challenge remains unaddressed for an extended period, significantly delaying the project. The team\'s trust in your leadership is eroded.'),(2,2,'Stakeholders leave the session feeling well-informed and confident in the team\'s progress, fostering trust and collaboration.','Stakeholders gain a solid understanding of key achievements, but some may express a desire for more detailed information. Overall, they appreciate the effort to keep them in the loop.','Delaying the detailed presentation might cause a bit of anxiety among stakeholders who were anticipating more comprehensive insights. Trust may be mildly impacted due to the delay, but the promise of a future detailed session helps mitigate concerns.','Stakeholders receive a high-level overview, leaving some questions unanswered. This may result in a sense of partial understanding and potentially cause some stakeholders to seek additional clarifications.'),(3,3,'A slight timeline extension with maintained team morale and trust, achieved through collaborative problem-solving and transparent communication.','Proactive management of a technical challenge, ensuring minimal project impact through comprehensive investigation and informed stakeholders.','Moderate project delay and team frustration resulting from a lack of transparency regarding a technical issue.','Last-minute issue revelation, substantial setbacks, and a severe erosion of team trust, highlighting the critical importance of timely communication and collaboration.');
/*!40000 ALTER TABLE `results` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-23 16:55:18
