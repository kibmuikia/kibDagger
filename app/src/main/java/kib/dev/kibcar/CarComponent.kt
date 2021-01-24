package kib.dev.kibcar

import dagger.Component

//@Component(modules = [PetrolEngineModule::class, DieselEngineModule::class]) // Do Not provide more than one module
@Component(modules = [PetrolEngineModule::class])
interface CarComponent {

    fun getCar() : Car

    fun inject(mainActivity: MainActivity)

}