package com.generation.view_model_e_live_data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    /*
    LiveData
    MutableLiveData
     */

    var cont = MutableLiveData<Int>(0)

    fun addNum(){
        cont.value = cont.value?.plus(1)
    }

}