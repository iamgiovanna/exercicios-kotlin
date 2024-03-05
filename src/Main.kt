package calculos_renais

import kotlin.math.sqrt

fun main(args: Array<String>)
{
    println("Calculo da circunferencia!")
    CalCir(a = 0.0)
}

fun CalCir(a:Double): Double?
{
    var ValCir: Double?

    println("Valor do raio da circunferência")
    ValCir = readLine()!!.toDoubleOrNull()

    val ArCir: Double? = 3.14 .times(Math.pow(ValCir!!,2.0))
    println("$ValCir * 3.14 = $ArCir")
    println("$ValCir² * 3,14 = $ArCir cm²")
    println("A área da circunferência é igual a: $ArCir cm²")
    return (ValCir!!)
}