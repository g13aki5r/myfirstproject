package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

private const val HELLO_KEY = "Hello"

class ThirdActivity : AppCompatActivity() {

    private lateinit var nextActivityButtonThird: Button
    private lateinit var prevActivityButtonThird: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        nextActivityButtonThird = findViewById(R.id.ThrdActButNext)
        nextActivityButtonThird.setOnClickListener {
            val firstActivityIntent = Intent(this, MainActivity::class.java)
            firstActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(firstActivityIntent)
        }

        prevActivityButtonThird = findViewById(R.id.ThrdActButPrev)
        prevActivityButtonThird.setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(secondActivityIntent)
        }
        Toast.makeText(this, "Welcome to ThirdActivity!", Toast.LENGTH_LONG).show()
    }
}