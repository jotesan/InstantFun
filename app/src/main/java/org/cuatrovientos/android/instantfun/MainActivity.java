package org.cuatrovientos.android.instantfun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button comboBreaker;
    private Button darthVader;
    private Button doh;
    private Button fatality;
    private Button gaaaay;
    private Button hadouken;
    private Button homerBocadillo;
    private Button imBatman;
    private Button itsATrap;
    private Button kamehameha;
    private Button nyancat;
    private Button starWarsNoooo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comboBreaker = (Button) findViewById(R.id.comboBreaker);
        darthVader = (Button) findViewById(R.id.darthVader);
        doh = (Button) findViewById(R.id.doh);
        fatality = (Button) findViewById(R.id.fatality);
        gaaaay = (Button) findViewById(R.id.gaaaay);
        hadouken = (Button) findViewById(R.id.hadouken);
        homerBocadillo = (Button) findViewById(R.id.homerBocadillo);
        imBatman = (Button) findViewById(R.id.imBatman);
        itsATrap = (Button) findViewById(R.id.itsATrap);
        kamehameha = (Button) findViewById(R.id.kamehameha);
        nyancat = (Button) findViewById(R.id.nyancat);
        starWarsNoooo = (Button) findViewById(R.id.starWarsNoooo);
    }

    public void sound1(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.combo_breaker);
        mp.start();
    }

    public void sound2(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.darth_vader);
        mp.start();
    }

    public void sound3(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.doh);
        mp.start();
    }

    public void sound4(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fatality);
        mp.start();
    }

    public void sound5(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.gaaaay);
        mp.start();
    }

    public void sound6(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.hadouken);
        mp.start();
    }

    public void sound7(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.homer_bocadillo);
        mp.start();
    }

    public void sound8(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.im_batman);
        mp.start();
    }

    public void sound9(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.its_a_trap);
        mp.start();
    }

    public void sound10(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.kamehameha);
        mp.start();
    }

    public void sound11(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.nyancat);
        mp.start();
    }

    public void sound12(View view) {
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.star_wars_noooo);
        mp.start();
    }
}
