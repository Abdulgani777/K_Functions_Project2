fun roundNumber(number: Int): String {
    return if (number < 1000) {
        number.toString()
    } else {
        "${number / 1000}K"
    }
}

fun main() {
    println(roundNumber(1272)) // Output: 1K
}