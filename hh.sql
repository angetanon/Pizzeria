-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           10.1.30-MariaDB - mariadb.org binary distribution
-- SE du serveur:                Win32
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Export de la structure de la base pour pizzeria
DROP DATABASE IF EXISTS `pizzeria`;
CREATE DATABASE IF NOT EXISTS `pizzeria` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pizzeria`;

-- Export de la structure de la table pizzeria. pizza
DROP TABLE IF EXISTS `pizza`;
CREATE TABLE IF NOT EXISTS `pizza` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CODE` varchar(40) NOT NULL,
  `LIBELLE` varchar(40) NOT NULL,
  `PRIX` decimal(10,0) NOT NULL,
  `CATEGORIE_PIZZA` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Export de données de la table pizzeria.pizza : ~2 rows (environ)
/*!40000 ALTER TABLE `pizza` DISABLE KEYS */;
INSERT INTO `pizza` (`ID`, `CODE`, `LIBELLE`, `PRIX`, `CATEGORIE_PIZZA`) VALUES
	(1, 'dhh', 'heh', 55, 'VIANDE'),
	(2, 'RG', 'RGGH', 157, 'POISSON');
/*!40000 ALTER TABLE `pizza` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
