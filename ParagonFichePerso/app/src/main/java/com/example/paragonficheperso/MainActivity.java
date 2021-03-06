package com.example.paragonficheperso;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.widget.ListView;

import com.example.paragonficheperso.dao.personnageDao;
import com.example.paragonficheperso.dto.personnageDTO;
import com.example.paragonficheperso.lib.MyAdapter;
import com.example.paragonficheperso.fichePerso;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public final static String CONNEXION_API = "http://api.sudododevelopers.xyz:2525/api.php";
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
            if(characters!=null)
            {
                ArrayList mTitle =new ArrayList() ;
                ArrayList<String> images = new ArrayList<>();
                ArrayList<personnageDTO> ListCharac = new ArrayList<>();


                characters.values().forEach(tab ->
                {
                    mTitle.add( tab.getNom() );
                    //Bitmap img =
                    //images.add(img);
                    ListCharac.add(tab);
                    images.add(tab.getLienImage());
                });


                ListView listViewPerso = findViewById(R.id.ListePerso);
                MyAdapter adapter = new MyAdapter(this, mTitle, images,R.layout.row);
                listViewPerso.setAdapter(adapter);

                listViewPerso.setOnItemClickListener((parent, view, position, id) ->
                {
                    OpenPerso(ListCharac.get(position));
                });
            }
            else
            {
                ListView listViewPerso = findViewById(R.id.ListePerso);
                MyAdapter adapter = new MyAdapter(this, new ArrayList(), new ArrayList(),R.layout.row);
                listViewPerso.setAdapter(adapter);
            }
        });
    }

    public void OpenPerso( personnageDTO perso )
    {
        Intent NewActivities = new Intent( this, fichePerso.class );
        System.out.println("Perso : " + perso);
        NewActivities.putExtra("Personnage", perso);
        this.startActivity(NewActivities);
    }
}