package com.example.reaproveitamentolistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val oLista = AdaptadorLista(arrayListOf("Primeiro", "Segundo", "Terceiro"))

    findViewById<RecyclerView>(R.id.lstItems).apply {
      setHasFixedSize(true)
      layoutManager = LinearLayoutManager(context)
      adapter = oLista

      addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
    }
  }
}