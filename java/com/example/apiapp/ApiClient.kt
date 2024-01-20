package com.example.apiapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiClient {

    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val apiService: Apiservice by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

            .create(Apiservice::class.java)
    }
}