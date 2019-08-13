CREATE DATABASE  IF NOT EXISTS `db-prevoznici` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db-prevoznici`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db-prevoznici
-- ------------------------------------------------------
-- Server version	5.7.26

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
-- Table structure for table `anganzman`
--

DROP TABLE IF EXISTS `anganzman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `anganzman` (
  `idFirme` int(11) NOT NULL,
  `rbPosla` int(11) NOT NULL,
  `idPrevoznika` int(11) NOT NULL,
  `regBr` varchar(45) NOT NULL,
  PRIMARY KEY (`idFirme`,`rbPosla`,`idPrevoznika`,`regBr`),
  KEY `Posao_Anganzman_FK_idx` (`rbPosla`),
  KEY `Vozilo_Anganzman_FK_idx` (`regBr`),
  KEY `fk_3_idx` (`idPrevoznika`),
  CONSTRAINT `id_firme_fk_1` FOREIGN KEY (`idFirme`) REFERENCES `firma` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `id_prevoznika_fk_1` FOREIGN KEY (`idPrevoznika`) REFERENCES `prevoznik` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `rb_posla_fk_1` FOREIGN KEY (`rbPosla`) REFERENCES `posao` (`rbPosla`) ON UPDATE CASCADE,
  CONSTRAINT `reg_br_fk_1` FOREIGN KEY (`regBr`) REFERENCES `vozilo` (`regBr`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anganzman`
--

LOCK TABLES `anganzman` WRITE;
/*!40000 ALTER TABLE `anganzman` DISABLE KEYS */;
INSERT INTO `anganzman` VALUES (2,1,1,'BG-123-AS'),(2,1,1,'NS-321-XY');
/*!40000 ALTER TABLE `anganzman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `firma`
--

DROP TABLE IF EXISTS `firma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `firma` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `lozinka` varchar(45) NOT NULL,
  `naziv` varchar(45) NOT NULL,
  `aktivan` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `firma`
--

LOCK TABLES `firma` WRITE;
/*!40000 ALTER TABLE `firma` DISABLE KEYS */;
INSERT INTO `firma` VALUES (1,'office@drvopromet.rs','agr0pr0m','Agro Promet Zitoradja',1),(2,'mesara@ikonic.rs','krm3n4dl3','Mesara Ikonic',1);
/*!40000 ALTER TABLE `firma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mesto`
--

DROP TABLE IF EXISTS `mesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mesto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mesto`
--

LOCK TABLES `mesto` WRITE;
/*!40000 ALTER TABLE `mesto` DISABLE KEYS */;
INSERT INTO `mesto` VALUES (1,'Beograd'),(2,'Nis'),(3,'Kragujevac'),(4,'Kraljevo'),(5,'Uzice'),(6,'Cacak'),(7,'Novi Sad'),(8,'Backa Topola'),(9,'Zajecar'),(10,'Subotica'),(11,'Zrenjanin'),(12,'Bor'),(13,'Pirot'),(14,'Negotin');
/*!40000 ALTER TABLE `mesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `posao`
--

DROP TABLE IF EXISTS `posao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `posao` (
  `rbPosla` int(11) NOT NULL AUTO_INCREMENT,
  `idFirme` int(11) NOT NULL,
  `cena` int(11) NOT NULL,
  `datumUtovara` datetime NOT NULL,
  `datumIstovara` datetime NOT NULL,
  `mestoUtovara` int(11) NOT NULL,
  `mestoIstovara` int(11) NOT NULL,
  `opis` varchar(140) DEFAULT NULL,
  `brojVozila` int(11) DEFAULT NULL,
  PRIMARY KEY (`rbPosla`,`idFirme`),
  KEY `Mesto_utovara_FK_idx` (`mestoUtovara`),
  KEY `Mesto_istovara_FK_idx` (`mestoIstovara`),
  KEY `id_firme_fk_idx` (`idFirme`),
  CONSTRAINT `id_firme_fk` FOREIGN KEY (`idFirme`) REFERENCES `firma` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `mesto_istovara_id` FOREIGN KEY (`mestoIstovara`) REFERENCES `mesto` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `mesto_utovara_fk` FOREIGN KEY (`mestoUtovara`) REFERENCES `mesto` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posao`
--

LOCK TABLES `posao` WRITE;
/*!40000 ALTER TABLE `posao` DISABLE KEYS */;
INSERT INTO `posao` VALUES (1,2,20000,'2019-08-08 00:00:00','2019-09-09 00:00:00',1,14,'Prevoz krmenadli',2);
/*!40000 ALTER TABLE `posao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prevoznik`
--

DROP TABLE IF EXISTS `prevoznik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prevoznik` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `lozinka` varchar(45) NOT NULL,
  `naziv` varchar(45) NOT NULL,
  `aktivan` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prevoznik`
--

LOCK TABLES `prevoznik` WRITE;
/*!40000 ALTER TABLE `prevoznik` DISABLE KEYS */;
INSERT INTO `prevoznik` VALUES (1,'office@munjatrans.rs','munj4trans','Munja Trans',1);
/*!40000 ALTER TABLE `prevoznik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vozilo`
--

DROP TABLE IF EXISTS `vozilo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vozilo` (
  `idPrevoznika` int(11) NOT NULL,
  `regBr` varchar(45) NOT NULL,
  PRIMARY KEY (`idPrevoznika`,`regBr`),
  UNIQUE KEY `regBr_UNIQUE` (`regBr`),
  CONSTRAINT `id_prevoznika_fk` FOREIGN KEY (`idPrevoznika`) REFERENCES `prevoznik` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vozilo`
--

LOCK TABLES `vozilo` WRITE;
/*!40000 ALTER TABLE `vozilo` DISABLE KEYS */;
INSERT INTO `vozilo` VALUES (1,'BG-123-AS'),(1,'BG-444-FF'),(1,'NI-381-AF'),(1,'NS-321-XY');
/*!40000 ALTER TABLE `vozilo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-13 22:35:17
