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

public class Laxmi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laxmi);
        ListView listView = findViewById(R.id.listviewlaxmi);



        ArrayList<String> arrayList = new ArrayList<String>(asList(" வரலட்சுமி 108 போற்றி", "திருவிளக்கு ஸ்தோத்திரம்",
                "அஷ்ட லட்சுமி ", "மகாலட்சுமி ஸ்லோகம் "));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Laxmi.this, varalaxmi108potri.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(Laxmi.this, thiruvilakustotiram.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(Laxmi.this, astalaxmi.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(Laxmi.this, mahalaxmislogan.class);
                    startActivity(intent);


                }

            }
        });
    }
}