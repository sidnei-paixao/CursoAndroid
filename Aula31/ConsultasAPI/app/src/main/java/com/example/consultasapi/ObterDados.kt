package com.example.consultasapi

import retrofit2.Call
import retrofit2.http.GET

interface ObterDados
{
    @GET("location")
    fun fnPersonagens(): Call<Localidades>
}