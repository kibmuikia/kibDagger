package kib.dev.kibcar

import dagger.Component

@Component
interface CarComponent {

    fun getCar() : Car

}