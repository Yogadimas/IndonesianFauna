package com.yogadimas.indonesianfauna.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yogadimas.indonesianfauna.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = getString(R.string.title_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}