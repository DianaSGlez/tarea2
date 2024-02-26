package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextDato = findViewById<TextView>(R.id.editTextDato)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val dato = editTextDato.text.toString()
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("dato", dato)
            }
            startActivity(intent)
        }
    }
}
