package kata.fizzbuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun testCanSayOne() {
        val engine = Engine()
        val one = engine.say(1)
        assertEquals("1", one)
    }

    @Test
    fun testCanSayFizz() {
        val engine = Engine()
        val fizz = engine.say(3)
        assertEquals("Fizz", fizz)
    }

}