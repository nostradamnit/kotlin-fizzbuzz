package kata.fizzbuzz

class Engine {
    fun say(number: Int): String {
        if (isFizz(number)) {
            return "Fizz"
        }
        if (number % 5 == 0) {
            return "Buzz"
        }
        return number.toString()
    }

    private fun isFizz(number: Int): Boolean {
        return isMultipleOf(3, number)
    }

    private fun isMultipleOf(divisor: Int, number: Int): Boolean{
        return (number % divisor == 0)
    }
}
