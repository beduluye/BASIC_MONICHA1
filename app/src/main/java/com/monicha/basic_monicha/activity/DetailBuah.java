package com.monicha.basic_monicha.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.monicha.basic_monicha.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailBuah extends AppCompatActivity {

    @BindView(R.id.imgbuah)
    ImageView imgbuah;
    @BindView(R.id.txtdetailbuah)
    TextView txtdetailbuah;
    private Intent tangkapdata;
    private int datawiki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//tangkap data
        tangkapdata = getIntent();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datawiki = tangkapdata.getIntExtra("lB",0);
                Intent kirimdata = new Intent(DetailBuah.this,WikiBuahActivity.class);
                kirimdata.putExtra("lB", datawiki);
                startActivity(kirimdata);
            }
        });
        setView();
    }

    private void setView() {
        txtdetailbuah.setText(tangkapdata.getIntExtra("dB",0));
        imgbuah.setImageResource(tangkapdata.getIntExtra("gB",0));

        ActionBar bar = getSupportActionBar();
        bar.setTitle(tangkapdata.getStringExtra("nB"));
    }
}
