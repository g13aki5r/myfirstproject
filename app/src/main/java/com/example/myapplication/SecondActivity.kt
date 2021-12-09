package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

private const val HELLO_KEY = "Hello"

class SecondActivity : AppCompatActivity() {

    private lateinit var nextActivityButtonSec: Button
    private lateinit var prevActivityButtonSec: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nextActivityButtonSec = findViewById(R.id.SecActButNext)
        nextActivityButtonSec.setOnClickListener {
            val thirdActivityIntent = Intent(this, ThirdActivity::class.java)
            thirdActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(thirdActivityIntent)
        }
        prevActivityButtonSec = findViewById(R.id.SecActButPrev)
        prevActivityButtonSec.setOnClickListener {
            val firstActivityIntent = Intent(this, MainActivity::class.java)
            firstActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(firstActivityIntent)
        }
        Toast.makeText(this, "Welcome to SecondActivity!", Toast.LENGTH_LONG).show()

    }



}