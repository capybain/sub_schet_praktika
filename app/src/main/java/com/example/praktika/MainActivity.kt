package com.example.praktika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editTextText)
        textView = findViewById(R.id.view_text)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val inputText = editText.text.toString().trim()
            val number = inputText.toIntOrNull()

            val resultText = when (number) {
                in 0..1000 -> "Вы новичек"
                in 1000..10000 -> "Вы любитель"
                in 10000..100000 -> "Вы Опытный"
                else -> "вы псих"

            }
            textView.text = resultText
        }
    }
}