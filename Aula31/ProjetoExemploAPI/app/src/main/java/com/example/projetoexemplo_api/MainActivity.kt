package com.example.projetoexemplo_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import org.json.JSONArray
import java.net.URL
import java.nio.charset.Charset

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<TextView>(R.id.txtTeste).text = "Antes de chamar"
    Thread {
      val oRetorno = URL("http://cep.republicavirtual.com.br/web_cep.php?cep=02998060&formato=JSON").readText(Charsets.UTF_8)
      val oResult = Json(JsonConfiguration.Stable.copy(ignoreUnknownKeys = true)).parse(Retorno.serializer(), oRetorno)

      findViewById<TextView>(R.id.txtTeste).text = oResult.tipo_logradouro + " " + oResult.logradouro
    }.start()
    findViewById<TextView>(R.id.txtTeste).text = "Depois que chamou"

  }
}