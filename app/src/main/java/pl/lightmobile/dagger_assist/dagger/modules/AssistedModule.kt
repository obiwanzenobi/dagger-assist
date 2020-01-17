package pl.lightmobile.dagger_assist.dagger.modules

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module

@AssistedModule
@Module(includes = [AssistedInject_AssistedModule::class])
interface AssistedModule
