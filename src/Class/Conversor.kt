package Class
import Interfaces.Unidad

 open abstract class Conversor {


    open fun convertTo( valor : Double, deUnidad : Unidad, aUnidad : Unidad) : Double {
        return 0.00
    }
}