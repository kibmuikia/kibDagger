package kib.dev.kibcar

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun providesPetrolEngine(petrolEngine: PetrolEngine) : CarBrain

}