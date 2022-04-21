package com.example.paragonficheperso.lib;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.example.paragonficheperso.R;
import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;



public class MyAdapter extends ArrayAdapter<String>
{

    // ---------------------------------------------
    private final ArrayList<String> title;
    private final ArrayList<String> image;
    private final Activity context;
    private final int idLayout;
    // ---------------------------------------------



    // ---------------------------------------------
    public MyAdapter (Activity context, ArrayList<String> title, ArrayList<String> image, int idLayout) {
        super(context, idLayout);
        this.context = (Activity) context;
        this.title = title;
        this.image = image;
        this.idLayout = idLayout;

    }
    // ---------------------------------------------

    @Override
    public int getCount()
    {
        return title.size();
    }

    @Override
    public long getItemId(int arg0)
    {
        return 0;
    }

    // ---------------------------------------------
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if(convertView == null)
        {
            LayoutInflater inflater = context.getLayoutInflater();
            convertView = inflater.inflate(idLayout,null,true);
        }

        TextView textViewTitle = convertView.findViewById(R.id.Titre);
        ImageView imageViewImage = convertView.findViewById(R.id.ImagePerso);
        textViewTitle.setText(title.get(position));
        
        try {
            System.out.println("Essaye : " +image.get(position) );

            Picasso.with( this.context ).load(image.get(position)).into(imageViewImage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return  convertView;
    }
    // ---------------------------------------------

}
