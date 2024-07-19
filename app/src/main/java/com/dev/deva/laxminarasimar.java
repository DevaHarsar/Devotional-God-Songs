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

public class laxminarasimar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laxminarasimar);
        ListView listView = findViewById(R.id.listviewnarasimar);


        ArrayList<String> arrayList = new ArrayList<String>(asList(" ஸ்ரீ ந்ருஸிம்ஹ கவசம்", "லட்சுமி நரசிம்மர் பஞ்சரத்னம்",
                "லட்சுமி நரசிம்மர் மந்திரம்", "லட்சுமி நரசிம்மர் 108 போற்றி"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(laxminarasimar.this, narashimhakavasam.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(laxminarasimar.this, narashimarpancharatnam.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(laxminarasimar.this, narashimarmanthiram.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(laxminarasimar.this,narashimarpotri.class);
                    startActivity(intent);


                }

            }

        });


    }
}