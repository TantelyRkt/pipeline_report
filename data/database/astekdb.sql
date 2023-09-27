-- --------------------------------------------------------
-- Hôte:                         127.0.0.1
-- Version du serveur:           5.7.40 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             12.5.0.6677
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Listage de la structure de la base pour astek
DROP DATABASE IF EXISTS `astek`;
CREATE DATABASE IF NOT EXISTS `astek` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `astek`;

-- Listage de la structure de la table astek. country
DROP TABLE IF EXISTS `country`;
CREATE TABLE IF NOT EXISTS `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country_code` varchar(4) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `region` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `country_code` (`country_code`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Listage des données de la table astek.country : 0 rows
DELETE FROM `country`;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
/*!40000 ALTER TABLE `country` ENABLE KEYS */;

-- Listage de la structure de la table astek. indicator
DROP TABLE IF EXISTS `indicator`;
CREATE TABLE IF NOT EXISTS `indicator` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `indicator_code` varchar(50) DEFAULT NULL,
  `indicator` varchar(255) DEFAULT NULL,
  `active_onreport` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `indicator_code` (`indicator_code`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Listage des données de la table astek.indicator : 0 rows
DELETE FROM `indicator`;
/*!40000 ALTER TABLE `indicator` DISABLE KEYS */;
/*!40000 ALTER TABLE `indicator` ENABLE KEYS */;

-- Listage de la structure de la table astek. report
DROP TABLE IF EXISTS `report`;
CREATE TABLE IF NOT EXISTS `report` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_indicator` int(11) DEFAULT NULL,
  `id_year` int(11) DEFAULT NULL,
  `id_country` int(11) DEFAULT NULL,
  `value` bigint(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_indicator_id_year_id_country_value` (`id_indicator`,`id_year`,`id_country`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Listage des données de la table astek.report : 0 rows
DELETE FROM `report`;
/*!40000 ALTER TABLE `report` DISABLE KEYS */;
/*!40000 ALTER TABLE `report` ENABLE KEYS */;

-- Listage de la structure de la vue astek. report_vw
DROP VIEW IF EXISTS `report_vw`;
-- Création d'une table temporaire pour palier aux erreurs de dépendances de VIEW
CREATE TABLE `report_vw` (
	`country` VARCHAR(255) NULL COLLATE 'utf8_general_ci',
	`country_code` VARCHAR(4) NULL COLLATE 'utf8_general_ci',
	`region` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`indicator` VARCHAR(255) NULL COLLATE 'utf8_general_ci',
	`indicator_code` VARCHAR(50) NULL COLLATE 'utf8_general_ci',
	`value_a` BIGINT(255) NOT NULL,
	`value_am1` BIGINT(255) NOT NULL,
	`year` VARCHAR(4) NULL COLLATE 'utf8_general_ci',
	`previous_year` DOUBLE NULL
) ENGINE=MyISAM;

-- Listage de la structure de la table astek. year
DROP TABLE IF EXISTS `year`;
CREATE TABLE IF NOT EXISTS `year` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `year` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `year` (`year`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Listage des données de la table astek.year : 0 rows
DELETE FROM `year`;
/*!40000 ALTER TABLE `year` DISABLE KEYS */;
/*!40000 ALTER TABLE `year` ENABLE KEYS */;

-- Listage de la structure de la vue astek. report_vw
DROP VIEW IF EXISTS `report_vw`;
-- Suppression de la table temporaire et création finale de la structure de VIEW
DROP TABLE IF EXISTS `report_vw`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `report_vw` AS select `c`.`country` AS `country`,`c`.`country_code` AS `country_code`,`c`.`region` AS `region`,`i`.`indicator` AS `indicator`,`i`.`indicator_code` AS `indicator_code`,ifnull(`r`.`value`,0) AS `value_a`,ifnull(`r2`.`value`,0) AS `value_am1`,`y`.`year` AS `year`,(`y`.`year` - 1) AS `previous_year` from ((((`report` `r` left join `indicator` `i` on((`r`.`id_indicator` = `i`.`id`))) left join `country` `c` on((`r`.`id_country` = `c`.`id`))) left join `year` `y` on((`r`.`id_year` = `y`.`id`))) left join `report` `r2` on(((`r`.`id_indicator` = `r2`.`id_indicator`) and (`r`.`id_country` = `r2`.`id_country`) and (`r2`.`id_year` = (select `year`.`id` from `year` where (`year`.`year` = (`y`.`year` - 1))))))) order by `y`.`year` desc,`i`.`indicator`,ifnull(`r`.`value`,0) desc;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
