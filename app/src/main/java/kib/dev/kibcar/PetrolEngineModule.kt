package kib.dev.kibcar

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providesPetrolEngine(petrolEngine: PetrolEngine) : CarBrain {
        return petrolEngine
    }

}