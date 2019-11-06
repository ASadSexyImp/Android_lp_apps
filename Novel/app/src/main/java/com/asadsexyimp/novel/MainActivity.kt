package com.asadsexyimp.novel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 画面遷移の情報を扱う
        val intent: Intent = Intent(this, PreviewActivity::class.java)

        // 配列に小説を格納
        val array = arrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6)
        // ランダムに数を決める
        var randomInt: Int = 0

        // おすすめの小説を表示するボタン
        makeRandomNumberButton.setOnClickListener {
            randomInt =  Random.nextInt(5)

            imageView.setImageResource(array[randomInt])
        }

        // 詳細表示
        imageView.setOnClickListener {
            intent.putExtra("Image", array[randomInt])
            startActivity(intent)
        }
    }
}
