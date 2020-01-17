package pl.lightmobile.dagger_assist.dagger_example

import kotlin.random.Random

class DataProvider {

    fun loadData(): List<Int> = if (Random.nextBoolean()) {
        listOf(
            Random.nextInt(10),
            Random.nextInt(10),
            Random.nextInt(10),
            Random.nextInt(10)
        )
    } else {
        throw IllegalAccessException("No data for you, sorry")
    }

    fun loadDataForUser(userId: String): List<Int> = if (Random.nextBoolean()) {
        listOf(
            Random.nextInt(10),
            Random.nextInt(10),
            Random.nextInt(10),
            Random.nextInt(10)
        )
    } else {
        throw IllegalAccessException("No data for you, sorry")
    }
}
