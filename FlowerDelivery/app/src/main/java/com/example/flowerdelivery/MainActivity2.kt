package com.example.flowerdelivery

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val a = findViewById<ImageButton>(R.id.txt1)
        val b = findViewById<ImageButton>(R.id.btn2)
        val c = findViewById<ImageButton>(R.id.txt3)
        val d = findViewById<ImageButton>(R.id.txt4)
        val e = findViewById<Button>(R.id.btn1)
        val f = findViewById<Button>(R.id.btn2)
        val g = findViewById<Button>(R.id.btn3)
        val h = findViewById<Button>(R.id.btn4)

        a.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
        b.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
        c.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
        d.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
        e.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
        f.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
        g.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
        h.setOnClickListener{
            Toast.makeText(this, "Your Order has Booked", Toast.LENGTH_SHORT).show()
        }
    }
}