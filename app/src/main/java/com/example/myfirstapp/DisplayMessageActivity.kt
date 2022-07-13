package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        //get the extra from another activity
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        //takes the msg and populate it in the view
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }

    }
}