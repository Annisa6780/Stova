package com.example.stava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.infinitelearning.stovaapp.R

class Menunggu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menunggu)

        val button: Button = findViewById<Button>(R.id.Rwtsemua2)
        button.setOnClickListener {
            startActivity(Intent(this, Riwayat::class.java))
        }

        val button1: Button = findViewById<Button>(R.id.Rwtproses2)
        button1.setOnClickListener {
            startActivity(Intent(this, Diproses::class.java))
        }

        val button2: Button = findViewById<Button>(R.id.Rwtditerima2)
        button2.setOnClickListener {
            startActivity(Intent(this, Diterima::class.java))
        }
    }
}