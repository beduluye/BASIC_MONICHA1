package com.monicha.basic_monicha;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.monicha.basic_monicha.activity.MainActivityMonicha;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //untuk melakukan delay atau penundaan ke activity berikutnya
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah 3 detik delay
                startActivity(new Intent(SplashScreenActivity.this, MainActivityMonicha.class));
                //untuk menghilangkan / kill activity dalam memory/stack
                finish();
            }
        }, 3000);
    }
}
