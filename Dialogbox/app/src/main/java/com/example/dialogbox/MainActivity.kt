package com.example.dialogbox

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var bdia = findViewById<Button>(R.id.button)
        bdia.setOnClickListener{
            var b = AlertDialog.Builder(this)
            b.setTitle("Exit")
            b.setMessage("Do u really want to exit")
            b.setPositiveButton("yes"){dialog,_ -> finish()}


            b.setNegativeButton("no"){dialog,_ ->dialog.dismiss()}
            b.setNeutralButton("Remind me later"){dialog,_ ->
                run{


                    Toast.makeText(this,"ok ",Toast.LENGTH_LONG).show()

                }
            }

            b.create().show()
        }
    }
}