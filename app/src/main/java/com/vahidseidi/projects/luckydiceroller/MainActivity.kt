package com.vahidseidi.projects.luckydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val lukyNumberResult: TextView = findViewById(R.id.textView1)
        val firstDice = Dice(6)
        val luckyNumber = 4
        val rollResult = firstDice.roll()

        when (rollResult) {
            luckyNumber -> lukyNumberResult.text="You won!"
            1 -> lukyNumberResult.text="So sorry! You rolled a 1. Try again!"
            2 -> lukyNumberResult.text="Sadly, you rolled a 2. Try again!"
            3 -> lukyNumberResult.text="Unfortunately, you rolled a 3. Try again!"
            5 -> lukyNumberResult.text="Don't cry! You rolled a 5. Try again!"
            6 -> lukyNumberResult.text="Apologies! You rolled a 6. Try again!"
        }
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}