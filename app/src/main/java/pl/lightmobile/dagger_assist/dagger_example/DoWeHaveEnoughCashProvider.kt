package pl.lightmobile.dagger_assist.dagger_example

import kotlin.random.Random

class DoWeHaveEnoughCashProvider {

    fun doWeHaveCash(): Boolean = Random.nextBoolean()
}
