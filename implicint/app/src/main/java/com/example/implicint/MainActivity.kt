package com.example.implicint

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val a: Button = findViewById(R.id.button)
        val b: Button = findViewById(R.id.button1)
        val c: Button = findViewById(R.id.button2)
        val d: Button = findViewById(R.id.button3)
        val e: Button = findViewById(R.id.button4)
        val f: Button = findViewById(R.id.button5)
        val g: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(g)
        a.setOnClickListener {
            val i1 = Intent(this, site::class.java)
            startActivity(i1)
        }
        b.setOnClickListener {
            val i2 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)

        }
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)  // Link the menu.xml file to this activity
            return true  // Returns true to show the menu
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.email -> {
                val i3 = Intent(Intent.ACTION_SENDTO)
                i3.setData(Uri.parse("mailto:"))
                startActivity(i3)
                true

            }
            R.id.feedback -> {
             val i4 = Intent(this, feedback::class.java)
                startActivity(i4)
                true

            }
            else -> super.onOptionsItemSelected(item)
        }
    }




}