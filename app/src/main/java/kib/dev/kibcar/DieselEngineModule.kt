package kib.dev.kibcar

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun providesDieselEngine(dieselEngine: DieselEngine) : CarBrain {
        return dieselEngine
    }

}