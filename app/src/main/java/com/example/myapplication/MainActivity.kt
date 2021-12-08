package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "В Академии наук")

        val infTextview: TextView = findViewById(R.id.calcText)
        val resultTextView: TextView = findViewById(R.id.calcTextRes)
        var resultVar = 0
        var resultTextVar = ""
        var mathOperandsVar = ""
        Toast.makeText(this, "Hello, it's my first calc!", Toast.LENGTH_LONG).show()

        resultTextView.text = 0.toString()
        infTextview.text = resultTextVar


//        fun mathOperandsFun() {
//            val var1
//            var1: Int, var2: Int)


//        }

        val keyACButton: Button = findViewById(R.id.keyAC)
        keyACButton.setOnClickListener {
            Toast.makeText(this, "It's clear all variables.", Toast.LENGTH_LONG).show()
            resultTextVar = ""
            infTextview.text = resultTextVar
            resultTextView.text = 0.toString()


        }

        val key1: Button = findViewById(R.id.key1)
        key1.setOnClickListener {
            Toast.makeText(this, "button 1 pressed", Toast.LENGTH_LONG).show()
            resultTextVar += "1"
            infTextview.text = resultTextVar
            resultTextView.text = resultTextVar
            resultVar += 1
        }

        val key2: Button = findViewById(R.id.key2)
        key2.setOnClickListener {
            Toast.makeText(this, "button 2 pressed", Toast.LENGTH_LONG).show()
            resultTextVar += "2"
            infTextview.text = resultTextVar
            resultTextView.text = resultTextVar
            resultVar += 2
        }

        val keyEq: Button = findViewById(R.id.keyEq)
        keyEq.setOnClickListener {
            Toast.makeText(this, "button equal pressed", Toast.LENGTH_LONG).show()
            resultTextVar += "="
            resultVar = resultTextView.text.toString().toInt()

            infTextview.text = resultTextVar + resultVar.toString()
        }
        val keyPlus: Button = findViewById(R.id.keyPlus)
        keyPlus.setOnClickListener {
            Toast.makeText(this, "button plus pressed", Toast.LENGTH_LONG).show()
            resultTextVar += "+"
            mathOperandsVar = "+"
//            resultVar = resultTextView.text.toString().toInt()
            resultTextView.text = mathOperandsVar
            infTextview.text = resultTextVar
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Заседает князь Дундук")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Говорят, не подобает")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Дундуку такая честь;")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Почему ж он заседает?")
    }

    override fun onRestart() {
        super.onRestart()
//        Log.d(TAG, "6onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Потому что есть чем сесть.")
    }
}
