package com.example.paragonficheperso.lib;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paragonficheperso.R;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter
{

    // ---------------------------------------------
    private final ArrayList<String> title;
    private final ArrayList<Bitmap> image;
    private final int idLayout;
    private final Activity context;
    // ---------------------------------------------



    // ---------------------------------------------
    public MyAdapter (
            Activity context,
            ArrayList<String> title,
            ArrayList<String> description,
            ArrayList<Bitmap> image,
            int idLayout) {
        super(context, idLayout, description);
        this.title = title;
        this.image = image;
        this.idLayout = idLayout;
        this.context = context;
    }
    // ---------------------------------------------



    // ---------------------------------------------
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        if(convertView == null)
        {
            LayoutInflater inflater = context.getLayoutInflater();
            row = inflater.inflate(idLayout, null, true);
        } else {
            row = convertView;
        }

        TextView textViewTitle = row.findViewById(R.id.Titre);
        ImageView imageViewImage = row.findViewById(R.id.ImagePerso);

        textViewTitle.setText(title.get(position));
        imageViewImage.setImageBitmap(image.get(position));

        return  row;
    }
    // ---------------------------------------------

}
