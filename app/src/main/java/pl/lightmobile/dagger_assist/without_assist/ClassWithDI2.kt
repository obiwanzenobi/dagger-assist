package pl.lightmobile.dagger_assist.without_assist

import pl.lightmobile.dagger_assist.dagger_example.DataProvider
import pl.lightmobile.dagger_assist.dagger_example.IsNumberSelectedChecker

private const val NUMBERS_TO_WIN = 2

class ClassWithDI2(
    private val numberChecker: IsNumberSelectedChecker,
    private val provider: DataProvider
) {

    private lateinit var userId: String

    fun init(userId: String) {
        this.userId = userId
    }

    fun checkIfUserHasWon(): Boolean {
        val numbers = provider.loadDataForUser(userId)

        val correctNumbers = numbers.count { numberChecker.isNumberCorrect(it) }

        return correctNumbers >= NUMBERS_TO_WIN
    }
}
