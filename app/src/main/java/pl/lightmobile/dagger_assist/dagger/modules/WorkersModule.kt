package pl.lightmobile.dagger_assist.dagger.modules

import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import dagger.Module
import dagger.Provides
import pl.lightmobile.dagger_assist.dagger.ChildWorkerFactory
import pl.lightmobile.dagger_assist.dagger.DaggerWorkerFactory
import javax.inject.Provider

@Module(includes = [
//    WorkersAssistedModule::class,
    WorkersBindModule::class
])
object WorkersModule {

    @Provides
    fun provideWorkerManager(
        providers: Map<
            Class<out ListenableWorker>,
            @JvmSuppressWildcards Provider<ChildWorkerFactory>>
    ): WorkerFactory = DaggerWorkerFactory(providers)
}
