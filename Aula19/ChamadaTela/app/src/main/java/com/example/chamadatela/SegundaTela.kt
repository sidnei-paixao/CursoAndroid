package com.example.chamadatela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        this.window.decorView.setBackgroundColor(intent.getIntExtra("Cor", 0xffff00ff.toInt()))
        Toast.makeText(this, "Tela aberta!", Toast.LENGTH_SHORT).show()
    }
}