package com.example.paragonficheperso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class fichePerso extends AppCompatActivity {

    private TextView NomPerso = setContentView(R.id.nomPerso);
    private Personnage perso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_perso);

        perso = (Personnage) getIntent().getSerializableExtra("Personnage");


    }
}