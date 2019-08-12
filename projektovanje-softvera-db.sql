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
  `regBrVozila` varchar(45) NOT NULL,
  PRIMARY KEY (`idFirme`,`rbPosla`,`idPrevoznika`,`regBrVozila`),
  KEY `Posao_Anganzman_FK_idx` (`rbPosla`),
  KEY `Vozilo_Anganzman_FK_idx` (`regBrVozila`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anganzman`
--

LOCK TABLES `anganzman` WRITE;
/*!40000 ALTER TABLE `anganzman` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `firma`
--

LOCK TABLES `firma` WRITE;
/*!40000 ALTER TABLE `firma` DISABLE KEYS */;
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
  `mestoUtovaraId` int(11) NOT NULL,
  `mestoIstovaraId` int(11) NOT NULL,
  `opis` varchar(140) DEFAULT NULL,
  PRIMARY KEY (`rbPosla`,`idFirme`),
  KEY `Mesto_utovara_FK_idx` (`mestoUtovaraId`),
  KEY `Mesto_istovara_FK_idx` (`mestoIstovaraId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posao`
--

LOCK TABLES `posao` WRITE;
/*!40000 ALTER TABLE `posao` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prevoznik`
--

LOCK TABLES `prevoznik` WRITE;
/*!40000 ALTER TABLE `prevoznik` DISABLE KEYS */;
/*!40000 ALTER TABLE `prevoznik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vozilo`
--

DROP TABLE IF EXISTS `vozilo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vozilo` (
  `idFirme` int(11) NOT NULL,
  `regBr` varchar(45) NOT NULL,
  PRIMARY KEY (`idFirme`,`regBr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vozilo`
--

LOCK TABLES `vozilo` WRITE;
/*!40000 ALTER TABLE `vozilo` DISABLE KEYS */;
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

-- Dump completed on 2019-08-13  1:25:20
