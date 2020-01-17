package pl.lightmobile.dagger_assist.with_assist

import androidx.lifecycle.ViewModel
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import pl.lightmobile.dagger_assist.dagger_example.DataProvider

class UserVmAssisted @AssistedInject constructor(
    private val dataProvider: DataProvider,
    @Assisted private val userId: String
) : ViewModel() {

    init {
//        dataProvider.loadDataForUser(userId)
    }

    @AssistedInject.Factory
    interface Factory {
        fun create(userId: String): UserVmAssisted
    }
}
