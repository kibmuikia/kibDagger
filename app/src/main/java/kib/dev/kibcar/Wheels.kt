package kib.dev.kibcar

import javax.inject.Inject

class Wheels {

    lateinit var tires: Tires
    lateinit var rims: Rims

    constructor(rims: Rims, tires: Tires) {
        this.rims = rims
        this.tires = tires
    }

}