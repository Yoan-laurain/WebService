-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : jeu. 19 mai 2022 à 13:59
-- Version du serveur : 8.0.29
-- Version de PHP : 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `webservice_cours`
--

-- --------------------------------------------------------

--
-- Structure de la table `personnages`
--

CREATE TABLE `personnages` (
  `id` int NOT NULL,
  `nom` varchar(50) NOT NULL,
  `lienImage` varchar(255) NOT NULL,
  `descriptionPersonnage` varchar(2000) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personnages`
--

INSERT INTO `personnages` (`id`, `nom`, `lienImage`, `descriptionPersonnage`) VALUES
(1, 'Crunch', 'http://api.sudododevelopers.xyz:2525/pictures/Crunch.png', 'Created for the Omeda City military, Crunch was sent to the junkyard when newer biotech androids took his place. After months in rest mode, Crunch followed the sounds of battle to an underground fighting ring, started punching, and became an immediate hit with the crowd'),
(2, 'Wukong', 'http://api.sudododevelopers.xyz:2525/pictures/Wukong.png', 'A legend from another universe, Wukong transcended time and space to land in Letha, where he found Feng Mao, an old man and former First Guardian of Changdi, to be a delightful candidate for mischief. After Feng Mao managed to trap Wukong in a cave, Wukong decided to follow him around for a bit longer.'),
(3, 'Gideon', 'http://api.sudododevelopers.xyz:2525/pictures/Gideon.png', 'As the heir to Tryon Industries, Gideon always believed in his own destiny. After funding Dr. Dekker’s research into the Ashur’s ancient civilization, Gideon broke into an Ashurite temple, unsealed the first portal to Agora, and was granted the power of the stars'),
(4, 'Sevarog', 'http://api.sudododevelopers.xyz:2525/pictures/Sevarog.png', 'A former godlike Ashur, Sevarog was cast out of Agora thousands of years ago and no longer remembers who he used to be. Now, he is gathering a team of chosen souls to replace the Ashurite pantheon and usher in an apocalypse'),
(5, 'Kallari', 'http://api.sudododevelopers.xyz:2525/pictures/Kallari.png', 'Once human, Kallari was repurposed by the Echelon Program to be the perfect synthetic assassin. When the program was shut down, Kallari was ordered to clean up all the scientists involved, and she did her job almost flawlessly—only the lead scientist, Emeritus, escaped'),
(6, 'GRIM.exe', 'http://api.sudododevelopers.xyz:2525/pictures/GRIM_exe.png', 'After stowing away on a ship to Omeda City, the gremlin Grim was picked up by the Ying Mei Cartel and used as a mascot. He won EXE in a bone dice game, and everything changed—he was no longer a mascot of the criminal underworld, but a killing machine');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `personnages`
--
ALTER TABLE `personnages`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `personnages`
--
ALTER TABLE `personnages`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
