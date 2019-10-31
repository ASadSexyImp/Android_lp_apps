package com.asadsexyimp.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preview.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent: Intent = Intent(this, PreviewActivity::class.java)

        imageView.setOnClickListener {
            intent.putExtra("Image", R.drawable.ocean)
            startActivity(intent)
        }

        imageView.setOnClickListener {
            intent.putExtra("Image", R.drawable.portugal)
            startActivity(intent)
        }

        imageView.setOnClickListener {
            intent.putExtra("Image", R.drawable.sakura)
            startActivity(intent)
        }

        imageView.setOnClickListener {
            intent.putExtra("Image", R.drawable.ship)
            startActivity(intent)
        }

        imageView.setOnClickListener {
            intent.putExtra("Image", R.drawable.yukata)
            startActivity(intent)
        }

        imageView.setOnClickListener {
            intent.putExtra("Image", R.drawable.waterfall)
            startActivity(intent)
        }


    }
}
