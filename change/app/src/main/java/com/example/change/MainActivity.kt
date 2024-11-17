package com.example.change


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use findViewById to access the buttons
        val buttonTelugu: Button = findViewById(R.id.button_telugu)
        val buttonEnglish: Button = findViewById(R.id.button_english)

        buttonTelugu.setOnClickListener {
            LocaleHelper.setLocale(this, "te") // Set to Telugu
            recreate() // Refresh the activity
        }

        buttonEnglish.setOnClickListener {
            LocaleHelper.setLocale(this, "en") // Set to English
            recreate() // Refresh the activity
        }
    }
}

