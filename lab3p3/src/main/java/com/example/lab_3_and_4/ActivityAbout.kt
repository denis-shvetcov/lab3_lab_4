package com.example.lab_3_and_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ActivityAbout : AppCompatActivity(R.layout.activity_about) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
