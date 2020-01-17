package pl.lightmobile.dagger_assist.appinit

import android.app.Application
import androidx.work.Configuration
import androidx.work.WorkManager
import androidx.work.WorkerFactory

class WorkManagerInitializer(
    private val workerFactory: WorkerFactory
) : AppInitializer {
    override fun init(application: Application) {
        val config = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()

        WorkManager.initialize(application, config)
    }
}
