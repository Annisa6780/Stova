package com.example.stava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.infinitelearning.stovaapp.R

class Diterima : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diterima)

        val button: Button = findViewById<Button>(R.id.Rwtsemua4)
        button.setOnClickListener {
            startActivity(Intent(this, Riwayat::class.java))
        }

        val button1: Button = findViewById<Button>(R.id.Rwtmenunggu4)
        button1.setOnClickListener {
            startActivity(Intent(this, Menunggu::class.java))
        }

        val button2: Button = findViewById<Button>(R.id.Rwtproses4)
        button2.setOnClickListener {
            startActivity(Intent(this, Diproses::class.java))
        }
    }
}