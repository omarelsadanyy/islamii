package com.example.new_islamii.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.new_islamii.R
import com.example.new_islamii.ui.Home.Homeactivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper())
            .postDelayed({
                starthomeactivity();
            }, 2000)

    }

    private fun starthomeactivity() {
        val intent: Intent = Intent(this, Homeactivity::class.java)
        startActivity(intent)
        finish()
    }

}