package pl.lightmobile.dagger_assist.dagger

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import pl.lightmobile.dagger_assist.App
import pl.lightmobile.dagger_assist.MainBuilder
import pl.lightmobile.dagger_assist.dagger.modules.AssistedModule
//import pl.lightmobile.dagger_assist.dagger.modules.DemoModule
import pl.lightmobile.dagger_assist.dagger.modules.LotteryModule
import pl.lightmobile.dagger_assist.dagger.modules.ViewModule
import pl.lightmobile.dagger_assist.dagger.modules.WithoutAssistedModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        MainBuilder::class,
//        DemoModule::class,
        AssistedModule::class,
        WithoutAssistedModule::class,
        LotteryModule::class,
        ViewModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: App): AppComponent
    }
}
