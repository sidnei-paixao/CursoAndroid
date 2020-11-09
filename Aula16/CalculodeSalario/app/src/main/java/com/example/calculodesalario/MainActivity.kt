package com.example.calculodesalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<EditText>(R.id.txtHoras).setSelectAllOnFocus(true)
    findViewById<EditText>(R.id.txtValor).setSelectAllOnFocus(true)
    findViewById<Button>(R.id.cmdCalcular).setOnClickListener { fnCalcular() }
  }

  fun fnCalcular()
  {

    val nHoras = findViewById<EditText>(R.id.txtHoras).text.toString().toDoubleOrNull() ?: 0.0
    val nSalario = findViewById<EditText>(R.id.txtValor).text.toString().toDoubleOrNull() ?: 0.0

    findViewById<TextView>(R.id.txtResult).setText("R$ %.2f".format(nHoras * nSalario))
  }
}