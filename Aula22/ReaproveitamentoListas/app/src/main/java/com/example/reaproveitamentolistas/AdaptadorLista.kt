package com.example.reaproveitamentolistas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdaptadorLista(private val oDados: List<String>): RecyclerView.Adapter<AdaptadorLista.oApresentacao>()
{
    class oApresentacao(oLista: View): RecyclerView.ViewHolder(oLista)
    {
        private val oTexto by lazy { oLista.findViewById<TextView>(R.id.txtItem) }

        fun bind(cValor: String)
        {
            oTexto.text = cValor
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): oApresentacao
    {
        return oApresentacao(LayoutInflater.from(parent.context).inflate(R.layout.lista_items, parent, false))
    }

    override fun getItemCount() = oDados.size

    override fun onBindViewHolder(holder: oApresentacao, position: Int)
    {
        holder.bind(oDados[position])
    }
}