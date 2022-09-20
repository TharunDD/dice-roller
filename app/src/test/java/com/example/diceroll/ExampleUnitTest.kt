package com.example.diceroll
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun gennum(){
        val dice=Dice(6)
        val diceroll=dice.roll()
        assertTrue("the ans was btw 1 and 6",diceroll in 1..6)
    }
}