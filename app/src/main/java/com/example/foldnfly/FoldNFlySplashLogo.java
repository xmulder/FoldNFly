package com.example.foldnfly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class FoldNFlySplashLogo extends AppCompatActivity {

    private final int SPLASH_DISPLAY_DELAY=9190;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.foldnfly_splash_logo);

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent toMainActivity=new Intent( FoldNFlySplashLogo.this,MainActivity.class );
                FoldNFlySplashLogo.this.startActivity( toMainActivity );
                FoldNFlySplashLogo.this.finish();
            }
        },SPLASH_DISPLAY_DELAY );


    }
}
