package com.example.user.new2803;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 3/28/2018.
 */

public class CustomAdapter extends ArrayAdapter<Integer> {

    private Activity context;
    private ArrayList<Integer> objects;

    public CustomAdapter(Activity context, ArrayList<Integer> objects) {
        super(context, R.layout.grid_item_layout, objects);
        this.context = context;
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater i = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = (View) i.inflate(R.layout.grid_item_layout, parent, false);
        }

        TextView t = (TextView) convertView.findViewById(R.id.label);
        ImageView i = (ImageView) convertView.findViewById(R.id.image);

        t.setText("label " + position);
        i.setImageResource(objects.get(position));

        return convertView;
    }
}


