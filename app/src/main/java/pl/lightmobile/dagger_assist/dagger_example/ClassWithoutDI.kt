package pl.lightmobile.dagger_assist.dagger_example

// CHECK YOUR WINNING NUMBER!!

class ClassWithoutDI {

    private val provider: DataProvider
    private val isNumberSelectedChecker: IsNumberSelectedChecker

    init {
        provider = DataProvider()
        isNumberSelectedChecker = IsNumberSelectedChecker()
    }

    fun checkIfUserHasWon(): Boolean {
        val numbers = provider.loadData()

        return numbers.any { isNumberSelectedChecker.isNumberCorrect(it) }
    }
}
