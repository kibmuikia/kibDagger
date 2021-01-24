package kib.dev.kibcar

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        Log.e(WheelsModule::class.java.simpleName, ": provideWheels: init")
        return Wheels(rims, tires)
    }

    @Provides
    fun providesRims() : Rims {
        Log.e(WheelsModule::class.java.simpleName, ": providesRims: init")
        return Rims()
    }

    @Provides
    fun provideTires() : Tires {
        Log.e(WheelsModule::class.java.simpleName, ": provideTires: init")
        return Tires()
    }
}