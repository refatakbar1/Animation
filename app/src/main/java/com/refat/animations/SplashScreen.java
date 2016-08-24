package com.refat.animations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        image = (ImageView) findViewById(R.id.imageView);

        image.animate().scaleXBy(.5f).scaleYBy(.5f).setDuration(3000);

        Intent i = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(i);
    }
}
