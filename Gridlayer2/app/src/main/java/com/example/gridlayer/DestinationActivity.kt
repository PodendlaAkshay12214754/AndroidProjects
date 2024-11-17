package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.gridlayer.R

class DestinationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        // Get the message from the intent
        val message = intent.getStringExtra("MESSAGE")

        // Find the TextView and set the message
        val textView: TextView = findViewById(R.id.textView)
        textView.text = message
    }
}