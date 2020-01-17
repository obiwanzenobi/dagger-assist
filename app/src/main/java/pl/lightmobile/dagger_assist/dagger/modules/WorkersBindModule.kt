package pl.lightmobile.dagger_assist.dagger.modules

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import pl.lightmobile.dagger_assist.dagger.ChildWorkerFactory
import pl.lightmobile.dagger_assist.dagger.WorkerKey
import pl.lightmobile.dagger_assist.with_assist.LoadDataWorker

@Module
abstract class WorkersBindModule {

    @Binds
    @IntoMap
    @WorkerKey(LoadDataWorker::class)
    abstract fun loadDataWorker(
        factory: LoadDataWorker.Factory
    ): ChildWorkerFactory
}
