package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

const val TAG = "MainActivity"
private const val HELLO_KEY = "Hello"

class MainActivity : AppCompatActivity() {

    private lateinit var nextActivityButton: Button
    private lateinit var prevActivityButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Log.d(TAG, "В Академии наук")

        val infTextView: TextView = findViewById(R.id.calcText)
        val resultTextView: TextView = findViewById(R.id.calcTextRes)

        var resultVar = 0
        var resultTextVar = ""
        var infTextVar = ""
        var operand = ""

        resultTextView.text = 0.toString()
        infTextView.text = resultTextVar


        val key1: Button = findViewById(R.id.key1)
        key1.setOnClickListener {
            resultTextVar += "1"
            resultTextView.text = resultTextVar
            infTextVar += "1"
        }

        val key2: Button = findViewById(R.id.key2)
        key2.setOnClickListener {
            resultTextVar += "2"
            resultTextView.text = resultTextVar
            infTextVar += "2"
        }

        val key3: Button = findViewById(R.id.key3)
        key3.setOnClickListener {
            resultTextVar += "3"
            resultTextView.text = resultTextVar
            infTextVar += "3"
        }

        val key4: Button = findViewById(R.id.key4)
        key4.setOnClickListener {
            resultTextVar += "4"
            resultTextView.text = resultTextVar
            infTextVar += "4"
        }

        val key5: Button = findViewById(R.id.key5)
        key5.setOnClickListener {
            resultTextVar += "5"
            resultTextView.text = resultTextVar
            infTextVar += "5"
        }

        val key6: Button = findViewById(R.id.key6)
        key6.setOnClickListener {
            resultTextVar += "6"
            resultTextView.text = resultTextVar
            infTextVar += "6"
        }

        val key7: Button = findViewById(R.id.key7)
        key7.setOnClickListener {
            resultTextVar += "7"
            resultTextView.text = resultTextVar
            infTextVar += "7"
        }

        val key8: Button = findViewById(R.id.key8)
        key8.setOnClickListener {
            resultTextVar += "8"
            resultTextView.text = resultTextVar
            infTextVar += "8"
        }

        val key9: Button = findViewById(R.id.key9)
        key9.setOnClickListener {
            resultTextVar += "9"
            resultTextView.text = resultTextVar
            infTextVar += "9"
        }

        val key0: Button = findViewById(R.id.key0)
        key0.setOnClickListener {
            resultTextVar += "0"
            resultTextView.text = resultTextVar
            infTextVar += "0"
        }

        val keyPlus: Button = findViewById(R.id.keyPlus)
        keyPlus.setOnClickListener {
            operand = "+"
            infTextVar = resultTextVar
            infTextVar += "+"
            infTextView.text = infTextVar
            resultVar = resultTextVar.toInt()
            resultTextVar = ""
            resultTextView.text = ""
        }

        val keyMult: Button = findViewById(R.id.keyMult)
        keyMult.setOnClickListener {
            operand = "*"
            infTextVar = resultTextVar
            infTextVar += "*"
            infTextView.text = infTextVar
            resultVar = resultTextVar.toInt()
            resultTextVar = ""
            resultTextView.text = ""
        }

        val keyMinus: Button = findViewById(R.id.keyMinus)
        keyMinus.setOnClickListener {
            operand = "-"
            infTextVar = resultTextVar
            infTextVar += "-"
            infTextView.text = infTextVar
            resultVar = resultTextVar.toInt()
            resultTextVar = ""
            resultTextView.text = ""
        }

        val keyDiv: Button = findViewById(R.id.keyDiv)
        keyDiv.setOnClickListener {
            operand = "/"
            infTextVar = resultTextVar
            infTextVar += "/"
            infTextView.text = infTextVar
            resultVar = resultTextVar.toInt()
            resultTextVar = ""
            resultTextView.text = ""
        }


        val keyEq: Button = findViewById(R.id.keyEq)
        keyEq.setOnClickListener {
            infTextVar += "="
            if (operand == "+")
                resultVar += resultTextVar.toInt()
            if (operand == "*")
                resultVar *= resultTextVar.toInt()
            if (operand == "-")
                resultVar *= resultTextVar.toInt()
            if (operand == "/") {
                if (resultTextVar.toInt() == 0) {
                    Toast.makeText(this, "Делить на 0 нельзя!", Toast.LENGTH_LONG).show()
                    infTextVar = ""
                    infTextView.text = ""
                    resultVar = 0
                    resultTextVar = ""
                }
                else {
                    resultVar /= resultTextVar.toInt()
                }
            }
            infTextVar += resultVar
            infTextView.text = infTextVar
            resultTextVar = ""
        }


        val keyACButton: Button = findViewById(R.id.keyAC)
        keyACButton.setOnClickListener {
            Toast.makeText(this, "It's clear all variables.", Toast.LENGTH_LONG).show()
            resultTextVar = ""
            infTextVar = ""
            infTextView.text = resultTextVar
            resultTextView.text = 0.toString()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Заседает князь Дундук")
        Toast.makeText(this, "Welcome to calc!", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Говорят, не подобает")

        nextActivityButton = findViewById(R.id.CalcAtcButNext)
        nextActivityButton.setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(secondActivityIntent)
        }

        prevActivityButton = findViewById(R.id.CalcActButPrev)
        prevActivityButton.setOnClickListener {
            val thirdActivityIntent = Intent(this, ThirdActivity::class.java)
            thirdActivityIntent.putExtra(HELLO_KEY, "Hello from MainActivity")
            startActivity(thirdActivityIntent)
        }

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Дундуку такая честь;")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Почему ж он заседает?")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Потому что есть чем сесть.")
    }
}
