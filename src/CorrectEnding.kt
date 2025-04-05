fun getYearEnding(years: Int): String {
    return when {
        years % 10 == 1 && years % 100 != 11 -> "$years год"
        years % 10 in 2..4 && (years % 100 < 10 || years % 100 >= 20) -> "$years года"
        else -> "$years лет"
    }
}

fun main() {
    println(getYearEnding(1)) // Output: 1 год
    println(getYearEnding(2)) // Output: 2 года
    println(getYearEnding(5)) // Output: 5 лет
}