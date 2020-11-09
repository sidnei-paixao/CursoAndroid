package com.example.prjeventos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.prjeventos.R
import com.example.prjeventos.viewmodel.Contador

class MainActivity : AppCompatActivity()
{
  private lateinit var oContador: Contador

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //var nCont = MutableLiveData<Int>(0)

    findViewById<Button>(R.id.cmdAumentar).setOnClickListener{nCont++;findViewById<TextView>(R.id.txtTexto).text = nCont.toString()}
  }

  fun fnIniciarViewModel()
  {
    oContador = ViewModelProvider(this,(Contador::class.java).classLoader).get(Contador::class.java)
  }

}