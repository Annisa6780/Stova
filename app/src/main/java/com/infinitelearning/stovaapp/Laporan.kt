package com.example.stava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.infinitelearning.stovaapp.R

class Laporan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laporan)

        val button: Button = findViewById<Button>(R.id.LaporanAnak)
        button.setOnClickListener {
            startActivity(Intent(this, LaporanAnak::class.java))
        }

        val button1: Button = findViewById<Button>(R.id.LaporanWanita)
        button1.setOnClickListener {
            startActivity(Intent(this, LaporanWanita::class.java))
        }
        val button2: Button = findViewById<Button>(R.id.LaporanUmum)
        button2.setOnClickListener {
            startActivity(Intent(this, LaporanUmum::class.java))
        }
        val button3: Button = findViewById<Button>(R.id.Riwayat)
        button3.setOnClickListener {
            startActivity(Intent(this, Riwayat::class.java))
        }
    }
}