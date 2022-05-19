# WebService

# Developpeurs : Yoan LAURAIN / Nathan LESOURD / Hugo CARRICART

# Prérequis :
		# Une connexion internet
		# Un smartphone Android ou Android Studio avec émulateur


# Déploiement de l'application (Si utilisation d' Android Studio): 
		# Etape 1 : Cloner le dépôt GitHub : https://github.com/Yoan-laurain/WebService 
		# Etape 2 : Ouvrir Android Studio 
		# Etape 3 : Ouvrir le projet 
		# Etape 4 : Run de l'application ( Raccourcis : MAJ + F10 )
		# Etape 5 : Utilisez sur l'émulateur !

# Déploiement de l'application (Si sur smartphone Android):
		# Etape 1 : Télécharger l'apk directement avec ce lien : http://api.sudododevelopers.xyz:2525/WebServiceAPP.apk
		# Etape 2 : Installer l'application sur votre smartphone
		# Etape 3 : Utilisez !



# Documentation de l'API :

	# Méthode  InsertNewPlayer() :
		Paramètres : - nom                       : varchar(50)
		             - lienImage                 : varchar(255)
					 - descriptionPersonnage     : varchar(2000)
		
		Description de la méthode : 
			Permet d'insérer un nouveau personnage dans la base de donnée.

	# Méthode  GetAllCharacters() :
		
		Description de la méthode :
			Permet de récupérer l'intégralité des enregistrements en base de donnée.

	# Méthode  DeleteCharacter() :
		Paramètres : - id   : int 

		Description de la méthode :
			Permet de supprimer un personnage en base de donnée à partir de son id. 