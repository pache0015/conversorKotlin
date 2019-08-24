package Class


open abstract class Unidad {

    abstract val valKm : Double
    abstract val valMilla : Double
    abstract val valYarda : Double


    abstract fun convertir( valor: Double, unidadDestino : Unidad) : Double

    abstract fun convertir(valor : Double, unidadDestino : Km) : Double

    abstract fun convertir(valor : Double, unidadDestino : Milla) : Double

    abstract fun convertir(valor: Double, unidadDestino : Yarda) : Double
}