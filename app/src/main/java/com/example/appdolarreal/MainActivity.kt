package com.example.appdolarreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     private lateinit var precodolar: EditText
     private lateinit var quantidadedolar: EditText
     private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val precodolar = findViewById<EditText>(R.id.precodolar)
        val quantidadedolar = findViewById<EditText>(R.id.quantidadedolar)

        val txtresultado = findViewById<TextView>(R.id.txtresultado)
    }

    fun calcular(view: View) {

        val quantidadedolar: Double = quantidadedolar.getText().toString()
        val precodolar: Double = precodolar.getText().toString()
        val totalreal = precodolar * quantidadedolar
        txtResultado.setText("R$:"+ totalreal)

    }

}


