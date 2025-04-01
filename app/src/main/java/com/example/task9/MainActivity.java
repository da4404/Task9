package com.example.task9;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    WebView wV;
    Button go;
    String stringUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edit_text__);
        go=findViewById(R.id.button_);
        wV =(WebView)findViewById(R.id.wV);

        wV.getSettings().setJavaScriptEnabled(true);
        wV.getSettings().setLoadWithOverviewMode(true);
        wV.getSettings().setDomStorageEnabled(true);
        wV.getSettings().setUseWideViewPort(true);
        wV.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);

                return true;
            }

        });

    }

    public void go1(View view)
    {
        stringUrl= editText.getText().toString();
        wV.loadUrl(stringUrl);
    }

    private class MyWebViewClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}