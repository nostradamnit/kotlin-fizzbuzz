package kata.fizzbuzz

class Engine {
    fun say(i: Int): String {
        if (i == 3) {
            return "Fizz"
        }
        return i.toString()
    }

}
