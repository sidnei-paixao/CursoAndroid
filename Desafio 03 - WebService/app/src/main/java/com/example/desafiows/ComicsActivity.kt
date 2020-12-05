package com.example.desafiows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiows.adapter.ComicsAdapter
import com.example.desafiows.model.ComicModel
import com.example.desafiows.repository.ComicRepository
import com.example.desafiows.viewmodel.ComicViewModel

class ComicsActivity : AppCompatActivity()
{
    private lateinit var _viewModel: ComicViewModel
    private lateinit var _listaAdapter: ComicsAdapter
    private var _listaRevistas = mutableListOf<ComicModel>()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comics)

        _listaAdapter = ComicsAdapter(_listaRevistas)
        findViewById<RecyclerView>(R.id.objListaRevista).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = _listaAdapter
        }

        _viewModel = ViewModelProvider(this, ComicViewModel.ComicViewModelFactory(ComicRepository())).get(ComicViewModel::class.java)
        _viewModel.obterLista().observe(this){
            exibirLista(it)
        }

    }

    private fun exibirLista(lista: List<ComicModel>)
    {
        lista?.let {
            _listaRevistas.addAll(lista)
            _listaAdapter.notifyDataSetChanged()
        }
    }

}