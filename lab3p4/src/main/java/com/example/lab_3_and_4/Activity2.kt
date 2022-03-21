package com.example.lab_3_and_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity2 : OptionMenuActivity(R.layout.activity2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.toFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.toThird).setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
    }
}
