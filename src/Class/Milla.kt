package Class



class Milla( override val valKm : Double = 0.00,
             override val valMilla : Double = 0.00,
             override val valYarda : Double = 0.00) : Unidad(){

    override fun convertir (valor: Double, unidadDestino : Unidad) : Double {
        return unidadDestino.convertir(valor, this)
    }

    override fun convertir(valor : Double, unidadDestino : Km) : Double{
        return unidadDestino.convertir(valor, this)
    }
    override fun convertir(valor : Double, unidadDestino : Milla) : Double{
        return 0.00
    }

    override fun convertir(valor: Double, unidadDestino : Yarda) : Double {
        return 0.00
    }
}