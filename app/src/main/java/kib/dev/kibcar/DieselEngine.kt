package kib.dev.kibcar

import android.util.Log
import javax.inject.Inject

class DieselEngine: CarBrain {

    companion object {
        val logTag = DieselEngine::class.java.simpleName
    }

    var powerCapacity : Int
    var engineCapacity : Float

    @Inject
    constructor(powerCapacity : Int, engineCapacity : Float) {
        this.powerCapacity = powerCapacity
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        Log.e(logTag, ": start: Diesel Engine start: powerCapaocity[ $powerCapacity ], engineCapacity[ $engineCapacity ]")
    }
}