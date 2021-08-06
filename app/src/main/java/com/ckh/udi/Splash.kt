package com.ckh.udi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent = Intent(this,LoginActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(intent)
        },2000)
    }
}