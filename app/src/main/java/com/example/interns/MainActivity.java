package com.example.interns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView logo;
TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo=findViewById(R.id.logo);
        welcome=findViewById(R.id.welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Map.class);
                startActivity(i);
                finish();
            }
        },3000);

        logo.animate().translationY(-1500).setDuration(1000).setStartDelay(1000);
        welcome.animate().translationY(1000).setDuration(1000).setStartDelay(1000);

    }
}