package kib.dev.kibcar

import dagger.BindsInstance
import dagger.Component

//@Component(modules = [PetrolEngineModule::class, DieselEngineModule::class]) // Do Not provide two or more similar modules to avoid dagger error
//@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
@Component(modules = [DieselEngineModule::class, WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun providePowerCapacity(powerCapacity: Int): Builder

        @BindsInstance
        fun provideEngineCapacity(engineCapacity : Float) : Builder

        fun build(): CarComponent
    }

}