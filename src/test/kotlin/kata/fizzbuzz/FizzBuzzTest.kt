package kata.fizzbuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    private val engine = Engine()
    @Test
    fun testCanSayOne() {
        val one = engine.say(1)
        assertEquals("1", one)
    }

    @Test
    fun testCanSayFizz() {
        val fizz = engine.say(3)
        assertEquals("Fizz", fizz)
    }

    @Test
    fun testCanSayBuzz() {
        val buzz = engine.say(5)
        assertEquals("Buzz", buzz)
    }

    @Test
    fun testCanSayFizzFor6() {
        val fizz = engine.say(6)
        assertEquals("Fizz", fizz)
    }

}