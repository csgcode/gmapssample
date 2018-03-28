package com.example.user.new2803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    String[] mobileArray = {
            "Android","IPhone",
            "WindowsMobile","Blackberry",
            "WebOS","Ubuntu",
            "Windows7","Max OS X"};

    ListView listView;
    ArrayList<String> listitems = new ArrayList<String>();

    ArrayAdapter<String> adapterty;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list view adapter
        listView=(ListView) findViewById(R.id.ListView);
        adapterty = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mobileArray);
        listView.setAdapter(adapterty);




        //grid view adapter
        GridView g = (GridView) findViewById(R.id.grid_view);
        CustomAdapter adapter = new CustomAdapter(this, getData());
        g.setAdapter(adapter);

        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + position, Toast.LENGTH_SHORT)
                        .show();
            }
        });
        //

    }


    public ArrayList<Integer> getData() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.drawable.ic_launcher_background);
        // add 2 - 11
        list.add(R.drawable.ic_launcher_background);

        return list;

    }
}
