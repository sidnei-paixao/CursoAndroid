package com.example.telalista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val oListaItems = GeraLista(
      arrayListOf(
        ItemQuadro(null, "Teste 1", "Mensagem de texto 1"),
        ItemQuadro(null, "Teste 2", "Mensagem de texto 2"),
        ItemQuadro(null, "Teste 3", "Mensagem de texto 3"),
        ItemQuadro(null, "Teste 3", "Mensagem de texto excessivamente longa que ele deverá cortar na classe")
      )
    )

    findViewById<RecyclerView>(R.id.lstItems).apply {
      setHasFixedSize(true)
      layoutManager = LinearLayoutManager(context)
      adapter = oListaItems

    }
  }
}