package com.dev.deva;

import static java.util.Arrays.asList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.interstitial.InterstitialAd;

import java.util.ArrayList;

public class Ayyapan extends AppCompatActivity {


    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayyapan);
        ListView listView = findViewById(R.id.listviewayyapan);






            ArrayList<String> arrayList = new ArrayList<String>(asList(" பள்ளிக் கட்டு சபரிமலைக்கு", "ஹரிவ ராஸனம்",
                    "பகவான் சரணம் பகவதி சரணம் ", "அஞ்சுமலை அழகா"));
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

            listView.setAdapter(arrayAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if (position == 0) {
                        Intent intent = new Intent(Ayyapan.this, pallikattu.class);
                        startActivity(intent);
                    }
                    if (position == 1) {
                        Intent intent = new Intent(Ayyapan.this, harivarasanam.class);
                        startActivity(intent);
                    }
                    if (position == 2) {
                        Intent intent = new Intent(Ayyapan.this, bagavansaranam.class);
                        startActivity(intent);
                    }
                    if (position == 3) {
                        Intent intent = new Intent(Ayyapan.this, anjumalaiazhka.class);
                        startActivity(intent);
                    }
                    if (position == 4) {
                        Intent intent = new Intent(Ayyapan.this, villaniveeranae.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
