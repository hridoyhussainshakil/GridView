package com.example.access_denaied.class12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

   private String[] titlenames;
   private int[] images;
   private Context context;
   LayoutInflater inflater;

    public CustomAdapter(String[] titlenames , int[] images , Context context ){
        this.context = context;
        this.images = images;
        this.titlenames = titlenames;
    }

    @Override
    public int getCount() {
        return titlenames.length;
    }

    @Override
    public Object getItem(int i) {
        return titlenames[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View convertview = view;

        if(convertview==null) {
            //do somthing

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

            view = inflater.inflate(R.layout.sample_layout,null);

            ImageView imageViewI = view.findViewById(R.id.imageid);
            TextView textViewI = view.findViewById(R.id.text);

            imageViewI.setImageResource(images[i]);
            textViewI.setText(titlenames[i]);




        return view;
    }
}

