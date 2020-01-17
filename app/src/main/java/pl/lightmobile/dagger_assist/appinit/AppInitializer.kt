package pl.lightmobile.dagger_assist.appinit

import android.app.Application

interface AppInitializer {
    fun init(application: Application)
}
