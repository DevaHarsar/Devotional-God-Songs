package com.dev.deva;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Shivan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shivan);
        ListView listView = findViewById(R.id.listviewshivan);



        ArrayList<String> arrayList = new ArrayList<String>(asList(" சிவபுராணம் பாடல் ", "அருணாசலனே ஈசனே",
                "ஹர ஹர சிவனே அருணாசலனே ", "திருப்பள்ளியெழுச்சி ",
                "108 சிவன் போற்றி"
                , "வேற்றாகி விண்ணாகி நின்றாய் போற்றி ","திருவெம்பாவை "));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Shivan.this, sivapuranam.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(Shivan.this, arunachelane.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(Shivan.this, haraharasivanae.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(Shivan.this, thirupalliyeluchi.class);
                    startActivity(intent);

                }
                if (position == 4) {
                    Intent intent = new Intent(Shivan.this, shivanpotri.class);
                    startActivity(intent);

                }
                if (position == 5) {
                    Intent intent = new Intent(Shivan.this, shivanvetraki.class);
                    startActivity(intent);
                }if (position == 6) {
                    Intent intent = new Intent(Shivan.this, Thiruvembavai.class);
                    startActivity(intent);
                }


            }


        });

    }
}