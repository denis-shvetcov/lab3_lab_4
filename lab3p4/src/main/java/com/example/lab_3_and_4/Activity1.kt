package com.example.lab_3_and_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Activity1 : OptionMenuActivity(R.layout.activity1) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.toSecond).setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}
