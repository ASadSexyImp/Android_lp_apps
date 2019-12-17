package com.asadsexyimp.rockpaperscissors

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val player: Player = Player(name="Player")
    val cpu: Player = Player(name="CPU")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setOnClickListener {
            player.rock()
            cpu.randomnum()
        }
        imageView2.setOnClickListener {
            player.scissors()
            cpu.randomnum()
        }
        imageView.setOnClickListener {
            player.paper()
            cpu.randomnum()
        }

        when (player.status) {
            "Rock" -> imageView4.setImageResource(R.drawable.goo2)
            "Paper" -> imageView4.setImageResource(R.drawable.paa2)
            "Scissors" -> imageView4.setImageResource(R.drawable.choki2)
            else -> imageView4.setImageResource(R.drawable.goo2)
        }

        when (cpu.status) {
            "Rock" -> imageView5.setImageResource(R.drawable.goo2)
            "Paper" -> imageView5.setImageResource(R.drawable.paa2)
            "Scissors" -> imageView5.setImageResource(R.drawable.choki2)
            else -> imageView4.setImageResource(R.drawable.goo2)
        }

    }


}
