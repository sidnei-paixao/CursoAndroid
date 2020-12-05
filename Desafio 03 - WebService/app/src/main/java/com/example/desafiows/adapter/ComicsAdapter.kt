package com.example.desafiows.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiows.R
import com.example.desafiows.model.ComicModel

class ComicsAdapter(private val dataset: List<ComicModel>): RecyclerView.Adapter<ComicsViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicsViewHolder
    {
        return ComicsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.comics_layout, parent, false))
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ComicsViewHolder, position: Int)
    {
        holder.bind(dataset[position])
    }
}