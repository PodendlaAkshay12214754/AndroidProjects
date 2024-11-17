package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
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
        val a = findViewById<Button>(R.id.button)
        val b = findViewById<Button>(R.id.button1)
        val c = findViewById<Button>(R.id.button2)
        val d = findViewById<Button>(R.id.button3)
        val e = findViewById<Button>(R.id.button4)
        val f = findViewById<Button>(R.id.button5)
        a.setOnClickListener{
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/"))
            startActivity(i1)
        }
        b.setOnClickListener {
            val i2 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)
        }
        c.setOnClickListener {
            val i3 = Intent(Intent.ACTION_VIEW)
            i3.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i3)
        }
        d.setOnClickListener {
            val i4 = Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(i4)
        }
        e.setOnClickListener {
            val i5 = Intent(MediaStore.ACTION_IMAGE_CAPTURE,)
            startActivity(i5)

        }
        f.setOnClickListener {
            val i6 = Intent(Intent.ACTION_DIAL)
            i6.setData(Uri.parse("tel:+918688614056"))
            startActivity(i6)
        }
    }
}