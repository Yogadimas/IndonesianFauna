package com.yogadimas.indonesianfauna.view

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.yogadimas.indonesianfauna.R


@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var layoutSplash: View
    private val durationTransition = 2000L
    private val durationAnim = 600L
    private val delayAnim = 300L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        viewSetup()

        layoutSplash = findViewById(R.id.include_splash)
        layoutSplash.alpha = 0f


        ObjectAnimator.ofFloat(layoutSplash, View.ALPHA, 1f).apply {
            duration = durationAnim
            startDelay = delayAnim
        }.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, durationTransition)

    }

    @Suppress("DEPRECATION")
    private fun viewSetup() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        supportActionBar?.hide()
    }
}
