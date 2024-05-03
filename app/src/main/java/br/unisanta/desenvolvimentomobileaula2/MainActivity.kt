package br.unisanta.desenvolvimentomobileaula2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numUm = findViewById<EditText>(R.id.numUm)
        val numDois = findViewById<EditText>(R.id.numDois)
        val btnCalc = findViewById<Button>(R.id.btn_Calcular)
        val resp = findViewById<TextView>(R.id.text_view_resp)

        btnCalc.setOnClickListener{
            val valor1 = numUm.text.toString().toInt()
            val valor2 = numDois.text.toString().toInt()
            val soma = valor1 + valor2
            resp.text = "$valor1 + $valor2 = $soma"
        }
    }
}



