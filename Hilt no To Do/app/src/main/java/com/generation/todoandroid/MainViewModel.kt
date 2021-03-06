package com.generation.todoandroid

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todoandroid.api.Repository
import com.generation.todoandroid.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (
    private val repository : Repository
        ) : ViewModel (){

    private val _mycategoriaResponse=
        MutableLiveData<Response<List<Categoria>>>()

    val myCotegoriaResponse: LiveData<Response<List<Categoria>>> =
        _mycategoriaResponse

    init {
        listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch {
            try {
                val response = repository.listCategoria()
                _mycategoriaResponse.value = response
            } catch (e: Exception){
                Log.d("Erro", e.message.toString())
            }
        }
    }

}