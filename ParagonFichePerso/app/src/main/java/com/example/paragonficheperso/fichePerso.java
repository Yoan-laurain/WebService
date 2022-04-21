package com.example.paragonficheperso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paragonficheperso.dto.personnageDTO;
import com.example.paragonficheperso.dao.personnageDao;
import com.squareup.picasso.Picasso;

public class fichePerso extends AppCompatActivity {

    private TextView nomPerso   ;
    private ImageView imagePerso;
    private TextView descPerso  ;
    private personnageDTO perso;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_perso);

        nomPerso       = findViewById(R.id.nomPerso);
        imagePerso    = findViewById(R.id.ImagePersonnage);
        descPerso      = findViewById(R.id.DescriptionPersonnage);

        try{

            perso = (personnageDTO) getIntent().getSerializableExtra("Personnage");
            System.out.println("image : " + perso.getLienImage());
            System.out.println("imageView : " + imagePerso);

            nomPerso.setText(perso.getNom());
            try {

                Picasso.with( this ).load(perso.getLienImage()).into(imagePerso);

            } catch (Exception e) {
                e.printStackTrace();
            }
            descPerso.setText(perso.getDescription());

            //buttonSuppr.setOnClickListener(view -> personnageDao.SuppprimePerso(this, perso.getId()));
        }
        catch (Exception e ){
            System.out.println("Erreur : " + e);
        }

    }

    public void onResponseDelete(boolean response){

        if(!response){
            Toast.makeText(this, "La suppression a échoué." + "\n" + "Veuillez réessayer ulterieurement", Toast.LENGTH_SHORT).show();
        }
        else{
            this.finish();
        }
    }

}