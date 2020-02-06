import java.util.zip.DeflaterOutputStream

fun main(){

    val Dimensions = Ponto()
    Dimensions.init_dimen()
    Dimensions.input_dimen()
    Dimensions.calc_dist_euclid()
}

class Ponto {

    var dimenX1 = 5
    var dimenX2 = 10
    var dimenY1 = 20
    var dimenY2 = 1


    fun init_dimen() {
        println("Coordenate X1: ${dimenX1}")
        println("Coordenate X2: ${dimenX2}")
        println("Coordenate Y1: ${dimenY1}")
        println("Coordenate Y2: ${dimenY2}")
    }


    fun input_dimen(){
        this.dimenX1 = 5
        this.dimenX2 = 7
        this.dimenY1 = 10
        this.dimenY2 = 15

        if (dimenX1 < 0 && dimenX2 < 0 && dimenY1 < 0 && dimenY2 < 0) {

            println("Dimensions can't be negative")

        } else {

            println("Coordenates changed to: X1: ${dimenX1} X2: ${dimenX2} Y1: ${dimenY1} Y2: ${dimenY2}")

        }
    }


    fun calc_dist_euclid(){


        val distance = Math.sqrt(Math.sqrt((dimenX1 - dimenX2).toDouble()) + Math.sqrt((dimenY1 - dimenY2).toDouble()))

        println("Dist Euclid: ${distance}")
    }

}