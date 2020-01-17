package pl.lightmobile.dagger_assist.without_assist

import androidx.lifecycle.ViewModel
import pl.lightmobile.dagger_assist.dagger_example.DataProvider

class UserVmNotAssisted(
    private val dataProvider: DataProvider
) : ViewModel() {

    lateinit var userId: String

    // data probably from intent / arguments
    fun init(userId: String) {
        this.userId = userId
        dataProvider.loadDataForUser(userId)
        //emit, error etc..
    }
}
