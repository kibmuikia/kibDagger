package kib.dev.kibcar

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

//    var powerCapacity: Int
//
//    constructor(powerCapacity: Int) {
//        this.powerCapacity = powerCapacity
//    }

    @Provides
    fun providesDieselEngine(powerCapacity: Int, engineCapacity: Float): CarBrain {
        return DieselEngine(powerCapacity, engineCapacity)
    }

}