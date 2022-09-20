package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button =findViewById(R.id.button)
        rollButton.setOnClickListener{
           rollDice()
        }
        rollDice()
    }
    private fun rollDice() {
        val dice=Dice(6)
        val diceroll=dice.roll()
        val riv: ImageView =findViewById(R.id.imageView)
        val drawablerecource = when (diceroll) {
            1 -> riv.setImageResource(R.drawable.dice_1)
            2 -> riv.setImageResource(R.drawable.dice_2)
            3 -> riv.setImageResource(R.drawable.dice_3)
            4 -> riv.setImageResource(R.drawable.dice_4)
            5 -> riv.setImageResource(R.drawable.dice_5)
            else -> riv.setImageResource(R.drawable.dice_6)
        }
        riv.contentDescription=diceroll.toString()
    }
}
class Dice(val varside :Int)
{
    fun roll():
   Int{
       return(1..6).random()
    }
}