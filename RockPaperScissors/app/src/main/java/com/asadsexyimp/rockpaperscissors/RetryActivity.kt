package com.asadsexyimp.rockpaperscissors

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_retry.*

class RetryActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retry)

        // move page
        val home_intent: Intent = Intent(this, MainActivity::class.java)

        // aback to home
        button3.setOnClickListener {
            startActivity(home_intent)
        }
    }
}