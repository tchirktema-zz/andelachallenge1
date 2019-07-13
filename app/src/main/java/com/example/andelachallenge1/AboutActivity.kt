package com.example.andelachallenge1

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about.*
import android.net.http.SslError
import android.webkit.SslErrorHandler




class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        // Set appBar title
        setTitle(R.string.about_alc)

        // Setting WebView
        webview.settings.javaScriptEnabled = true
        webview.settings.setSupportZoom(false)
        webview.webViewClient = object : WebViewClient(){
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed()
            }

        }
        //launch a webView
        webview.loadUrl("https://andela.com/alc/")
    }



}
