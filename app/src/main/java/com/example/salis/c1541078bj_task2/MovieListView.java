package com.example.salis.c1541078bj_task2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class MovieListView extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "American Sniper",
            "Big Hero",
            "Bird Man",
            "John Wick",
            "Kings Man",
            "The Imitation",
            "Whiplash",

    };
    String[] years ={
            "2015",
            "2014",
            "2015",
            "2016",
            "2015",
            "2015",
            "2015",

    };

    Integer[] imgid={
            R.drawable.american_snipper,
            R.drawable.bighero,
            R.drawable.birdman,
            R.drawable.johnwick,
            R.drawable.kingsman,
            R.drawable.theimitation,
            R.drawable.whiplash,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list_view);



        CustomListAdapter adapter= new CustomListAdapter(this, itemname, years, imgid);
        list=(ListView)findViewById(R.id.listV_main);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), "You selected " + Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
