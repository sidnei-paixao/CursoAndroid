package com.example.calculoidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.frg_info.*
import java.util.*

class MainActivity : AppCompatActivity(), IComunicacao
{

  var oTelaInfo = frgInfo()
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    supportFragmentManager.beginTransaction().add(R.id.pnlSuperior, frgCampos()).commit()
    supportFragmentManager.beginTransaction().add(R.id.pnlInferior, oTelaInfo).commit()
  }

  override fun fnExibirMensagem(cMensagem: String)
  {
    Toast.makeText(this, cMensagem, Toast.LENGTH_LONG).show()
  }

  override fun fnCalcularIdade(cNome: String, nAnoNasc: Int)
  {
    if (nAnoNasc < 1800)
      oTelaInfo.txtInfo.text = "$cNome, este não parece um ano de nascimento válido. Tente novamente!"
    else
      if (nAnoNasc > Calendar.getInstance().get(1))
        oTelaInfo.txtInfo.text = "$cNome ainda não nasceu"
      else
        oTelaInfo.txtInfo.text = "$cNome, você tem ${Calendar.getInstance().get(1) - nAnoNasc} " + if(Calendar.getInstance().get(1) - nAnoNasc==1) "ano" else "anos"
  }
}