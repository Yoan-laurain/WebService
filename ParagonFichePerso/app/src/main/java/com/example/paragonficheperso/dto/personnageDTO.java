package com.example.paragonficheperso.dto;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;


public class personnageDTO implements Serializable
{
    //------------------------------------------------------------------------------

    private int id;
    private String nom;
    private String lienImage;
    private String description;

    //------------------------------------------------------------------------------

    public personnageDTO(int id,String nom, String lienImage, String description )
    {
        this.id = id;
        this.nom = nom;
        this.lienImage = lienImage;
        this.description = description;
    }

    //------------------------------------------------------------------------------

    public void setId ( int id ) { this.id = id;}

    public void setNom ( String nom ) { this.nom = nom;}

    public void setLienImage ( String lienImage ) { this.lienImage = lienImage;}

    public void setDescription ( String description ) { this.description = description;}

    //------------------------------------------------------------------------------

    public String getLienImage() { return lienImage; }

    public String getNom() { return nom; }

    public String getDescription() { return description; }

    public int getId() { return id; }


    //------------------------------------------------------------------------------

    /*
        Hydrate a charcter object with value of the json object in parameter
     */
    public static personnageDTO HydrateCharacter( JSONObject json ) throws JSONException
    {
        return new personnageDTO(
                json.getInt("id"),
                json.getString("nom"),
                json.getString("lienImage"),
                json.getString("descriptionPersonnage")
        );
    }
}
