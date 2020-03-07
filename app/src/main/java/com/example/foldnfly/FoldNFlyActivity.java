package com.example.foldnfly;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class FoldNFlyActivity extends AppCompatActivity {
    private String foldNFlyUrl;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.foldnfly_display);
        foldNFlyUrl=getIntent().getStringExtra("foldNFly_url");
        WebView webView=(WebView)findViewById(R.id.foldNfly_web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(foldNFlyUrl);
    }
}
