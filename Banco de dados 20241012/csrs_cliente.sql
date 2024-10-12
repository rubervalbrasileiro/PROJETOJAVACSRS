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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_Cliente` int NOT NULL AUTO_INCREMENT,
  `Cod_Cliente` int DEFAULT NULL,
  `Status_Cliente` enum('Ativo','Inativo','Pendente') DEFAULT NULL,
  `Nome_Cliente` varchar(255) NOT NULL,
  `Apelido_Cliente` varchar(90) DEFAULT NULL,
  `Celular` varchar(14) NOT NULL,
  `Celular_Whatsapp` varchar(14) DEFAULT NULL,
  `Data_Nasc` date DEFAULT NULL,
  `Estado_Civil` varchar(45) DEFAULT NULL,
  `Nome_Mae` varchar(255) NOT NULL,
  `Nome_Pai` varchar(255) DEFAULT NULL,
  `CPF_Cliente` varchar(20) DEFAULT NULL,
  `RG_Cliente` varchar(12) DEFAULT NULL,
  `Cartao_Sus` varchar(20) DEFAULT NULL,
  `Titulo_Eleitoral` varchar(20) DEFAULT NULL,
  `Secao_Eleitoral` varchar(5) DEFAULT NULL,
  `Zona_Eleitoral` varchar(5) DEFAULT NULL,
  `Data_Cadastro` date DEFAULT NULL,
  `Observacao` varchar(255) DEFAULT NULL,
  `id_endereco` int DEFAULT NULL,
  PRIMARY KEY (`id_Cliente`),
  UNIQUE KEY `Cod_Cliente` (`Cod_Cliente`),
  KEY `id_endereco` (`id_endereco`),
  CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id_endereco`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,1,'Ativo','Rubinho Cruz','Binho','081.9633-5654','081.9633-3354','1975-12-25','Casado','Maria dos Ajos','PAOLO RIBEIRO SILVA','22367513425','45.623.109-7','54342455986','235.282.262.769','254','010','2023-05-18','doc pendentes',1),(2,2,'Ativo','Thiago Xavier de Carrara','thi','081.93646-5247','081.92195-6141','2012-04-25','Casado','Rute Valéria Espinoza de Mendonça','Camilo Ayrton Burgos Filho','18624196639','34.424.453-2','76313048237','066157580876','190','010','2023-04-21','Apresentar exames',2),(3,3,'Inativo','Jenny Sara Benites de Faro','Ny','081.92481-6638','081.92396-4361','2011-03-01','Solteira','Flaviana Corona de Grego','Benjamin Leo Bonilha Neto','151367805-17','27.370.729-2','92515566448','545065830868','255','010','2023-02-12','Retirar documentos',3),(4,4,'Pendente','Alisson Correia Sobrinho','PA','081.93375-8532','081.93816-5438','2005-04-13','Casado','Ana Luzinete Casanova Ramires','Alan Plínio Neves Sobrinho','387307906-20','13.010.222-2','77284275120','217386480825','183','010','2023-06-25','Autorizado',4),(5,5,'Inativo','Paulo Esteves da Rocha','Branco','081.92611-4665','081.93441-9374','1980-06-21','Viuvo','Tábata Taís Galindo','Noel Max de Escobar Neto','380858943-43','12.775.472-6','25073114795','662687330876','190','010','2023-06-10','fala com kelly',5),(6,6,'Pendente','Hugo Junior de Ferminiano','JR','081.93297-1965','081.93591-6512','1990-10-15','Casado','Samanta Dominato de Magalhães','Rodrigo Marinho de Alvarenga','826438322-05','11.607.755-4','23790261815','516817850809','255','010','2023-08-21','Falta',6),(7,7,'Inativo','Mariana Assunção de Corona','Mari','081.93159-0653','081.93413-8975','2012-11-05','Solteira','Mayra Mirian Batista Gil','Rodrigo Jonathas de Faro','567237872-26','26.743.592-7','42426223090','135216000817','183','010','2023-08-01','Autorizado',7),(8,8,'Pendente','Olímpia Benites Cordeiro','Oli','081.92606-0422','081.93668-1153','2018-09-08','Viuva','Ivete Galvão de Ortiz','Estevão Silvair Mendonça Filho','234156704-57','25.688.356-7','81873647506','483883173006','190','010','2023-11-18','Busca',8),(9,9,'Ativo','Eduardo Joaquim Bittencourt','Bit','081.92353-7816','081.93255-0133','2000-10-13','Casado','Charlene Lozano','Luigi Raul Madeira Filho','305671305-68','40.365.066-5','54342455986','985282262473','255','010','2023-05-10','Autorizado',9),(10,10,'Inativo','Edilene Mirian Barreto Godói','Gordo','81996335654','81996335654','1978-05-18','Divorciado','Giovana Sabrina Lacerda','Chico Bonilha de Uchoa','17784753535','19.098.199-4','75735961896','134.187.000.884','183 ','010','1978-05-18','doc pendentes',10),(11,11,'Ativo','Lois West','Cost','081.1653-5004','081.99633-3354','1980-12-08','Casado','Maria dos Ajos','PAOLO RIBEIRO SILVA','22468813425','45.623.109-7','74342245919','235.282.262.769','254','010','2023-05-18','Costuma ter habilidades para excursão de tarefas',1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-12 10:49:54
