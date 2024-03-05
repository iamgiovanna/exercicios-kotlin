package calculos_renais

import kotlin.math.sqrt
fun main(args: Array<String>){
    println("Calculo renal do losango")
    CalculoLosango(a = 0.0, b = 0.0)
}

fun CalculoLosango(a: Double, b:Double ): Double?{
    var ValorDiag1: Double?
    var ValorDiag2: Double?

    println("Insira o valor da primeira diagonal (D)")
    ValorDiag1= readLine()!!.toDoubleOrNull()

    println("Insira o valor da segunda diagonal (d)")
    ValorDiag2 = readLine()!!.toDoubleOrNull()

    //Calculo para achar a área do losango
    val AreaLosango: Double? = (ValorDiag1!!.times(ValorDiag2!!))/2
    println("($ValorDiag1 * $ValorDiag2) / 2= $AreaLosango cm²")
    println("A área do losango é igual a: $AreaLosango cm²")
    return (AreaLosango!!)
}