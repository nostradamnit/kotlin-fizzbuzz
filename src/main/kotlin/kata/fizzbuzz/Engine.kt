package kata.fizzbuzz

class Engine {
    fun say(number: Int): String {
        if (isDivisableBy3(number)) {
            return "Fizz"
        }
        if (number % 5 == 0) {
            return "Buzz"
        }
        return number.toString()
    }

    private fun isDivisableBy3(number: Int): Boolean{
        return (number % 3 == 0)
    }
}
