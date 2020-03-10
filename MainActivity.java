package com.ardacool.antalya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> placeNames = new ArrayList<>();
        placeNames.add("Kaleiçi");
        placeNames.add("Olympos");
        placeNames.add("Aspendos");
        placeNames.add("Antalya Müzesi");
        placeNames.add("Phaselis");
        placeNames.add("Alanya Kalesi");
        placeNames.add("Xanthos");
        placeNames.add("Gelidonya Feneri");
        placeNames.add("Apollon Tapınağı");
        placeNames.add("Termesos");
        placeNames.add("Perge");
        placeNames.add("Mygra");
        placeNames.add("Rhodiapolis");


        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,placeNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this){
            public void onSwipeTop() {
                Toast.makeText(MainActivity.this, "top", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeLeft() {
                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),PlacesActivity.class);

            }
            public void onSwipeBottom() {
                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
            }


        });




    }
}
