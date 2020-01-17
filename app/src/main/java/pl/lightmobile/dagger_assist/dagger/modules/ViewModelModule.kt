package pl.lightmobile.dagger_assist.dagger.modules

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import pl.lightmobile.dagger_assist.dagger.ViewModelKey
import pl.lightmobile.dagger_assist.dagger_example.DataProvider
import pl.lightmobile.dagger_assist.with_assist.SimpleVm

@Module
object ViewModelModule {

    @Provides
    @IntoMap
    @ViewModelKey(SimpleVm::class)
    fun provideSimpleVm(dataProvider: DataProvider): ViewModel = SimpleVm(dataProvider)

}
