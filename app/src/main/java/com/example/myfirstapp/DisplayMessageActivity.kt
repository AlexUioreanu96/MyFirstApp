package com.example.myfirstapp

import android.os.Bundle
import android.widget.ImageView
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

        val imageView = findViewById<ImageView>(R.id.imgV)

        when (message) {
            "1" -> imageView.setImageResource(R.drawable.ic_baseline_airplanemode_active_24)
            "2" -> imageView.setImageResource(R.drawable.ic_baseline_adb_24)
        }
    }
}