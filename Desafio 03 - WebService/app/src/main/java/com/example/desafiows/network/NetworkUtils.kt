package com.example.desafiows.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils
{

    companion object
    {
        fun getRetrofit(baseURL: String = BASE_URL): Retrofit = Retrofit.Builder().
            baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build()

        private const val BASE_URL = "https://gateway.marvel.com/"
    }
}