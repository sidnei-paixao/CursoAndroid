package com.example.calcidade

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_frg_campos.*
import kotlinx.android.synthetic.main.fragment_frg_campos.view.*
import java.util.*

class frgCampos : Fragment()
{

    lateinit var oTelaPrincipal: IComunicacao

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_frg_campos, container, false).cmdCalcular.setOnClickListener { oTelaPrincipal.fnEfetuarCalculo(Calendar.DATE, Calendar.DATE) }
        return inflater.inflate(R.layout.fragment_frg_campos, container, false)
        //cmdCalcular.setOnClickListener { (context as IComunicacao).fnEfetuarCalculo(Calendar.DATE, Calendar.DATE) }
    }

    override fun onAttach(context: Context)
    {
        super.onAttach(context)

        oTelaPrincipal = context as IComunicacao
        //cmdCalcular.setOnClickListener { Toast.makeText(context,"Entrou", Toast.LENGTH_LONG).show()/* (context as IComunicacao).fnEfetuarCalculo(Calendar.DATE, Calendar.DATE) */}
        //(context as IComunicacao).fnEfetuarCalculo(Calendar.DATE, Calendar.DATE)
    }


}