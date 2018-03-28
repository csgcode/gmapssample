package com.example.user.new2803;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] mobileArray = {
            "Android","IPhone",
            "WindowsMobile","Blackberry",
            "WebOS","Ubuntu",
            "Windows7","Max OS X"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ArrayAdapter adapterli = new ArrayAdapter<String>(this,
                R.layout.activity_main, mobileArray);
        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapterli);


        */


        GridView g = (GridView) findViewById(R.id.grid_view);
        CustomAdapter adapter = new CustomAdapter(this, getData());
        g.setAdapter(adapter);



    }

    public ArrayList<Integer> getData() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.drawable.ic_launcher_background);
        // add 2 - 11
        list.add(R.drawable.ic_launcher_background);

        return list;

    }
}
