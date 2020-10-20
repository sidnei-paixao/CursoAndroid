package com.example.telalista

import android.media.Image

class ItemQuadro ()
{
    var oImagem: Int? = null
    var cNome: String? = null
    var cTexto: String? = null

    constructor(oImagem: Int?, cNome: String, cTexto: String): this()
    {
        this.oImagem = oImagem
        this.cNome = cNome
        this.cTexto = if(cTexto.trim().length>30) cTexto.substring(0, 25) + "..." else cTexto
    }
}