package com.example.paragonficheperso;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import com.example.paragonficheperso.dao.personnageDao;
import com.example.paragonficheperso.dto.personnageDTO;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public final static String CONNEXION_API = "http://51.254.96.53:8686/api.php"; // API TEST
    public final static String API_KEY = "43d24893a0ca4dfdacbbc6f0b3067804";


    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        personnageDao.GetAllMap(this);
    }


    public void ResponseCharacters(HashMap<Integer, personnageDTO> characters)
    {
        this.runOnUiThread(() ->
        {

        });
    }
}