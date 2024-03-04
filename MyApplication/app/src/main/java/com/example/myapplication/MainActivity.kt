package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tcount: TextView
    private lateinit var tpeek: TextView
    private lateinit var ename: EditText
    private lateinit var bheep: Button
    private lateinit var list: ListView

    var item = mutableListOf<String>() // You might want to specify the type explicitly

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tcount = findViewById(R.id.txtcount)
        tpeek = findViewById(R.id.txtpeek)
        ename = findViewById(R.id.edtname)
        list = findViewById(R.id.listView)
        bheep = findViewById(R.id.btns)

        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item)
        list.adapter = arrayAdapter

        bheep.setOnClickListener {
            put()
            arrayAdapter.notifyDataSetChanged() // Notify the adapter of data change
            peek()
            count()
        }

        peek()
        count()
    }

    private fun put() {
        val name = ename.text.toString()
        for(i in 1..10) {
            item.add(name)
        }
    }

    private fun peek() {
        val p = if (item.isNotEmpty()) item[0] else "No items"
        tpeek.text = p
    }

    private fun count() {
        val c = item.size
        tcount.text = if (c > 0) c.toString() else "No value"
    }
}
