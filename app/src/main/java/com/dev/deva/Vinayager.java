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

import com.google.android.gms.ads.interstitial.InterstitialAd;


public class Vinayager extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private Object ArrayList;


    public Vinayager() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinayager);
        ListView listView = findViewById(R.id.listview);


        ArrayList<String> arrayList = new ArrayList<String>(asList(" விநாயகர் அகவல்", "ஐந்து கரத்தனை", " 108 விநாயகர் போற்றி",
                "ஒன்பது கோளும் பாடல்", "பிள்ளையார் பிள்ளையார் பெருமை வாய்ந்த பிள்ளையார்",
                "ஆனை முகத்தான் அரன் ஆனை முகத்தான்"
                , "ஜெய ஜெய கணபதி ஓம் – ஓம் ஸ்ரீ ஜெய ஜெய கணபதி", "கணபதியே அருள்வாய்", "விநாயகனே வினய் தீர்ப்பவனே",
                "அள்ளித்தரும் பிள்ளையாரை கும்பிடுவோமே"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        //ads


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Vinayager.this, vinayagarAgaval.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(Vinayager.this, ainthukarathanai.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(Vinayager.this, vinayagarpotri.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(Vinayager.this, OnpathuKolum.class);
                    startActivity(intent);

                }
                if (position == 4) {
                    Intent intent = new Intent(Vinayager.this, pillyarpillayarperumei.class);
                    startActivity(intent);

                }
                if (position == 5) {
                    Intent intent = new Intent(Vinayager.this, AanaiMukathan.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Vinayager.this, jeyaganapathy.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Vinayager.this, ganapathiyaearulvai.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(Vinayager.this, vinayaganevinaithirpavanae.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(Vinayager.this, alitharumpillayar.class);
                    startActivity(intent);
                }


            }


        });
    }
}



