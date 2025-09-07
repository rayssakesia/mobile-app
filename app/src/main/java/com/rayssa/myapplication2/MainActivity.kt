package com.rayssa.myapplication2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.rayssa.shared.ApiService
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var api: ApiService
    private lateinit var txtMessage: TextView
    private lateinit var btnFetch: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtMessage = findViewById(R.id.txtMessage)
        btnFetch = findViewById(R.id.btnFetch)
        api = ApiService() // 🔗 Aqui você chama o código do shared

        lifecycleScope.launch {
            try {
                val answer = api.getAnswer()
                txtMessage.text = answer // aqui já vem sua resposta da api
            } catch (e: Exception) {
                txtMessage.text = "Erro: ${e.message}"
            }
        }
    }
}