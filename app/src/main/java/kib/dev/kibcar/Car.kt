package kib.dev.kibcar

import javax.inject.Inject

class Car {

    companion object {
        val logTag = Car::class.simpleName
    }

    lateinit var engine: Engine
    lateinit var wheels: Wheels

    @Inject
    constructor(engine: Engine, wheels: Wheels) {
        this.engine = engine
        this.wheels = wheels
    }

    fun start() {
        System.out.println("$logTag : start: Car starting...")
    }

}