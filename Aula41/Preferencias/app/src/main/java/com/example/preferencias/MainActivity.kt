package com.example.preferencias

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


    findViewById<Switch>(R.id.chkHabilitar).apply{
      this.isChecked = getSharedPreferences("APLICACAO", Context.MODE_PRIVATE).getBoolean("Notificacaoes", false)

      setOnCheckedChangeListener{ _,isChecked ->
        getSharedPreferences("APLICACAO", Context.MODE_PRIVATE).edit().putBoolean("Notificacaoes", isChecked).apply()
      }
    }
  }
}