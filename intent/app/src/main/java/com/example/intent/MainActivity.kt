package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val a:Button = findViewById(R.id.button)
        val b: Button = findViewById(R.id.button2)
        a.setOnClickListener{
            val i1 = Intent(this, activity1::class.java)
            startActivity(i1)
        }
        b.setOnClickListener{
            val i2 = Intent(this, activity2::class.java)
            startActivity(i2)
        }
    }
}