package com.example.treeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val register = findViewById<Button>(R.id.registernow)


            register.setOnClickListener{
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
        }



    }
}