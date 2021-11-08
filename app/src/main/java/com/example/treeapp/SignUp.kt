package com.example.treeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)
        val actionBar = supportActionBar
        actionBar!!.title = "Sign Up"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}