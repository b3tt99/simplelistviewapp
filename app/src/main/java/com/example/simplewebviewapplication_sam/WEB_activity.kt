package com.example.simplewebviewapplication_sam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WEB_activity : AppCompatActivity() {
    lateinit var myWeb : WebView
    lateinit var myweb2 : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        myWeb = findViewById(R.id.myweb1)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://www.absabank.co.ke")





    }
}