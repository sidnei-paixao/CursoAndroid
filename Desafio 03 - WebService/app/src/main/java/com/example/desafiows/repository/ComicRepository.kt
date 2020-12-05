package com.example.desafiows.repository

class ComicRepository
{
    private val clienteComics = ComicsEndpoint.endpoint

    suspend fun obterLista() = clienteComics.obterLista("6eb7e8896ec5850c52515a8a23ee97f0", "2020-12-05 00:48:38", "b6440f096115e3ae6a6f532bb5e5111e")
}