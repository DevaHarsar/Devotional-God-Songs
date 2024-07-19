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

public class Saibaba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saibaba);
        ListView listView = findViewById(R.id.listviewsaibaba);


        ArrayList<String> arrayList = new ArrayList<String>(asList(" அம்மாவின் வடிவாக அருளும் ஸ்ரீ சாயி", "ஓம் ஜெய ஜெய ஸ்ரீ சாயி",
                 "வரவேண்டும் நீயே ",
                "சாயி சரணம் பாபா சரணம்"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Saibaba.this, ammavinvadivaga.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(Saibaba.this, omjeyasrisai.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(Saibaba.this, varavendumneeyae.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(Saibaba.this, saisaranam.class);
                    startActivity(intent);

                }
            }
        });
    }
}