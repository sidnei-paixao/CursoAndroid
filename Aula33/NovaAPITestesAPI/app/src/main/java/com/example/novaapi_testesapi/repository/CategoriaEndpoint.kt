package com.example.novaapi_testesapi.repository

import com.example.novaapi_testesapi.model.CategoriaModel
import retrofit2.Call
import retrofit2.http.GET

interface CategoriaEndpoint
{
    @GET("categories")
    fun fnObterCategorias():Call<CategoriaModel>
}