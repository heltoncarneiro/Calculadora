package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    fun somar(view: View) {
        val editTextNum1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNum2 = findViewById<EditText>(R.id.editTextNumber2)
        val resultadoView = findViewById<TextView>(R.id.textView)

        val num1Text = editTextNum1.text.toString()
        val num2Text = editTextNum2.text.toString()

        if (num1Text.isNotEmpty() && num2Text.isNotEmpty()) {
            val num1 = num1Text.toDoubleOrNull()
            val num2 = num2Text.toDoubleOrNull()

            if (num1 != null && num2 != null) {
                resultadoView.text = "Resultado: ${num1 + num2}"
            } else {
                resultadoView.text = "Por favor, insira números válidos."
            }
        } else {
            resultadoView.text = "Por favor, preencha ambos os números."
        }
    }
    fun subtrair(view: View) {
        val editTextNum1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNum2 = findViewById<EditText>(R.id.editTextNumber2)
        val resultadoView = findViewById<TextView>(R.id.textView)

        val num1Text = editTextNum1.text.toString()
        val num2Text = editTextNum2.text.toString()

        if (num1Text.isNotEmpty() && num2Text.isNotEmpty()) {
            val num1 = num1Text.toDoubleOrNull()
            val num2 = num2Text.toDoubleOrNull()

            if (num1 != null && num2 != null) {
                resultadoView.text = "Resultado: ${num1 - num2}"
            } else {
                resultadoView.text = "Por favor, insira números válidos."
            }
        } else {
            resultadoView.text = "Por favor, preencha ambos os números."
        }
    }
    fun multiplicar(view: View) {
        val editTextNum1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNum2 = findViewById<EditText>(R.id.editTextNumber2)
        val resultadoView = findViewById<TextView>(R.id.textView)

        val num1Text = editTextNum1.text.toString()
        val num2Text = editTextNum2.text.toString()

        if (num1Text.isNotEmpty() && num2Text.isNotEmpty()) {
            val num1 = num1Text.toDoubleOrNull()
            val num2 = num2Text.toDoubleOrNull()

            if (num1 != null && num2 != null) {
                resultadoView.text = "Resultado: ${num1 * num2}"
            } else {
                resultadoView.text = "Por favor, insira números válidos."
            }
        } else {
            resultadoView.text = "Por favor, preencha ambos os números."
        }
    }
    fun dividir(view: View) {
        val editTextNum1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNum2 = findViewById<EditText>(R.id.editTextNumber2)
        val resultadoView = findViewById<TextView>(R.id.textView)

        val num1Text = editTextNum1.text.toString()
        val num2Text = editTextNum2.text.toString()

        if (num1Text.isNotEmpty() && num2Text.isNotEmpty()) {
            val num1 = num1Text.toDoubleOrNull()
            val num2 = num2Text.toDoubleOrNull()
            if (num2 == 0.0 || num1 == 0.0) {
                resultadoView.text = "Erro: Divisão por zero."
            }else if (num1 != null && num2 != null) {
                resultadoView.text = "Resultado: ${num1 / num2}"
            }else {
                resultadoView.text = "Por favor, insira números válidos."
            }
        } else {
            resultadoView.text = "Por favor, preencha ambos os números."
        }
    }
}
