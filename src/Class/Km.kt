package Class

import Interfaces.Unidad

class Km(val kmAYarda: Double = 1093.61, val kmAMilla: Double = 0.621371) : Unidad {
    fun getkmAMilla(): Double{
        return this.kmAMilla
    }
}