package com.example.lab_3_and_4

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityAbout : AppCompatActivity(R.layout.activity_about) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<TextView>(R.id.text).setOnClickListener {
            startActivity(
                Intent(this, ActivitySettings::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
            )
        }
    }
}
