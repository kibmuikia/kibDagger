package kib.dev.kibcar

import android.util.Log
import javax.inject.Inject

class DieselEngine: CarBrain {

    companion object {
        val logTag = DieselEngine::class.java.simpleName
    }

    @Inject
    constructor() {

    }

    override fun start() {
        Log.e(logTag, ": start: Diesel Engine start")
    }
}