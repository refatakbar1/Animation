package com.refat.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);

        //text.animate().rotationXBy(180f);
        //text.animate().rotation(360f).setDuration(3000);
        //text.animate().scaleXBy(-.5f).setDuration(3000);
        //text.animate().scaleXBy(.5f).setDuration(3000);
        //text.animate().scaleYBy(-.5f).setDuration(3000);

        text.animate().translationXBy(-1000f).setDuration(3000);
    }
}
