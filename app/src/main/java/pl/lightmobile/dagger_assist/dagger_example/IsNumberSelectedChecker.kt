package pl.lightmobile.dagger_assist.dagger_example

private val WINNING_NUMBERS = intArrayOf(1,2,6,9)

class IsNumberSelectedChecker {

    fun isNumberCorrect(number: Int): Boolean = WINNING_NUMBERS.contains(number)
}
