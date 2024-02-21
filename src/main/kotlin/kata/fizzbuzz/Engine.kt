package kata.fizzbuzz

class Engine {
    fun say(number: Int): String {
        if (number == 3) {
            return "Fizz"
        }
        return number.toString()
    }

}
