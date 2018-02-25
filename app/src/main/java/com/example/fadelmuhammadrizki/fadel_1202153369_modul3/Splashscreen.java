package com.example.fadelmuhammadrizki.fadel_1202153369_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {
    private int SplashInterval = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

//Menghinlangkan head atau navigasi pada SplashScreen Activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //berpindah dari splashscreen ke menu list utamanya
                startActivity(new Intent(Splashscreen.this, Login.class));

                //menampilkan toast
                Toast.makeText(Splashscreen.this, "WELCOME", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashInterval);
    }
}
