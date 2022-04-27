package com.example.appdolarreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var precodolar: EditText
    private lateinit var quantidadedolar: EditText
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_inicial)


        precodolar = findViewById<EditText>(R.id.precodolar)
        quantidadedolar = findViewById<EditText>(R.id.quantidadedolar)

         txtResultado = findViewById<TextView>(R.id.txtresultado)

    }

    fun calcular(view: View) {

        val quantidadedolar: Double = quantidadedolar.getText().toString().toDouble()
        val precodolar: Double = precodolar.getText().toString().toDouble()

        val totalreal = precodolar * quantidadedolar

//        txtResultado.setText("R$:" + totalreal)
        txtResultado.text = "R$" + totalreal.toString()

    }

}


