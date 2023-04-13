package com.example.simplewebviewapplication_sam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnabsa : Button
    private lateinit var btnkcb : Button
    private lateinit var btnicea : Button
    private lateinit var btnworldbank : Button
    private lateinit var btncoop : Button
    private lateinit var btnequity : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnabsa = findViewById(R.id.BTNABSA)
        btnkcb = findViewById(R.id.BTNKCB)
        btnicea = findViewById(R.id.BTNICEA)
        btnworldbank = findViewById(R.id.BTNWORLDBANK)
        btncoop = findViewById(R.id.BTNCOOP)
        btnequity = findViewById(R.id.BTNEQUITY)

            btnabsa.setOnClickListener {
            val gotoweb = Intent(this, WEB_activity::class.java)
            startActivity(gotoweb)


           }


        }








    }
}