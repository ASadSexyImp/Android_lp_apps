package com.asadsexyimp.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val imageId: Int = intent.getIntExtra("image", 0)
        previewImage.setImageResource(imageId)

        backButton.setOnClickListener {
            finish()
        }
    }
}
