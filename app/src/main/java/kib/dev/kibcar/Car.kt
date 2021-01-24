package kib.dev.kibcar

import javax.inject.Inject

class Car {

    companion object {
        val logTag = Car::class.simpleName
    }

    lateinit var engine: Engine
    lateinit var wheels: Wheels
    lateinit var carBrain: CarBrain

    @Inject
    constructor(engine: Engine, wheels: Wheels, carBrain: CarBrain) {
        this.engine = engine
        this.wheels = wheels
        this.carBrain = carBrain
    }

    fun start() {
        carBrain.start()
        System.out.println("$logTag : start: Car starting...")
    }

}