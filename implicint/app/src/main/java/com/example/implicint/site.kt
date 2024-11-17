package com.example.implicint

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class site : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_site)

        val a:Button = findViewById(R.id.button6)
        a.setOnClickListener{
            val i1 = Intent(this, MainActivity::class.java)

            startActivity(i1)
        }
    }
}