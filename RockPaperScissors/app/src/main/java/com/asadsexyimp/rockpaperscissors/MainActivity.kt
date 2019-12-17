package com.asadsexyimp.rockpaperscissors

import android.os.Bundle
import android.widget.TextView
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

    override fun onStart() {
        super.onStart()

        button.layoutParams.width = cpu.hp*50
        button2.layoutParams.width = player.hp*50

        imageView.setOnClickListener {
            player.rock()
            cpu.randomnum()
            fight(player, cpu)

            print(player.status)
            println(cpu.status)
        }
        imageView2.setOnClickListener {
            player.scissors()
            cpu.randomnum()
            fight(player, cpu)

            print(player.status)
            println(cpu.status)
        }
        imageView.setOnClickListener {
            player.paper()
            cpu.randomnum()
            fight(player, cpu)

            print(player.status)
            println(cpu.status)
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
            player.hp = 5
            cpu.hp = 5
        }else{
            textView5.text = count.x.toString()+"勝"+count.y.toString()+"敗" +count.z.toString()+"引き分け"
        }

    }

    fun fight(player: Player, cpu: Player){
        when {
            player.status == cpu.status ->  {
                status.text = "ひきわけ！！！"
                count.plus(Vector3(0,0,1))
            }
            (player.status == "Rock" && cpu.status == "Scissors") || (player.status == "Scissors" && cpu.status == "Paper") || (player.status == "Paper" && cpu.status == "Rock") -> {
                status.text = "かち！！！"
                count.plus(Vector3(1,0,0))
                cpu.lose()
            }
            else -> {
                status.text = "まけ！！！"
                count.plus(Vector3(0,1,0))
                player.lose()
            }
        }

    }

    class Vector3(val x: Int, val y: Int, val z: Int) {
        operator fun plus(vector: Vector3): Vector3 {
            return Vector3(x + vector.x, y + vector.y, z + vector.z)
        }
    }


}
