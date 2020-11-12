package com.example.outroteste_splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)

    startActivity(Intent(this, MainActivity::class.java))
    Handler(Looper.getMainLooper()).postDelayed({setContentView(R.layout.activity_main)}, 4000)
  }
}