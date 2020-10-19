package com.example.calcidade

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.fragment_frg_info.*
import java.util.*

class MainActivity : AppCompatActivity(), IComunicacao
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.pnlSuperior, frgCampos()).commit()
        supportFragmentManager.beginTransaction().add(R.id.pnlInferior, frgInfo()).commit()
    }

    override fun fnEfetuarCalculo(dAtual: Int, dNasc: Int) {
        Toast.makeText(this,"Entrou", Toast.LENGTH_LONG).show()
        frgInfo().txtMensagem.text = "Texto"
        val dialog: AlertDialog.Builder = AlertDialog.Builder(this)
dialog.setTitle("Hello")
    .setMessage("texto qualquer")
    .setPositiveButton("Ok",
        DialogInterface.OnClickListener { dialoginterface, i -> }).show()
        finish()

    }
}