package com.example.paragonficheperso.lib;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.paragonficheperso.R;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<String>
{

    // ---------------------------------------------
    private final ArrayList<String> title;
    private final ArrayList<Bitmap> image;
    private final Activity context;
    private final int idLayout;
    // ---------------------------------------------



    // ---------------------------------------------
    public MyAdapter (Activity context, ArrayList<String> title, ArrayList<Bitmap> image, int idLayout) {
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
        System.out.println("ici");
        if(convertView == null)
        {
            LayoutInflater inflater = context.getLayoutInflater();
            convertView = inflater.inflate(idLayout,null,true);
        }

        TextView textViewTitle = convertView.findViewById(R.id.Titre);
        //ImageView imageViewImage = convertView.findViewById(R.id.ImagePerso);
        System.out.println("msg avec :" + title.get(position));
        textViewTitle.setText(title.get(position));
        //imageViewImage.setImageBitmap(image.get(position));

        return  convertView;
    }
    // ---------------------------------------------

}
