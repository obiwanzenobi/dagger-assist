package pl.lightmobile.dagger_assist.dagger_example

private const val NUMBERS_TO_WIN = 2

class ClassWithDI3(
    private val isNumberSelectedChecker: IsNumberSelectedChecker,
    private val provider: DataProvider,
    private val doWeHaveEnoughCash: DoWeHaveEnoughCashProvider
) {

    fun checkIfUserHasWon(): Boolean {
        if (!doWeHaveEnoughCash.doWeHaveCash()) {
            return false
        }

        val numbers = provider.loadData()

        val correctNumbers = numbers.count { isNumberSelectedChecker.isNumberCorrect(it) }

        return correctNumbers >= NUMBERS_TO_WIN
    }
}
