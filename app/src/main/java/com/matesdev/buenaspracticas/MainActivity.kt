package com.matesdev.buenaspracticas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var etNombre : EditText
    lateinit var btButton : Button
    lateinit var textNombre : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNombre = findViewById(R.id.etNombre)
        btButton = findViewById(R.id.btText)
        textNombre = findViewById(R.id.textView)


        btButton.setOnClickListener {
            // es preferible declarar las variables
            // podemos poner to string para evitar el editable, pero no es necesario.. savo que no usemos variable
            val nombre = etNombre.text.toString()
            textNombre.text = "Hola $nombre"


            Toast.makeText(this, "Mi nombre es: $nombre", Toast.LENGTH_LONG).show()
        }
    }
}