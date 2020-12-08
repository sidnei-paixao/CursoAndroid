package com.example.lembrarusuario

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        findViewById<TextView>(R.id.txtNomeUsuario).setText(getSharedPreferences("LEMBRARUSUARIO", Context.MODE_PRIVATE).getString("NomeUsuario", "Usuario"))
    }
}