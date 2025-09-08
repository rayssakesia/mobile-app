package com.rayssa.shared

import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiServiceRetrofit {
    @GET("/users")
    suspend fun getAnswer(): ResponseBody
}