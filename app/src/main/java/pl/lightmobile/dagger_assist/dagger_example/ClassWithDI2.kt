package pl.lightmobile.dagger_assist.dagger_example

private const val NUMBERS_TO_WIN = 2

class ClassWithDI2(
    private val numberChecker: IsNumberSelectedChecker,
    private val provider: DataProvider
) {

    fun checkIfUserHasWon(): Boolean {
        val numbers = provider.loadData()

        val correctNumbers = numbers.count { numberChecker.isNumberCorrect(it) }

        return correctNumbers >= NUMBERS_TO_WIN
    }
}
