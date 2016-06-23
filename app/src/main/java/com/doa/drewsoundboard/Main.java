package com.doa.drewsoundboard;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.net.URI;


public class Main extends AppCompatActivity {


    private AdView mAdView;


    MediaPlayer mp;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
        stopPlaying();
    }

    /** Called when returning to the activity */
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
        stopPlaying();
    }

    /** Called before the activity is destroyed */
    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
        stopPlaying();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playAlright(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.alright);
        mp.start();
    }

    public void playChillpill(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.chillpill);
        mp.start();
    }
    public void playDrinkaday(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.drinkaday);
        mp.start();
    }
    public void playPenis(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.penis);
        mp.start();
    }
    public void playEh(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.eh);
        mp.start();
    }
    public void playErection(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.erection);
        mp.start();
    }
    public void playFaggot(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.faggot);
        mp.start();
    }
    public void playGayor(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.gayorstraight);
        mp.start();
    }
    public void playHesadick(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.hesadick);
        mp.start();
    }
    public void playHesgay(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.hesgay);
        mp.start();
    }
    public void playHigh(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.high);
        mp.start();
    }
    public void playHimhappy(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.himhappy);
        mp.start();
    }
    public void playHizzy(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.hizzy);
        mp.start();
    }
    public void playIntensifies(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.intensifiesorgasm);
        mp.start();
    }
    public void playIsitok(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.isitokay);
        mp.start();
    }
    public void playIwasboard1(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.iwasbored1);
        mp.start();
    }
    public void playIwasboard2(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.iwasbored2);
        mp.start();
    }
    public void playJizzguzzling(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.jizzguzzling);
        mp.start();
    }
    public void playListen(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.listen);
        mp.start();
    }
    public void playVicodin(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.littlevicodin);
        mp.start();
    }
    public void playLove(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.love);
        mp.start();
    }
    public void playMinty(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.mintyfresh);
        mp.start();
    }
    public void playNaughtyhabit(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.naughtyhabit);
        mp.start();
    }
    public void playNotinlove(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.notinlove);
        mp.start();
    }
    public void playNotmuch(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.notmuch);
        mp.start();
    }
    public void playPainkillers(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.painkillers);
        mp.start();
    }
    public void playRapist(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.rapist);
        mp.start();
    }
    public void playRight(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.right);
        mp.start();
    }
    public void playSaythat(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.saythat);
        mp.start();
    }
    public void playSeeother(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.seeotherpeople);
        mp.start();
    }
    public void playShutup(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.shutup);
        mp.start();
    }
    public void playSmallpenis(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.smallpenisyoufag);
        mp.start();
    }
    public void playSpunkdrunk(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.spunkdrunk);
        mp.start();
    }
    public void playStartlistening(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.startlistening);
        mp.start();
    }
    public void playStilldo(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.stilldo);
        mp.start();
    }
    public void playStillloveyou(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.stillloveyou);
        mp.start();
    }
    public void playTimetomyself(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.timetomyself);
        mp.start();
    }
    public void playUh(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.uh);
        mp.start();
    }
    public void playUrbancenter(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.urbancenter);
        mp.start();
    }
    public void playYeah(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.yeah);
        mp.start();
    }
    public void playYes(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.yes);
        mp.start();
    }
    public void playYessir(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.yessir);
        mp.start();
    }
    public void playYouamorman(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.youamorman);
        mp.start();
    }
    public void playYouralesbian(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.yourealesbian);
        mp.start();
    }
    public void playYourfat(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.yourefat);
        mp.start();
    }
    public void playYourgay(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.youregay);
        mp.start();
    }
    public void playYouroverweight(View view){
        stopPlaying();
        mp = MediaPlayer.create(this, R.raw.youreoverweight);
        mp.start();
    }



}
