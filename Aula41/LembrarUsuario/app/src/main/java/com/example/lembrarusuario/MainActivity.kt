package com.example.lembrarusuario

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.example.lembrarusuario.ui.login.LoginActivity

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Handler(Looper.getMainLooper()).postDelayed({
      if (!getSharedPreferences("LEMBRARUSUARIO", Context.MODE_PRIVATE).getBoolean("Notificacoes", true))
        startActivity(Intent(this, LoginActivity::class.java))
      else
        startActivity(Intent(this, PrincipalActivity::class.java))

      finish()
    }, 4000)
  }


}