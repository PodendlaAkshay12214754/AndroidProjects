package com.example.flipkartlogin

import android.content.Intent
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
        val sid = findViewById<Button>(R.id.button)
        sid.setOnClickListener( { view ->
            Snackbar.make(view, "this is snackbar" , Snackbar.LENGTH_LONG).setAction("undo"){
                Toast.makeText(this,  "undo was unclicked" ,Toast.LENGTH_LONG).show()
            }.show()
        })
    }
}