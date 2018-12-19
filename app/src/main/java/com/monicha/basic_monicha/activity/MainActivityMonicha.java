package com.monicha.basic_monicha.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.monicha.basic_monicha.R;

public class MainActivityMonicha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_monicha);
    }


    public void onListView(View view) {
        //pindah halaman
        Intent i = new Intent(this, BuahActivity.class);
        i.putExtra("kode",1);
        startActivity(i);
    }

    public void onGridView(View view) {
        Intent i = new Intent(this, BuahActivity.class);
        i.putExtra("kode",2);
        startActivity(i);
    }
}
