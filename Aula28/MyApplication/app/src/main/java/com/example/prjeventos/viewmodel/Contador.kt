package com.example.prjeventos.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Contador :ViewModel()
{
    var nCont = MutableLiveData<Int>(0)

    fun fnIncrementar()
    {
        nCont.value = nCont.value!! + 1
    }
}