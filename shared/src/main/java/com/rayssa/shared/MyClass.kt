package com.rayssa.shared

import kotlinx.serialization.json.Json
import retrofit2.Retrofit

object ApiClient {
    private const val BASE_URL = "http://10.0.2.2:8080/"
    private const val BASE_URLv = "http://localhost:8080/"

    private val json = Json { ignoreUnknownKeys = true }

    val api: ApiServiceRetrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .build()
        .create(ApiServiceRetrofit::class.java)
}