package com.monicha.basic_monicha.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.monicha.basic_monicha.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WikiBuahActivity extends AppCompatActivity {

    @BindView(R.id.webbuah)
    WebView webbuah;
    private int linkbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiki_buah);
        ButterKnife.bind(this);
        Intent tangkapdata =getIntent();
        //setting webview
        webbuah.getSettings().setJavaScriptEnabled(true);
        webbuah.setWebViewClient(new WebViewClient());
        linkbuah = tangkapdata.getIntExtra("lB",0);
        webbuah.loadUrl(getResources().getString(linkbuah));
    }
}
