package com.example.stava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.infinitelearning.stovaapp.R

class Riwayat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)

        val button: Button = findViewById<Button>(R.id.Rwtmenunggu)
        button.setOnClickListener {
            startActivity(Intent(this, Menunggu::class.java))
        }

        val button1: Button = findViewById<Button>(R.id.Rwtproses)
        button1.setOnClickListener {
            startActivity(Intent(this, Process::class.java))
        }

        val button2: Button = findViewById<Button>(R.id.Rwtditerima)
        button2.setOnClickListener {
            startActivity(Intent(this, Diterima::class.java))
        }
    }
}