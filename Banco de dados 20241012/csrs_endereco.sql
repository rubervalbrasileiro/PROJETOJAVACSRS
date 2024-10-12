CREATE DATABASE  IF NOT EXISTS `csrs` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `csrs`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: csrs
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id_endereco` int NOT NULL AUTO_INCREMENT,
  `Logradouro` varchar(90) NOT NULL,
  `Complemento` varchar(45) DEFAULT NULL,
  `Bairro` varchar(90) NOT NULL,
  `Cidade` varchar(90) NOT NULL,
  `CEP` varchar(10) NOT NULL DEFAULT '53.000-000',
  `UF` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_endereco`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'Rua Franco Alameda, 25','Sitio do Picapau','Motriz','Recife','52.071-520','PE'),(2,'6ª Travessa Beijamim, 1123','4 etapa','Fragoso','Jaboatão dos Guararapes','53.402-016','PE'),(3,'Rua Real 790','5 etapa','Jardim São Paulo','Paulista','50.910-090','PE'),(4,'Rua Aurelina Dias do Nascimento 125','Ladeira do ceu','COHAB Massangano','Olinda','56.310-500','PE'),(5,'Travessa Severino Rodrigues de Vasconcelos 523','Apt 1450 bloco d','Bairro Novo do Carmelo','Camaragibe','54.762-341','PE'),(6,'Rua Sessenta Seis, 85','Jardim de Lins','Jardim Atlântico','Olinda','53.000.000','PE'),(7,'Av. Tiradentes, 1290','2 etapa',' Rio Doce','Olinda','53.000.000','PE'),(8,'Av 21 de Abril, 123','Centro','Casa Amarela','Recife','52.245-450','PE'),(9,'Av 17 de Agosto, 3058','Centro','Casa Forte','Recife','52.071-680','PE'),(10,'Rua Manoel Joaquim de Almeida 1906',' Casa de Baixo','Iputinga','Recife','50.670-370','PE');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-12 10:49:53
