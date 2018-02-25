package com.example.raftiana.sitiraftianaputri_1202151365_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Raftiana on 23/02/2018.
 */

public class SplashScreenActivity extends AppCompatActivity {

    private static int splashInterval = 5000; // waktu berapa lama splash screen muncul

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // agar action bar tidak muncul

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); // agar splashscreen ditampilkan dengan full screen

        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            //ketika splashscreen muncul maka akan langsung mengeksekusi method ini
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(i);

                //jeda selesai Splashscreen
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub
            }
        }, splashInterval);

    }

    ;

}
