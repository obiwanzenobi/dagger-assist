package pl.lightmobile.dagger_assist.with_assist

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import pl.lightmobile.dagger_assist.dagger.ChildWorkerFactory
import pl.lightmobile.dagger_assist.dagger_example.DataProvider

class LoadDataWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
    private val dataProvider: DataProvider
) : Worker(context, params) {

    override fun doWork(): Result {
        dataProvider.loadData()

        return Result.success()
    }

    @AssistedInject.Factory
    interface Factory : ChildWorkerFactory
}
