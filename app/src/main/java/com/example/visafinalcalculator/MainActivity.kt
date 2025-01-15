package com.example.visafinalcalculator

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Vize Final Hesaplama"

        window.statusBarColor = Color.parseColor("#2196F3")

        val visaNote = findViewById<EditText>(R.id.visaNote)
        val finalNote = findViewById<EditText>(R.id.finalNote)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultText = findViewById<TextView>(R.id.result)

        calculateButton.setOnClickListener {
            val visa = visaNote.text.toString().toDoubleOrNull() ?: 0.0
            val final = finalNote.text.toString().toDoubleOrNull() ?: 0.0
            val total = (visa * 0.4) + (final * 0.6)
            resultText.text = "Toplam Not: %.2f".format(total)
        }
    }
}
