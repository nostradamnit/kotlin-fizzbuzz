package kata.fizzbuzz

class Engine {
    fun say(number: Int): String {
        if (number == 3) {
            return "Fizz"
        }
        if (number == 5) {
            return "Buzz"
        }
        return number.toString()
    }

}
