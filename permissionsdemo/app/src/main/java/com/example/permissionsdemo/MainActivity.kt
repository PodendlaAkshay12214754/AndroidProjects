package com.example.permissionsdemo

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val c = 1
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var b1 = findViewById<Button>(R.id.button4)
        b1.setOnClickListener {
            // Check if permission is denied
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED) {
                // Create an AlertDialog to ask for permission
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Camera Permission")
                builder.setMessage("The app needs camera permission to continue. Do you want to allow it?")

                // If user clicks "Yes", request the permission
                builder.setPositiveButton("Yes") { dialog, which ->
                    ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), c)
                }

                // If user clicks "No", show a message
                builder.setNegativeButton("No") { dialog, which ->
                    Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show()
                }

                // Show the AlertDialog
                builder.show()
            } else {
                // Permission already granted
                Toast.makeText(this, "camera Permission already granted", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
