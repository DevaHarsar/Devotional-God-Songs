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

public class Murugar extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murugar);

        ListView listView = findViewById(R.id.listviewmurugar);




        ArrayList<String> arrayList = new ArrayList<String>(asList(" கந்த சஷ்டி கவசம் பாடல் வரிகள்", "108 முருகர் போற்றி",
                "வருவாண்டி தருவாண்டி பாடல் வரிகள்", "குன்றத்திலே குமரனுக்கு கொண்டாட்டம் ",
                "உள்ளம் உருகுதய்யா"
                , "சொல்லச் சொல்ல இனிக்குதடா முருகா ", "அழகென்ற சொல்லுக்கு முருகா",
                "முத்தைத்தரு பத்தித் திரு","வேலுண்டு வினையில்லை"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0) {
                Intent intent = new Intent(Murugar.this, kandhasastikavasam.class);
                startActivity(intent);

            }
            if (position == 1) {
                Intent intent = new Intent(Murugar.this, Murugarporti.class);
                startActivity(intent);

            }
            if (position == 2) {
                Intent intent = new Intent(Murugar.this, Murugarvaruvan.class);
                startActivity(intent);

            }
            if (position == 3) {
                Intent intent = new Intent(Murugar.this, kundrathilaekumaranuku.class);
                startActivity(intent);

            }
            if (position == 4) {
                Intent intent = new Intent(Murugar.this, ullamurugatheymurugar.class);
                startActivity(intent);

            }
            if (position == 5) {
                Intent intent = new Intent(Murugar.this, sollasollainikuthada.class);
                startActivity(intent);

            }if (position == 6) {
                    Intent intent = new Intent(Murugar.this, alagentrasolluku.class);
                    startActivity(intent);
            }if (position == 7) {
                Intent intent = new Intent(Murugar.this, muthaithirupathithiru.class);
                startActivity(intent);}
            if (position == 8) {
                Intent intent = new Intent(Murugar.this, velundu.class);
                startActivity(intent);}




                }

        });

        }


    }
