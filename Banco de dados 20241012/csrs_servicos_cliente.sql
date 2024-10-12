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
-- Table structure for table `servicos_cliente`
--

DROP TABLE IF EXISTS `servicos_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicos_cliente` (
  `id_Servico` int DEFAULT NULL,
  `id_Cliente` int DEFAULT NULL,
  `id_funcionario` int DEFAULT NULL,
  `Data_Servico` date DEFAULT NULL,
  `Status_Servico` enum('Concluido','Pendente','Cancelado') DEFAULT NULL,
  `Observacoes_Servico` text,
  KEY `id_Servico` (`id_Servico`),
  KEY `id_Cliente` (`id_Cliente`),
  KEY `id_funcionario` (`id_funcionario`),
  CONSTRAINT `servicos_cliente_ibfk_1` FOREIGN KEY (`id_Servico`) REFERENCES `servico` (`id_Servico`),
  CONSTRAINT `servicos_cliente_ibfk_2` FOREIGN KEY (`id_Cliente`) REFERENCES `cliente` (`id_Cliente`),
  CONSTRAINT `servicos_cliente_ibfk_3` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionario` (`id_Funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicos_cliente`
--

LOCK TABLES `servicos_cliente` WRITE;
/*!40000 ALTER TABLE `servicos_cliente` DISABLE KEYS */;
INSERT INTO `servicos_cliente` VALUES (1,1,1,'2023-01-01','Concluido','Servico Realizado Com Sucesso'),(2,2,3,'2023-02-15','Pendente','Aguardando Confirmacao'),(3,3,2,'2023-03-20','Cancelado','Cliente Desistiu do Servico'),(4,4,1,'2023-01-13','Concluido','Servico Realizado Com Sucesso'),(5,5,2,'2023-02-07','Pendente','Aguardando Confirmacao'),(6,6,1,'2023-03-17','Cancelado','Cliente Desistiu do Servico'),(7,7,3,'2023-01-08','Concluido','Servico Realizado Com Sucesso'),(8,8,3,'2023-04-18','Pendente','Aguardando Confirmacao'),(9,9,2,'2023-07-09','Cancelado','Cliente Desistiu do Servico'),(9,10,1,'2023-08-25','Concluido','Servico Realizado Com Sucesso'),(9,11,3,'2023-10-15','Pendente','Aguardando Confirmacao');
/*!40000 ALTER TABLE `servicos_cliente` ENABLE KEYS */;
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
