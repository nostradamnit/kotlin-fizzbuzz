package kata.fizzbuzz

class Engine {
    fun say(number: Int): String {
        if (isMultipleOf(3, number)) {
            return "Fizz"
        }
        if (number % 5 == 0) {
            return "Buzz"
        }
        return number.toString()
    }

    private fun isMultipleOf(divisor: Int, number: Int): Boolean{
        return (number % divisor == 0)
    }
}
