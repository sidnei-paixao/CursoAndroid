package com.example.novaapi_testesapi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.novaapi_testesapi.R

//const val siteURL = "http://api.chucknorris.io/"

class MainActivity : AppCompatActivity()
{

  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    /*
    val clienteAPI = Retrofit.Builder().baseUrl(siteURL).addConverterFactory(GsonConverterFactory.create()).build()
    clienteAPI.create(CategoriaEndpoint::class.java).fnObterCategorias().enqueue(object : Callback<CategoriaModel>{
      override fun onFailure(call: Call<CategoriaModel>, t: Throwable)
      {
        Toast.makeText(this@MainActivity, "Erro ao obter dados", Toast.LENGTH_LONG).show()
      }

      override fun onResponse(call: Call<CategoriaModel>, response: Response<CategoriaModel>)
      {
        Toast.makeText(this@MainActivity, "Obteve dados", Toast.LENGTH_LONG).show()
      }
    })
    */
  }
}