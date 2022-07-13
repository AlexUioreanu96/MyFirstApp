package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        if (message == "1" || message == "2") {
            val i = Intent(this, DisplayMessageActivity::class.java)
            i.putExtra(EXTRA_MESSAGE, message)
            startActivity(i)
        } else {
            editText.error = "Poti adauga doar 1 sau 2 :D"
        }
    }
}