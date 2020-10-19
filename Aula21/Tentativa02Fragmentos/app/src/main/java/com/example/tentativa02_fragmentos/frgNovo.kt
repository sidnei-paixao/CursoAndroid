package com.example.tentativa02_fragmentos

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.frg_novo.view.*
import java.security.Principal


class frgNovo : Fragment()
{

    lateinit var oTelaPrincipal: IComunicacao

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        val oTela = inflater.inflate(R.layout.frg_novo, container, false)
        //oTela.cmdExemplo.setOnClickListener { oTelaPrincipal.fnModificar("Um texto qualquer") }
        oTela.cmdExemplo.setOnClickListener { oTelaPrincipal.nIdade = 100; oTelaPrincipal.fnModificar("Tchu") }
        return oTela
    }

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        oTelaPrincipal = context as IComunicacao
    }
}