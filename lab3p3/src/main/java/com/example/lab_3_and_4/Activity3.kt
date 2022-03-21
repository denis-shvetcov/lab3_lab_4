package com.example.lab_3_and_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity3 : OptionMenuActivity(R.layout.activity3) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            )
        }
        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            finish()
        }
    }
}
