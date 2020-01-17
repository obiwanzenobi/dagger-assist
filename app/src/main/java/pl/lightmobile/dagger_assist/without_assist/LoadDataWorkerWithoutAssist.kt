package pl.lightmobile.dagger_assist.without_assist

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import pl.lightmobile.dagger_assist.dagger_example.DataProvider

class LoadDataWorkerWithoutAssist(
    context: Context,
    params: WorkerParameters
) : Worker(context, params) {

    private val dataProvider: DataProvider = DataProvider()

    override fun doWork(): Result {
        dataProvider.loadData()

        return Result.success()
    }
}
