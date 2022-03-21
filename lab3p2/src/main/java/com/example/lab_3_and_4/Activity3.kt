package com.example.lab_3_and_4

import android.app.Activity
import android.os.Bundle
import android.widget.Button

const val RESULT_CODE_GO_TO_1 = Activity.RESULT_FIRST_USER + 1

class Activity3 : OptionMenuActivity(R.layout.activity3) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            setResult(RESULT_CODE_GO_TO_1)
            finish()
        }
        findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            finish()
        }
    }
}
