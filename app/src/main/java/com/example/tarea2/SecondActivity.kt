package com.example.tarea2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editTextDato2 = findViewById<TextView>(R.id.editTextDato2)
        val btnEnviar2 = findViewById<Button>(R.id.btnEnviar2)

        val dato1 = intent.getStringExtra("dato")

        btnEnviar2.setOnClickListener {
            val dato2 = editTextDato2.text.toString()
            val intent = Intent(this, ThirdActivity::class.java).apply {
                putExtra("dato1", dato1)
                putExtra("dato2", dato2)
            }
            startActivity(intent)
        }
    }
}
