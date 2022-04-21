package com.example.paragonficheperso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paragonficheperso.dto.personnageDTO;
import com.example.paragonficheperso.dao.personnageDao;

public class fichePerso extends AppCompatActivity {

    private TextView nomPerso       = findViewById(R.id.nomPerso);
    private ImageView imagePerso    = findViewById(R.id.ImagePerso);
    private TextView descPerso      = findViewById(R.id.DescriptionPersonnage);
    private Button buttonSuppr      = findViewById(R.id.buttonSupprim);
    private personnageDTO perso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_perso);

        perso = (personnageDTO) getIntent().getSerializableExtra("Personnage");

        nomPerso.setText(perso.getNom());
        //imagePerso.setImage(perso.geLienImage());
        descPerso.setText(perso.getDescription());

        buttonSuppr.setOnClickListener(view -> personnageDao.SuppprimePerso(this, perso.getId()));




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