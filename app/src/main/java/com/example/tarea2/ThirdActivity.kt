package com.example.tarea2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val intent = intent
        val dato1 = intent.getStringExtra("dato1")
        val dato2 = intent.getStringExtra("dato2")

        val textViewDatos = findViewById<TextView>(R.id.textViewDatos)

        val datosConcatenados = "Bienvenido/a: $dato1, tu municipio es: $dato2"
        textViewDatos.text = datosConcatenados
    }
}
