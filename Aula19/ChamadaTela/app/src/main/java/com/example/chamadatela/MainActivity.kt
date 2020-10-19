package com.example.chamadatela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cmdAbrir.setOnClickListener { fnAbrirTela() }
    }

    fun fnAbrirTela()
    {
        startActivity( Intent(this, SegundaTela::class.java).putExtra("Cor", 0xffffff00))
    }
}