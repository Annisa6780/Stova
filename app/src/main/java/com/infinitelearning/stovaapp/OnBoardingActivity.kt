package com.infinitelearning.stovaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            val intent = Intent(this, OnBoarding1Activity::class.java)
            startActivity(intent)
        }
    }
}