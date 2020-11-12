package com.example.consultasapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    var oLocalidades = fnObterDados("https://rickandmortyapi.com/api/").create(ObterDados::class.java)

    oLocalidades.fnPersonagens().enqueue(object: Callback<Localidades>
    {
      override fun onFailure(call: Call<Localidades>, t: Throwable)
      {

      }

      override fun onResponse(call: Call<Localidades>, response: Response<Localidades>)
      {
        val oResult = response.body()
        Toast.makeText(this@MainActivity, "TEXTO QUALQUER", Toast.LENGTH_LONG).show()
      }

    })
  }

  fun fnObterDados(cURL: String): Retrofit = Retrofit.Builder().baseUrl(cURL).addConverterFactory(GsonConverterFactory.create()).build()

}