package com.dev.deva;

import static java.util.Arrays.asList;

import androidx.annotation.NonNull;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;

public class Abirami extends Activity {

    ImageView img;
    public InterstitialAd mInterstitialAd;
    private final String TAG = "Abirami";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abirami);
        img = (ImageView) findViewById(R.id.abirami);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                createpersonalisedAd();
            }
        });





        if (mInterstitialAd != null) {
                    mInterstitialAd.show(Abirami.this);
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");



            }




        ListView listView = findViewById(R.id.listviewabirami);


        ArrayList<String> arrayList = new ArrayList<String>(asList(" அபிராமி அந்தாதி-1 ", "அபிராமி அந்தாதி-2", "காயத்ரி மந்திரங்கள்", "ரக்க்ஷ ரக்க்ஷ ஜகன் மாதா",
                "கனகதாரா ஸ்தோத்திரம்", "ஜெய ஜெய தேவி-துர்கா தேவி சரணம் "

                , "ஸ்ரீ அம்பாள் துதி ", "திருக்கருகாவூர் கர்ப்பரட்சாம்பிகை 108 போற்றி","திருப்பாவை பாடல்கள்","மங்கள ரூபிணி "));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Abirami.this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Abirami.this, abiramianthathi1.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(Abirami.this, abiramisong.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(Abirami.this, gayathrimantra.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(Abirami.this, raksharaksha.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(Abirami.this, kanagathara.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(Abirami.this, jeyajeyadevi.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(Abirami.this, ambalthuthi.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(Abirami.this, karpagaratchambigaipotri.class);
                    startActivity(intent);
                }if (position == 8) {
                    Intent intent = new Intent(Abirami.this, Thirupavai.class);
                    startActivity(intent);

                }if (position == 9) {
                    Intent intent = new Intent(Abirami.this, Managalaroopini.class);
                    startActivity(intent);
                }



            }
        });
    }

    private void createpersonalisedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        createinterstialAd(adRequest);
    }
    private void createinterstialAd(AdRequest adRequest){
        InterstitialAd.load(this,"ca-app-pub-9782798119178097/9878843849", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                            @Override
                            public void onAdClicked() {
                                // Called when a click is recorded for an ad.
                                Log.d(TAG, "Ad was clicked.");
                                Intent intent=new Intent(Abirami.this,Abirami.class);
                                startActivity(intent);
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Set the ad reference to null so you don't show the ad a second time.
                                Log.d(TAG, "Ad dismissed fullscreen content.");
                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.e(TAG, "Ad failed to show fullscreen content.");
                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdImpression() {
                                // Called when an impression is recorded for an ad.
                                Log.d(TAG, "Ad recorded an impression.");
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d(TAG, "Ad showed fullscreen content.");
                            }
                        });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.d(TAG, loadAdError.toString());
                        mInterstitialAd = null;
                    }
                });
    }
}









