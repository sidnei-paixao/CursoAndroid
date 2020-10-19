package com.example.tentativa02_fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IComunicacao
{

  override var nIdade: Int=0

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    supportFragmentManager.beginTransaction().add(R.id.pnlSuperior, frgNovo()).commit()
  }



  override fun fnModificar(cNovoValor: String)
  {
    txtExemplo.setText(cNovoValor + nIdade)
  }
}