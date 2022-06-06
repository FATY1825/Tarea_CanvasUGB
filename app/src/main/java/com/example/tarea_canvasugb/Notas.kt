package com.example.tarea_canvasugb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_canvas_ugb.*
import kotlinx.android.synthetic.main.activity_notas.*

class Notas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notas)

        webnota.webChromeClient = object : WebChromeClient(){

        }

        webnota.webViewClient=object : WebViewClient(){

        }
        val settings: WebSettings = webnota.settings
        settings.javaScriptEnabled=true

        webnota.loadUrl("https://estudiantes.ugb.edu.sv/Notas")
    }
}