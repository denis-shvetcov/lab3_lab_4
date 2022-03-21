package com.example.lab_3_and_4

import android.content.Intent
import android.os.Bundle
import android.widget.Button

private const val REQUEST_CODE_2_TO_3 = 12345

class Activity2 : OptionMenuActivity(R.layout.activity2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.bnToThird).setOnClickListener {
            startActivityForResult(
                Intent(this, Activity3::class.java),
                REQUEST_CODE_2_TO_3
            )
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_2_TO_3 && resultCode == RESULT_CODE_GO_TO_1) {
            finish()
        }
    }
}
