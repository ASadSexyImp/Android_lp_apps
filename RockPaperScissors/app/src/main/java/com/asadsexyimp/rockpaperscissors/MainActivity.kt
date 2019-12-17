package com.asadsexyimp.rockpaperscissors

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var player: Player = Player(name="Player")
    var cpu: Player = Player(name="CPU")
    var count: Vector3 = Vector3(0,0,0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onRestart() {
        super.onRestart()

        imageView.setOnClickListener {
            player.rock()
            cpu.randomnum()
            fight(player, cpu)
        }
        imageView2.setOnClickListener {
            player.scissors()
            cpu.randomnum()
            fight(player, cpu)
        }
        imageView.setOnClickListener {
            player.paper()
            cpu.randomnum()
            fight(player, cpu)
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

        if(count.x == 5){
            count = Vector3(0,0,0)
        }

    }

    fun fight(player: Player, cpu: Player){
        when {
            player.status == cpu.status ->  {
                textView.text = "ひきわけ！！！"
                count + Vector3(0,0,1)
            }
            (player.status == "Rock" && cpu.status == "Scissors") || (player.status == "Scissors" && cpu.status == "Paper") || (player.status == "Paper" && cpu.status == "Rock") -> {
                textView.text = "かち！！！"
                count + Vector3(1,0,0)
            }
            else -> {
                textView.text = "まけ！！！"
                count + Vector3(0,1,0)
            }
        }

    }

    class Vector3(val x: Int, val y: Int, val z: Int) {
        operator fun plus(vector: Vector3): Vector3 {
            return Vector3(x + vector.x, y + vector.y, z + vector.z)
        }
    }


}
