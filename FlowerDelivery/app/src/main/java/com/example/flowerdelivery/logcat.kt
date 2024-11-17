package com.example.flowerdelivery

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class logcat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logcat)
        var btnlog = findViewById<Button>(R.id.btn1)
        btnlog.setOnClickListener{
            Log.v(TAG, "Verbose log: lowest priority, detailed entry , no use during app")
            Log.d(TAG, "Debug log: highest priority , this is used to debug the app")
            Log.i(TAG, "Info log: moderate level importance , they give information app ")
            Log.w(TAG, "Warning log: This is a warning message from unexpected ")

        }
    }
}