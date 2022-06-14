package com.generation.todoandroid.api

import com.generation.todoandroid.model.Categoria
import retrofit2.Response
import retrofit2.Retrofit

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }


}