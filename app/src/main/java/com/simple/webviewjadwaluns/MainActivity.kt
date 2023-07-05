package com.simple.webviewjadwaluns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    // deklarasi webview
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // menghilangkan header dan status bar
        supportActionBar?.hide()
        //window.setFlags(windowManager.LayoutParams.FLAG_FULLSCREEN, windowManager.LayoutParams.FLAG_FULLSCREEN)

        webView = findViewById(R.id.WV)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://ocw.uns.ac.id/")

        // web setting
        val webSettings = webView.settings

        // mengaktifkan javascript
        webSettings.javaScriptEnabled = true

        // mengaktifkan tool seperti bootstrap
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        } else{
            super.onBackPressed()
        }

    }
}