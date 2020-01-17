package pl.lightmobile.dagger_assist.without_assist

import pl.lightmobile.dagger_assist.dagger_example.DataProvider
import pl.lightmobile.dagger_assist.dagger_example.IsNumberSelectedChecker
import javax.inject.Inject
import javax.inject.Provider

private const val NUMBERS_TO_WIN = 2

class ClassWithDI2NotAssistedFactoryProviders @Inject constructor(
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
        private val numberChecker: Provider<IsNumberSelectedChecker>,
        private val provider: Provider<DataProvider>
    ) {

        fun create(userId: String): ClassWithDI2NotAssistedFactory {
            return ClassWithDI2NotAssistedFactory(
                numberChecker = numberChecker.get(),
                provider = provider.get(),
                userId = userId
            )
        }
    }
}
