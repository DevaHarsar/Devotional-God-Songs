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

public class hanuman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanuman);
        ListView listView = findViewById(R.id.listviewhanuman);


        ArrayList<String> arrayList = new ArrayList<String>(asList(" ஸ்ரீ ஹனுமன் சாலிசா", "அனுமன் கவசம்",
                "பஞ்சமுக ஆஞ்சநேயர் மந்திரங்கள் ", "ஸ்ரீ ராமா ராமா"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(hanuman.this, hanumanchalisha.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(hanuman.this, hanumankavasam.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(hanuman.this, panjamugahanuman.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(hanuman.this, sriramajeyam.class);
                    startActivity(intent);
                }
               
            }
            });
    }
}