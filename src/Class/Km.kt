package Class


class Km(override val valKm : Double = 1.00,
         override val valMilla : Double = 0.621371,
         override val valYarda : Double = 1093.61) : Unidad() {


   override fun convertir (valor: Double, unidadDestino : Unidad) : Double {
        return unidadDestino.convertir(valor, this)
   }

   override fun convertir(valor : Double, unidadDestino : Km) : Double{
       return 0.00
   }
    override fun convertir(valor : Double, unidadDestino : Milla) : Double{
        return 0.00
    }

    override fun convertir(valor: Double, unidadDestino : Yarda) : Double {
        return 0.00
    }
}