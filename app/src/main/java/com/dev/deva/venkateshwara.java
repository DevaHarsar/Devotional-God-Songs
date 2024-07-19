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

public class venkateshwara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venkateshwara);

        ListView listView = findViewById(R.id.listviewvenketeshwara);


        ArrayList<String> arrayList = new ArrayList<String>(asList("விஷ்ணு சஹஸ்ரநாமம் ", "ஸ்ரீ நாராயணா",
                "திருப்பாற் கடலில் பள்ளி கொண்டாயே", "ஸ்ரீ வெங்கடேச கரவலம்ப ஸ்தோத்திரம் ",
                "வெங்கடேச சுப்ரபாதம்"
                , " பஜ கோவிந்தம் ","குறை ஒன்றும் இல்லை"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(venkateshwara.this, vishnusahasranamam.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(venkateshwara.this,vishnusrinarayana.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(venkateshwara.this, thiruparkadalil.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(venkateshwara.this, venkateshwarakaravelambu.class);
                    startActivity(intent);

                }
                if (position == 4) {
                    Intent intent = new Intent(venkateshwara.this, venketasasubrabharatham.class);
                    startActivity(intent);

                }
                if (position == 5) {
                    Intent intent = new Intent(venkateshwara.this, bajakovindham.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(venkateshwara.this, kuraiondrumillai.class);
                    startActivity(intent);
                }
            }
        });
    }
}