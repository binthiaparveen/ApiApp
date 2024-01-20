package com.example.apiapp

import retrofit2.Call
import retrofit2.http.GET

interface Apiservice {
    @GET("users")
    fun getUsers(): Call<List<User>>
}