package pl.lightmobile.dagger_assist.dagger_example

private const val NUMBERS_TO_WIN = 2

class ClassWithoutDI2 {

    private val provider: DataProvider
    private val isNumberSelectedChecker: IsNumberSelectedChecker

    init {
        provider = DataProvider()
        isNumberSelectedChecker = IsNumberSelectedChecker()
    }

    fun checkIfUserHasWon(): Boolean {
        val numbers = provider.loadData()

        val correctNumbers = numbers.count { isNumberSelectedChecker.isNumberCorrect(it) }

        return correctNumbers >= NUMBERS_TO_WIN
    }
}
