package pl.lightmobile.dagger_assist

data class Model(
    val name: String,
    val price: Int
) {
    fun combine(): String = "$name kosztuje $price"
}
