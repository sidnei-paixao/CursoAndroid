package com.example.telalista

import android.media.Image

class ItemQuadro ()
{
    var oImagem: Image? = null
    var cNome: String? = null
    var cTexto: String? = null

    constructor(oImagem: Image?, cNome: String, cTexto: String): this()
    {
        this.oImagem = oImagem
        this.cNome = cNome
        this.cTexto = if(cTexto.trim().length>50) cTexto.substring(1, 50) + "..." else cTexto
    }
}