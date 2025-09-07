package com.rayssa.shared

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable

@Serializable
data class User(val name: String, val age: Int)

class ApiService {
    private val client = HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getAnswer(): String {
        return client.get("http://10.0.2.2:8080/users").bodyAsText()
    }
}