package com.dev.deva;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

public class language extends AppCompatActivity implements OnUserEarnedRewardListener {

    public Button Tamil, English;


    public AdView mAdView;
    private RewardedInterstitialAd rewardedInterstitialAd;
    private final String TAG = "language";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        Tamil = findViewById(R.id.ButtonTamil);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
              loadAd();


            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void Tamil(View view) {

            if (rewardedInterstitialAd != null) {
                rewardedInterstitialAd.show(language.this, new OnUserEarnedRewardListener() {
                    @Override
                    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                        // TODO: Handle the reward earned by the user
                        Log.i(TAG, "User earned reward.");
                    }
                });
            } else {
                // No rewarded ad available, you can choose to show a regular ad or take another action
                Toast.makeText(language.this, "No ads to show", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Rewarded ad is not loaded");
            }
            Intent intent = new Intent(language.this, TamilButton.class);
            startActivity(intent);
        }




    private void loadAd () {
            // Use the test ad unit ID to load an ad.
            RewardedInterstitialAd.load(language.this, "ca-app-pub-8702370576330643/1207032352",
                    new AdRequest.Builder().build(), new RewardedInterstitialAdLoadCallback() {
                        @Override
                        public void onAdLoaded(RewardedInterstitialAd ad) {
                            Log.d(TAG, "Ad was loaded.");
                            rewardedInterstitialAd = ad;
                            rewardedInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                                @Override
                                public void onAdClicked() {
                                    // Called when a click is recorded for an ad.
                                    Log.d(TAG, "Ad was clicked.");
                                }

                                @Override
                                public void onAdDismissedFullScreenContent() {
                                    // Called when ad is dismissed.
                                    // Set the ad reference to null so you don't show the ad a second time.
                                    Log.d(TAG, "Ad dismissed fullscreen content.");
                                    rewardedInterstitialAd = null;

                                    loadAd();
                                }

                                @Override
                                public void onAdFailedToShowFullScreenContent(AdError adError) {
                                    // Called when ad fails to show.
                                    Log.e(TAG, "Ad failed to show fullscreen content.");
                                    rewardedInterstitialAd = null;
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
                        public void onAdFailedToLoad(LoadAdError loadAdError) {
                            Log.d(TAG, loadAdError.toString());
                            rewardedInterstitialAd = null;
                        }
                    });
        }

        @Override
        public void onUserEarnedReward (@NonNull RewardItem rewardItem){
            Log.i(TAG, "User earned reward.");
            // TODO: Reward the user!
        }
    }



