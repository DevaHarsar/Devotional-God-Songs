package com.dev.deva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.speech.RecognizerIntent;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.annotation.NonNull;



public class TamilButton extends AppCompatActivity implements View.OnClickListener {
    public ImageView vinayagar, murugar, shivan, venkateshwara, laxminarasimar, laxmi, abirami, hanuman, ayyapan, saibaba;
    public  TextView vinayagartxt,murugartxt,shivantxt,venketashwaratxt,laxminarashimartxt,laxmitxt,hanumantxt,ayyapantxt,saibabatxt,abiramitxt;
    public AdView mAdView;
    public SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tamil_button);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        vinayagar = (ImageView) findViewById(R.id.vinayagar);
        murugar = (ImageView) findViewById(R.id.Murugar);
        shivan = (ImageView) findViewById(R.id.SHIVAN);
        venkateshwara = (ImageView) findViewById(R.id.venkateshwara);
        laxminarasimar = (ImageView) findViewById(R.id.Laxminarshimar);
        laxmi = (ImageView) findViewById(R.id.LAXMI);
        abirami = (ImageView) findViewById(R.id.abirami);
        hanuman = (ImageView) findViewById(R.id.hanuman);
        ayyapan = (ImageView) findViewById(R.id.ayyapan);
        saibaba = (ImageView) findViewById(R.id.saibaba);

        //text click
        vinayagartxt=(TextView)findViewById(R.id.vinayagartxt);
       murugartxt=(TextView)findViewById(R.id.murugartxt);
       shivantxt=(TextView)findViewById(R.id.shivantxt);
        venketashwaratxt=(TextView)findViewById(R.id.venkateshwaratxt);
        laxminarashimartxt=(TextView)findViewById(R.id.laxminarashimatxt);
        laxmitxt=(TextView)findViewById(R.id.Laxmitxt);
        abiramitxt=(TextView)findViewById(R.id.abiramitxt);
        hanumantxt=(TextView)findViewById(R.id.hanumantxt);
        ayyapantxt=(TextView)findViewById(R.id.ayyapantxt);
        saibabatxt=(TextView)findViewById(R.id.saibabatxt);

        vinayagar.setOnClickListener(this);vinayagartxt.setOnClickListener(this);
        murugar.setOnClickListener(this);murugartxt.setOnClickListener(this);
        shivan.setOnClickListener(this);shivantxt.setOnClickListener(this);
        venkateshwara.setOnClickListener(this);venketashwaratxt.setOnClickListener(this);
        laxminarasimar.setOnClickListener(this);laxminarashimartxt.setOnClickListener(this);
        laxmi.setOnClickListener(this);laxmitxt.setOnClickListener(this);
        abirami.setOnClickListener(this);abiramitxt.setOnClickListener(this);
        hanuman.setOnClickListener(this);hanumantxt.setOnClickListener(this);
        ayyapan.setOnClickListener(this);ayyapantxt.setOnClickListener(this);
        saibaba.setOnClickListener(this);saibabatxt.setOnClickListener(this);


    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menus, menu);


        // first parameter is the file for icon and second one is menu
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // We are using switch case because multiple icons can be kept
        switch (item.getItemId()) {
            case R.id.shareButton:

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);

                // type of the content to be shared
                sharingIntent.setType("text/plain");

                // Body of the content
                String shareBody = "Enjoy the God Songs Lyrics in tamil https://play.google.com/store/apps/details?id=com.dev.deva";

                // subject of the content. you can share anything
                String shareSubject = "https://play.google.com/store/apps/details?id=com.dev.deva";

                // passing body of the content
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);

                // passing subject of the content
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
                break;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
        public void onClick (View v){

        Intent i;

        switch (v.getId()) {
            case R.id.vinayagar:
                i = new Intent(this, Vinayager.class);
                startActivity(i);
                break;


            case R.id.Murugar:
                i= new Intent(this, Murugar.class);
                startActivity(i);
                break;

            case R.id.SHIVAN:
                i = new Intent(this, Shivan.class);
                startActivity(i);
                break;
            case R.id.venkateshwara:
                i= new Intent(this, venkateshwara.class);
                startActivity(i);
                break;

            case R.id.Laxminarshimar:
                i= new Intent(this, laxminarasimar.class);
                startActivity(i);
                break;
            case R.id.LAXMI:
                i = new Intent(this, Laxmi.class);
                startActivity(i);
                break;

            case R.id.abirami:
                i = new Intent(this, Abirami.class);
                startActivity(i);
                break;
            case R.id.hanuman:
                i = new Intent(this, hanuman.class);
                startActivity(i);
                break;
            case R.id.ayyapan:
                i = new Intent(this, Ayyapan.class);
                startActivity(i);
                break;
            case R.id.saibaba:
                i = new Intent(this, Saibaba.class);
                startActivity(i);
                break;
            case R.id.vinayagartxt:
                i = new Intent(this, Vinayager.class);
                startActivity(i);
                break;


            case R.id.murugartxt:
                i= new Intent(this, Murugar.class);
                startActivity(i);
                break;

            case R.id.shivantxt:
                i = new Intent(this, Shivan.class);
                startActivity(i);
                break;
            case R.id.venkateshwaratxt:
                i= new Intent(this, venkateshwara.class);
                startActivity(i);
                break;

            case R.id.laxminarashimatxt:r:
                i= new Intent(this, laxminarasimar.class);
                startActivity(i);
                break;
            case R.id.Laxmitxt:

                i = new Intent(this,Laxmi.class);
                startActivity(i);
                break;

            case R.id.abiramitxt:
                i = new Intent(this, Abirami.class);
                startActivity(i);
                break;
            case R.id.hanumantxt:
                i = new Intent(this, hanuman.class);
                startActivity(i);
                break;
            case R.id.ayyapantxt:
                i = new Intent(this, Ayyapan.class);
                startActivity(i);
                break;
            case R.id.saibabatxt:txt:
                i = new Intent(this, Saibaba.class);
                startActivity(i);
                break;
            default:


        }

    }


}
