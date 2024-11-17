package com.example.snackbar

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val a:Button = findViewById(R.id.button)
        a.setOnClickListener{
            Snackbar.make(it,"This is snack bar",Snackbar.LENGTH_LONG).setAction("Undo"){}.show()

            Toast.makeText(this,"this is toat mesage",Toast.LENGTH_LONG).show()
        }
    }
}