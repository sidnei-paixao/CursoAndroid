package com.example.exerccios_eventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.cmdProcessar).setOnClickListener { findViewById<TextView>(R.id.txtResult).setText("Seu nome é ${findViewById<TextView>(R.id.txtNome).getText()}") }
  }
}