package kib.dev.kibcar

import dagger.Component

//@Component(modules = [PetrolEngineModule::class, DieselEngineModule::class]) // Do Not provide two or more similar modules to avoid dagger error
@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {

    fun getCar() : Car

    fun inject(mainActivity: MainActivity)

}