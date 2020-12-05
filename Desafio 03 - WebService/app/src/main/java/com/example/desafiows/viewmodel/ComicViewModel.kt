package com.example.desafiows.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.desafiows.model.ComicModel
import com.example.desafiows.repository.ComicRepository
import kotlinx.coroutines.Dispatchers


class ComicViewModel(private val repositorio: ComicRepository): ViewModel()
{
    private var revistas: List<ComicModel> = listOf()

    fun obterLista() = liveData(Dispatchers.IO) {
        val resposta = repositorio.obterLista()
        revistas = resposta
        emit(resposta)
    }

    class ComicViewModelFactory(private val repository: ComicRepository): ViewModelProvider.Factory
    {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T
        {
            return ComicViewModel(repository) as T
        }
    }
}