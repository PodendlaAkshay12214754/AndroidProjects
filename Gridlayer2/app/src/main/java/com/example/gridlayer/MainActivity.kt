package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import com.example.gridlayer.R
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableEdgeToEdge()

        val x = findViewById<ImageButton>(R.id.imageButton5)
        val y = findViewById<ImageButton>(R.id.imageButton6)
        val z = findViewById<ImageButton>(R.id.imageButton8)
        val a = findViewById<ImageButton>(R.id.imageButton9)

        fun navigateToPage(view: View, pageMessage: String) {

            Snackbar.make(view, "WELCOME", Snackbar.LENGTH_LONG).setAction("GO"){
                val intent = Intent(this, DestinationActivity::class.java)
                intent.putExtra("MESSAGE", pageMessage)
                startActivity(intent)
            }.show()

        }

        // Set onClickListeners for each ImageButton with a different message
        x.setOnClickListener { view -> navigateToPage(view, "LPU School of Computer science and engineering") }
        y.setOnClickListener { view -> navigateToPage(view, "LPU School of Civil Engineering") }
        z.setOnClickListener { view -> navigateToPage(view, "LPU School of Bio Engineering and Sciences") }
        a.setOnClickListener { view -> navigateToPage(view, "LPU School of Agriculture") }

    }
}