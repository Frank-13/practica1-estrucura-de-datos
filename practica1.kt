    fun main() {
        println("Ingrese el primer numero")
        val numeroUno = readline(). toDouble()

        println("Ingresse el segundo numero")
        val numeroDos = readline().toDouble

        println("Ingrese la operacion (+,-,*,/):")
        val operacion = readline()
        calculate(numerouno, numeroDos, operacion)
    }

        fun calculate(numeroUno: Double, numeroDos: Double,operacion String){
    if (numeroUno == null || numeroDos == null || operacion == null){
    println("Error: Ingrese numeros valios y una operacion validad.") return
}

    val resultado == when (operacion){
        "+" -> numeroUno + numeroDos
        "-" -> numeroUno - numeroDos
        "*" -> numeroUno * numeroDos
        "/" -> numeroUno / numeroDos
        else -> {
            println("Error OPeracion no valida.") return
        }
    }
    println("Resultado de la operacion $numeroUno $operacion $numeroDos = #resultado ")
        
}