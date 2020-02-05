import java.lang.IllegalArgumentException


fun main(){
    val Dimensions = Ponto()
    Dimensions.init_dimen()
    Dimensions.input_dimen()
}

class Ponto {

    var dimenX = intArrayOf(0, 0)
    var dimenY = intArrayOf(0, 0)


    fun init_dimen(){
        println("Coordenate X: ${dimenX}")
        println("Coordenate Y: ${dimenY}")
    }

    fun input_dimen() {
        this.dimenX = intArrayOf(5, 10)
        this.dimenY = intArrayOf(10, 20)

        //Fazer função para percorrer os valores do array


        if(dimenX < intArrayOf(0, 0) && dimenY < intArrayOf(0, 0)){
            println("Dimensions can't be negative")
        }else{
            println("Coordenates: X: ${dimenX} and Y: ${dimenY}")
        }
    }


//        set(value){
//            if (value < 0 ) throw IllegalArgumentException (
//                "Dimensions cannot be negative")
//            field = value
//        }
//    init {
//        var dimenX = dimenX
//        var dimenY = dimenY
//    }

}