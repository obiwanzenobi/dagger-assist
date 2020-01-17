package pl.lightmobile.dagger_assist

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import pl.lightmobile.dagger_assist.dagger.DaggerAppComponent

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}
