package com.example.venkat.viewsswitching;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final WebView web = (WebView) findViewById(R.id.webview);
        // Enable javascript
        web.getSettings().setJavaScriptEnabled(true);

        // Set WebView client
        web.setWebChromeClient(new WebChromeClient());

        web.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        web.loadUrl("https://google.com");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Activity4.class);
                startActivity(intent);
                finish();
            }

        }, 5000);
    }
}
