package com.example.paragonficheperso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paragonficheperso.dto.personnageDTO;

public class fichePerso extends AppCompatActivity {

    private TextView nomPerso = findViewById(R.id.nomPerso);
    private ImageView imagePerso = findViewById(R.id.ImagePerso);
    private TextView descPerso = findViewById(R.id.DescriptionPersonnage);
    private personnageDTO perso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_perso);

        perso = (personnageDTO) getIntent().getSerializableExtra("Personnage");


    }
}