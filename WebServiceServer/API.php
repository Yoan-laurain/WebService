<?php
require_once 'dao/param.php';
require_once 'dao/dBConnex.php';
require_once 'lib/json.php';
require_once 'lib/log.php';

// -------------------------------------------
// Redirige vers la bonne commande

if ( isset($_POST['api_key']) && $_POST["api_key"] == "43d24893a0ca4dfdacbbc6f0b3067804")
{

	if (isset($_POST['command'])) {
		// Verifie si la commande existe
		$files = scandir("dao");
		$max = count($files);
		$count = 0;
		$found = false;
		$class = "";
		while (!$found && $count < $max) {
			$dao = str_replace(".php", "", $files[$count]);
			if (method_exists($dao, $_POST['command'])) {
				$found = true;
				$class = $dao;
			} else {
				$count++;
			}
		}
		if ($found) {
			call_user_func($dao . "::" . $_POST['command']);
		} 
		else {
			log::put("Commande : '" . $_POST['command'] . "' inconnue !", "ERROR");
		}
	} 
	else {
		log::put("Aucune commande !", "ERROR");
	}

}
else
{
	log::put("Connexion sans clé API");
	return json::return("Authorization denied");
}

// -------------------------------------------
 