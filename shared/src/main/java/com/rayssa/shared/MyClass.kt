package com.rayssa.shared

//import io.ktor.client.HttpClient
//import io.ktor.client.call.body
//import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
//import io.ktor.client.request.get
//import io.ktor.client.statement.bodyAsText
//import io.ktor.serialization.kotlinx.json.json
//import kotlinx.serialization.Serializable
//
//@Serializable
//data class User(val name: String, val age: Int)
//
//class ApiService {
//    private val client = HttpClient {
//        install(ContentNegotiation) {
//            json()
//        }
//    }
//
//    suspend fun getAnswer(): String {
//        return client.get("http://10.0.2.2:8080/users").body()
//    }
//}

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import retrofit2.http.GET
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
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