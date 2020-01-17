package pl.lightmobile.dagger_assist.without_assist

import pl.lightmobile.dagger_assist.dagger_example.DataProvider
import pl.lightmobile.dagger_assist.dagger_example.IsNumberSelectedChecker
import javax.inject.Inject

private const val NUMBERS_TO_WIN = 2

class ClassWithDI2NotAssistedFactory(
    private val numberChecker: IsNumberSelectedChecker,
    private val provider: DataProvider,
    private val userId: String
) {

    fun checkIfUserHasWon(): Boolean {
        val numbers = provider.loadDataForUser(userId)

        val correctNumbers = numbers.count { numberChecker.isNumberCorrect(it) }

        return correctNumbers >= NUMBERS_TO_WIN
    }

    class Factory @Inject constructor(
        private val numberChecker: IsNumberSelectedChecker,
        private val provider: DataProvider
    ) {

        fun create(userId: String): ClassWithDI2NotAssistedFactory {
            return ClassWithDI2NotAssistedFactory(
                numberChecker = numberChecker,
                provider = provider,
                userId = userId
            )
        }
    }
}
