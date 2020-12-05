package com.example.desafiows.repository

import com.example.desafiows.model.ComicModel
import com.example.desafiows.network.NetworkUtils
import retrofit2.http.GET
import retrofit2.http.Query

interface ComicsEndpoint
{
    @GET("v1/public/comics")
    suspend fun obterLista(@Query("apikey") chaveAPI: String, @Query("ts") dataHora: String, @Query("hash") codigoHASH: String): MutableList<ComicModel>

    companion object
    {
        val endpoint:ComicsEndpoint by lazy { NetworkUtils.getRetrofit().create(ComicsEndpoint::class.java) }
    }
}