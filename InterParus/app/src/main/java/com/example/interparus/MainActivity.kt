package com.example.interparus

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initWebView()
    }
    val ex =object : RuntimeException("Test"){}
    @RequiresApi(Build.VERSION_CODES.O)
    private fun initWebView() {
        webView = findViewById<WebView>(R.id.wb_main_activity)
        webView.settings.javaScriptEnabled = true
        webView.settings.safeBrowsingEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://interparus.com/")
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}