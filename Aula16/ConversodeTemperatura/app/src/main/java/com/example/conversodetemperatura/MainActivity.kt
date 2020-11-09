package com.example.conversodetemperatura

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

    findViewById<Button>(R.id.cmdConverter).setOnClickListener { fnConversao(findViewById<EditText>(R.id.txtValor).getText().toString().toDouble()) }
  }

  fun fnConversao(nValor: Double)
  {
    findViewById<TextView>(R.id.txtResult).setText ((((nValor * 9) / 5) + 32).toString() + " ºF")
  }
}