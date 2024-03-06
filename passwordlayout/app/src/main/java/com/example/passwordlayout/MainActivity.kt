package com.example.passwordlayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        passwordEditText = findViewById(R.id.passwordEditText)

        val button0 = findViewById<Button>(R.id.button0)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val buttonClear = findViewById<Button>(R.id.buttonClear)

        button0.setOnClickListener { appendToPassword("0") }
        button1.setOnClickListener { appendToPassword("1") }
        button2.setOnClickListener { appendToPassword("2") }
        button3.setOnClickListener { appendToPassword("3") }
        button4.setOnClickListener { appendToPassword("4") }
        button5.setOnClickListener { appendToPassword("5") }
        button6.setOnClickListener { appendToPassword("6") }
        button7.setOnClickListener { appendToPassword("7") }
        button8.setOnClickListener { appendToPassword("8") }
        button9.setOnClickListener { appendToPassword("9") }

        buttonClear.setOnClickListener { clearPassword() }
    }

    private fun appendToPassword(digit: String) {
        val currentPassword = passwordEditText.text.toString()
        val newPassword = currentPassword + digit
        passwordEditText.setText(newPassword)
    }

    private fun clearPassword() {
        passwordEditText.setText("")
    }
}
