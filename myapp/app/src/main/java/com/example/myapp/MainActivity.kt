package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var nameedt:EditText
    private lateinit var emailedt:EditText
    private lateinit var submitbt:Button
    private lateinit var texttv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameedt = findViewById(R.id.edit_text_name)
        emailedt = findViewById(R.id.edit_text_email)
        submitbt = findViewById(R.id.button_submit)
        texttv = findViewById(R.id.textView)

        submitbt.setOnClickListener {

            var name = nameedt.text.toString()
            complete()
            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("nameEx",name)

            startActivity(intent)
        }
    }

    private fun complete() {
        var name = nameedt.text.toString().trim()
        var email = emailedt.text.toString().trim()


        if(name.isBlank() || email.isBlank()){
            Toast.makeText(this, "please fill email or name field", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "submited", Toast.LENGTH_SHORT).show()
            texttv.text = name



        }

    }
}