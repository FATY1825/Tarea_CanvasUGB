package com.example.tarea_canvasugb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_canvas_ugb.*
import kotlinx.android.synthetic.main.activity_notas.*

class Canvas_UGB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canvas_ugb)

        webcanvas.webChromeClient = object : WebChromeClient(){

        }

        webcanvas.webViewClient=object : WebViewClient(){

        }
        val settings: WebSettings = webcanvas.settings
        settings.javaScriptEnabled=true

        webcanvas.loadUrl("https://ugb.instructure.com")
    }
}