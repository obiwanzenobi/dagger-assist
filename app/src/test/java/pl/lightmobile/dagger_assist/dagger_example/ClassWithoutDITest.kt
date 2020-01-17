package pl.lightmobile.dagger_assist.dagger_example

import org.junit.Test

class ClassWithoutDITest {

    // WRONG! this test isn't testing anything
    @Test
    fun checkIfUserHasWon() {
        val testedClass = ClassWithoutDI()

        assert(testedClass.checkIfUserHasWon())
    }
}
