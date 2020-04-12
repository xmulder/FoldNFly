package com.example.foldnfly;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
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
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            webView.getSettings().setSafeBrowsingEnabled(false);
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(foldNFlyUrl);
    }
}
