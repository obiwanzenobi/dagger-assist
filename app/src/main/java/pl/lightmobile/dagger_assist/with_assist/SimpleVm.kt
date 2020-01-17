package pl.lightmobile.dagger_assist.with_assist

import androidx.lifecycle.ViewModel
import pl.lightmobile.dagger_assist.dagger_example.DataProvider

class SimpleVm(
    private val dataProvider: DataProvider
) : ViewModel() {

    init {
        dataProvider.loadData()
    }
}
