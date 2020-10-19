package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cmdAbrir1.setOnClickListener {
            val oAbrirTela = supportFragmentManager.beginTransaction()
            oAbrirTela.replace(R.id.pnlAbertura,Exemplo01()).commit()
        }
        cmdAbrir2.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.pnlAbertura,Exemplo02()).commit()
        }
    }
}