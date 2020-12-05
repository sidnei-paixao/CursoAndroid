package com.example.desafiows.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiows.R
import com.example.desafiows.model.ComicModel
import kotlinx.android.synthetic.main.comics_layout.view.*

class ComicsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
{
    private var imgCapa = itemView.findViewById<ImageView>(R.id.imgCapa)
    private var txtNome = itemView.findViewById<TextView>(R.id.txtNome)

    fun bind(revista: ComicModel)
    {
        //imgCapa
        txtNome.text = revista.results[0].title
    }
}
