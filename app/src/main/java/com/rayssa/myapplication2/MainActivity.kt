package com.rayssa.myapplication2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import com.rayssa.shared.ApiClient

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
