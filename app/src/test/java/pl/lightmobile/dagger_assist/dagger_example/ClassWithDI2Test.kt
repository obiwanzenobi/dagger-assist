package pl.lightmobile.dagger_assist.dagger_example

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.junit.Test

class ClassWithDI2Test {

    @Test
    fun `true for two correct numbers`() {
        val firstWinN = 1
        val secondWinN = 2
        val winningList = listOf(firstWinN, secondWinN, 3, 4)

        val providerMock: DataProvider = mock() {
            on { loadData() } doReturn winningList
        }

        val selectedNumberChecker: IsNumberSelectedChecker = mock() {
            on { isNumberCorrect(any()) } doReturn false
            on { isNumberCorrect(firstWinN) } doReturn true
            on { isNumberCorrect(secondWinN) } doReturn true
        }

        val testedClass = ClassWithDI2(selectedNumberChecker, providerMock)
        val result = testedClass.checkIfUserHasWon()

        assert(result)
    }
}
