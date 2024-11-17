package com.example.ca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class welcomeactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcomeactivity)
        val b:Button = findViewById(R.id.button1)
        b.setOnClickListener{
            Toast.makeText(this,"datafectched",Toast.LENGTH_LONG).show()
        }
    }
}