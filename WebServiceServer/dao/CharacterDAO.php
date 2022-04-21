<?php

class CharacterDAO 
{

	// -------------------------------------------
     
    public static function InsertNewPlayer()
    {
        DBConnex::runQuery(
            "Trying to insert new player",
            "Sucess  insert new player",
            "Failure  insert new player",
            " INSERT INTO personnages (nom,lienImage,descriptionPersonnage) VALUES (:nom,:lienImage,:descriptionPersonnage)",
            array("nom,lienImage,descriptionPersonnage")
        );
    }

    // -------------------------------------------

        
    // -------------------------------------------

    public static function GetAllCharacter()
    {
        DBConnex::runFetchAll
        (
            "Trying to get all maps of a characters",
            "Success retrieving all characters",
            "Failure retrieving all characters",
            "SELECT *
            FROM personnages"
        );
    }

	// -------------------------------------------


    public static function DeleteCharacter(){
    
        DBConnex::runQuery(
            "Trying to delete a character",
            "Success to delete a character",
            "Failure to delete aa character",
            "DELETE FROM personnages WHERE id = :idCharacter",
            array("idCharacter")
        );
        
    }

    // --------------------------------------------
}