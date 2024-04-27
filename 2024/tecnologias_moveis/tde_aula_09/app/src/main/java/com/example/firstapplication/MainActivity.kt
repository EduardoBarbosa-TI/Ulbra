package com.example.firstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val subject = findViewById<EditText>(R.id.etSubject)
        val recipient = findViewById<EditText>(R.id.etRecipient)
        val message = findViewById<EditText>(R.id.etMessage)

        button.setOnClickListener {
           val intent = Intent(Intent.ACTION_SEND).apply {
               type = "message/rfc822"
               putExtra(Intent.EXTRA_SUBJECT, subject.text.toString())
               putExtra(Intent.EXTRA_TEXT, message.text.toString())
               putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient.text.toString()))
           }
           subject.text.clear()
           recipient.text.clear()
           message.text.clear()

           startActivity(intent)
        }
    }
}