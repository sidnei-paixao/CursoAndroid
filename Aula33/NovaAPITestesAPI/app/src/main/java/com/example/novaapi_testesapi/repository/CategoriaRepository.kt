package com.example.novaapi_testesapi.repository

import com.example.novaapi_testesapi.model.CategoriaModel

class CategoriaRepository
{
    fun fnObterCategorias():List<String>
    {
        return listOf("Teste","Segundo")
    }
}
