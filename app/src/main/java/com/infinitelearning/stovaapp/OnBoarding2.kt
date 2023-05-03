package com.infinitelearning.stovaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)

        val button: Button = findViewById<Button>(R.id.btn2)
        button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }
}