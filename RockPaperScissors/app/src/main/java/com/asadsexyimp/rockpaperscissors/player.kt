package com.asadsexyimp.rockpaperscissors

import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import kotlin.math.floor
import kotlin.random.Random

class Player (status: String = "Rock", hp: Int = 5, name: String = "Mr.president"){
    var status: String = status
    var hp: Int = hp
    var name: String = name

    fun rock() {
        this.status = "Rock"
    }

    fun paper() {
        this.status = "Paper"
    }

    fun scissors() {
        this.status = "Scissors"
    }

    fun randomnum() {
        var count = Random.nextInt(3)
        when (count) {
            0 -> this.status = "Rock"
            1 -> this.status = "Scissors"
            else -> this.status = "Paper"
        }
    }


    fun lose() {
        this.hp -= 1
    }


}