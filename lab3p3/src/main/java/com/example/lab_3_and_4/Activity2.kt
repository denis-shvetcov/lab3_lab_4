package com.example.lab_3_and_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity2 : OptionMenuActivity(R.layout.activity2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.bnToThird).setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
    }
}
