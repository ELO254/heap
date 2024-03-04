package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private lateinit var texttv2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        texttv2 = findViewById(R.id.textView2)

        val receivedName = intent.getStringExtra("nameEx")
        texttv2.text = receivedName?: "no name provided"


    }

}