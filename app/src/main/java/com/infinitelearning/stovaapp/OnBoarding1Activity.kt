package com.infinitelearning.stovaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

        val button: Button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener {
            startActivity(Intent(this,OnBoarding2Activity::class.java))
        }
    }
}