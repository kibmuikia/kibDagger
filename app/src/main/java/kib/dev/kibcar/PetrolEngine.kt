package kib.dev.kibcar

import android.util.Log
import javax.inject.Inject

class PetrolEngine: CarBrain {

    companion object {
        val logTag = PetrolEngine::class.java.simpleName
    }

    @Inject
    constructor() {

    }

    override fun start() {
        Log.e(logTag, ": start: Petrol engine starting")
    }
}