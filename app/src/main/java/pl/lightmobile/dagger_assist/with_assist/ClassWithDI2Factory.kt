//package pl.lightmobile.dagger_assist.with_assist
//
//import com.squareup.inject.assisted.Assisted
//import com.squareup.inject.assisted.AssistedInject
//import pl.lightmobile.dagger_assist.dagger_example.DataProvider
//import pl.lightmobile.dagger_assist.dagger_example.IsNumberSelectedChecker
//
//private const val NUMBERS_TO_WIN = 2
//
//class ClassWithDI2Assisted constructor(
//    private val numberChecker: IsNumberSelectedChecker,
//    private val provider: DataProvider
//) {
//
//    fun checkIfUserHasWon(): Boolean {
//        val numbers = provider.loadDataForUser(userId)
//
//        val correctNumbers = numbers.count { numberChecker.isNumberCorrect(it) }
//
//        return correctNumbers >= NUMBERS_TO_WIN
//    }
//
//}
