package pl.lightmobile.dagger_assist.dagger.modules

import dagger.Module
import dagger.Provides
import pl.lightmobile.dagger_assist.dagger_example.ClassWithDI2
import pl.lightmobile.dagger_assist.dagger_example.DataProvider
import pl.lightmobile.dagger_assist.dagger_example.IsNumberSelectedChecker

@Module
object LotteryModule {

    @Provides
    fun provideDataProvider(): DataProvider = DataProvider()

    @Provides
    fun provideNumberChecker(): IsNumberSelectedChecker = IsNumberSelectedChecker()

    @Provides
    fun provideCheckIfCurrentUserWinUseCase(
        isNumberSelectedChecker: IsNumberSelectedChecker,
        provider: DataProvider
    ): ClassWithDI2 = ClassWithDI2(isNumberSelectedChecker, provider)
}
