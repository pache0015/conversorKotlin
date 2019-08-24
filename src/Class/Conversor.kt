package Class


 open abstract class Conversor {


    open fun convertTo( valor : Double, unidadOrig : Unidad, unidadDest : Unidad) : Double {
        return unidadOrig.convertir(valor, unidadDest)
    }
}