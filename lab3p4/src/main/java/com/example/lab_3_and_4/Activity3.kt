package com.example.lab_3_and_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity3 : OptionMenuActivity(R.layout.activity3) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.toFirst).setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }
        findViewById<Button>(R.id.toSecond).setOnClickListener {
            finish()
        }
    }
}
