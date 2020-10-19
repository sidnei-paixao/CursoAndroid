package com.example.calculoidade

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.frg_campos.view.*

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
        val oTela = inflater.inflate(R.layout.frg_campos, container, false)

        oTela.cmdCalcular.setOnClickListener {
            if(oTela.txtNome.text.trim().length==0 || oTela.txtAno.text.trim().length==0)
                Toast.makeText(context, "Informe seu nome e ano de nascimento", Toast.LENGTH_LONG).show()
            else
                if (oTela.txtAno.text.toString().toIntOrNull() ?: 0 == 0)
                    Toast.makeText(context, "Informe um ano de nascimento válido", Toast.LENGTH_LONG).show()
                else
                    oTelaPrincipal.fnCalcularIdade(oTela.txtNome.text.toString(), oTela.txtAno.text.toString().toInt()) }

        return oTela
    }

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        oTelaPrincipal = context as IComunicacao
    }

}