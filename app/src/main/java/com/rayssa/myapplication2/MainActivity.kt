package com.rayssa.myapplication2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import androidx.lifecycle.lifecycleScope

import kotlinx.coroutines.launch

//class MainActivity : AppCompatActivity() {
//
//    private lateinit var api: ApiService
//    private lateinit var txtMessage: TextView
//    private lateinit var btnFetch: Button
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//
//        txtMessage = findViewById(R.id.txtMessage)
//        btnFetch = findViewById(R.id.btnFetch)
//        api = ApiService() // 🔗 Aqui você chama o código do shared
//
//        lifecycleScope.launch {
//            try {
//                val answer = api.getAnswer()
//                txtMessage.text = answer // aqui já vem sua resposta da api
//            } catch (e: Exception) {
//                txtMessage.text = "Erro: ${e.message}"
//            }
//        }
//    }
//}

import androidx.appcompat.app.AppCompatActivity

import android.util.Log

import com.rayssa.shared.ApiClient
import okhttp3.ResponseBody.Companion.toResponseBody

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        lifecycleScope.launch {
            try {
                val answer = ApiClient.api.getAnswer()
                val answerText  = answer.string()
                textView.text = answerText
                println(answerText)
            } catch (e: Exception) {
                Log.e("ApiError", e.toString())
            }
        }
    }
}
