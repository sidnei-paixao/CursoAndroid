package com.example.telalista

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GeraLista (private val oDados: List<ItemQuadro>): RecyclerView.Adapter<GeraLista.Apresentacao>()
{
    class Apresentacao(oLista: View): RecyclerView.ViewHolder(oLista)
    {
        private val oImagem by lazy{oLista.findViewById<ImageView>(R.id.imgFoto)}
        private val oNome by lazy{oLista.findViewById<TextView>(R.id.txtNome)}
        private val oTexto by lazy{oLista.findViewById<TextView>(R.id.txtTexto)}

        fun bind(oValor: ItemQuadro)
        {
            oImagem.setImageDrawable(Drawable.createFromPath("@layout/ic_foto_32dp.xml"))
            oNome.setText(oValor.cNome)
            oNome.setText(oValor.cTexto)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Apresentacao
    {
        return Apresentacao(LayoutInflater.from(parent.context).inflate(R.layout.quadro_lista, parent, false))
    }

    override fun getItemCount() = oDados.size

    override fun onBindViewHolder(holder: Apresentacao, position: Int)
    {
        holder.bind(oDados[position])
    }
}