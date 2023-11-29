-- MySQL dump 10.13  Distrib 8.0.34, for macos13 (arm64)
--
-- Host: localhost    Database: agile_realms
-- ------------------------------------------------------
-- Server version	8.2.0

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
INSERT INTO `scenarios` VALUES (1,'You, as the Scrum Master, have noticed that the team has been facing challenges during the Daily Scrum meetings. The team members often seem disengaged, and the discussions do not effectively address the impediments they are facing. Recognizing the need to adapt the Daily Scrum to better suit the team\'s changing needs, you decide to make adjustments.','You propose a format change in the Daily Scrum, introducing a quick round where each team member highlights the obstacles they are facing. This allows the team to collaboratively find solutions and ensures everyone is on the same page.','You organize a brief retrospective after a few Daily Scrums to gather feedback from the team. Based on their input, you make adjustments to the meeting structure, encouraging more open discussions about impediments.','Ignoring the signs of dissatisfaction, you continue with the existing Daily Scrum format, assuming that it\'s the team\'s responsibility to adapt. This results in ongoing disengagement, and team members become increasingly frustrated, impacting both morale and productivity.','Without consulting the team, you abruptly change the Daily Scrum format by adding detailed status updates for each team member. This unintentionally makes the meetings longer and more tedious, leading to decreased engagement.','SM'),(2,'In the midst of a complex software development project, you, as the Scrum Master, recognize the need to keep stakeholders well-informed about the team\'s progress. The stakeholders, including executives, clients, and decision-makers, eagerly anticipate your regular updates. You\'ve scheduled a stakeholder education session for today to discuss the project\'s current status, showcase recent accomplishments, and address any concerns they might have.','You meticulously prepare a comprehensive presentation that covers the project\'s progress, major milestones, and upcoming plans. You incorporate interactive elements, such as a live demonstration of the latest features, to keep stakeholders engaged. You actively encourage questions and discussions throughout the session.','Understanding the time constraints of stakeholders, you focus on highlighting the most significant achievements and progress. You provide a condensed overview of completed user stories, emphasizing improvements in team velocity. Towards the end, you allocate time for a brief Q&A session to address specific concerns.','Recognizing that you haven\'t gathered all the necessary metrics and updates, you decide to delay the detailed presentation to a later date. You opt to provide a brief high-level overview today and promise a more in-depth session in the near future. This may leave stakeholders with some lingering uncertainties.','Feeling pressured by time constraints, you decide to streamline the presentation, omitting some of the key metrics and interactive elements. While you still provide an overview of the project, stakeholders may feel slightly uninformed and miss out on crucial details.','SM'),(3,'You, as the Scrum Master, have been diligently working to ensure the timely completion of sprint tasks. The team is progressing well, and everyone seems focused. However, a few days before the deadline, a team member discovers a critical technical issue that could potentially delay the completion of a key user story.','Collaborate with the team to assess and address a technical issue, maintain transparency with the Product Owner, and prioritize trust, resulting in a minor delay with preserved morale.','Independently investigate, consult team experts, and keep the Product Owner informed, taking a proactive approach to minimize project impact.','Downplay the issue, solve it solo, and delay informing the Product Owner, causing frustration and a moderate project delay.','Ignore the issue, withhold information, and proceed as usual, leading to last-minute discovery, significant setbacks, and severe damage to team trust.','SM'),(4,'You, as a Project Team Member, encounter a situation where one of your tasks is stuck, and the sprint progress is at risk. The team is looking to you for a solution to keep things moving.','You proactively reach out to the team during the Daily Scrum and openly discuss the impediment. Collaboratively, the team brainstorms solutions, and together you decide on a course of action. This ensures transparency and fosters a sense of collective ownership.','You decide to directly communicate with the team, either through a dedicated Slack channel or a quick huddle. While not as collaborative as the best option, it still allows for timely problem-solving and maintains a reasonable level of transparency.','Frustrated with the stuck task, you choose to address the issue individually by finding a workaround without involving the team. This might lead to a temporary solution but lacks the collective input, potentially resulting in suboptimal outcomes.','Feeling overwhelmed by the situation, you decide to keep the task impediment to yourself, hoping it will resolve on its own. This lack of communication may lead to a delay in the sprint and negatively impact the overall team progress.','TM'),(5,'As a Project Team Member, you find yourself working on a complex task that requires collaboration with other team members.','You initiate a collaborative session during a planned team meeting or a dedicated collaboration session. You openly share your progress, discuss challenges, and seek input from other team members. This fosters a sense of teamwork and ensures that everyone is on the same page.','Recognizing the need for collaboration, you reach out to specific team members individually, discussing your progress and seeking their input. While not as inclusive as the best option, it still allows for effective collaboration and problem-solving.','Feeling confident in your abilities, you decide to continue working on the task independently without actively seeking input from others. While this may lead to progress, it misses the opportunity for collective problem-solving and leveraging diverse skills.','In an attempt to avoid bothering others, you choose to keep your progress to yourself and struggle in silence. This decision hinders collaboration and may lead to suboptimal outcomes, as others are unaware of your challenges and may not provide necessary support.','TM'),(6,'You, as a Project Team Member, are attending the Sprint Review for your current project. The team has worked hard during the sprint, and stakeholders are eagerly awaiting the demo. As the Sprint Review progresses, a stakeholder points out a critical feature missing from the demo that was promised in the sprint planning.','You immediately step in, acknowledge the omission, and explain that the feature is still in progress but will be part of the next sprint deliverables. You provide a brief overview of the work done so far and reassure stakeholders that their feedback is valued.','You calmly acknowledge the missing feature, express regret, and share a mitigation plan. You explain how the team will prioritize completing the feature in the upcoming days and ensure it is part of the next sprint. You offer to gather detailed feedback from stakeholders to refine the feature.','Feeling defensive, you dismiss the concerns of the stakeholder, stating that the feature was not critical and can be added later. You downplay its importance and shift the focus back to the completed work, potentially alienating the stakeholder and ignoring valuable feedback.','You blame another team member or a different department for the missing feature. You try to shift responsibility away from your team, creating a negative atmosphere. This not only damages team morale but also erodes trust with stakeholders.','TM');
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

-- Dump completed on 2023-11-29 12:23:43
