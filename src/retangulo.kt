package calculos_renais


import kotlin.time.times

fun main(args: Array<String>) {
    println("Calculo da área de um retângulo::")
    Calcula(a = 0.0, b = 0.0)

}
fun Calcula(a: Double, b: Double): Double {
    var PrimeiroVal: Double?
    var SegundoVal: Double?

    println("Digite o primeiro valor do retângulo::")
    PrimeiroVal = readLine()!!.toDoubleOrNull()
    println("Digite o segundo valor do retângulo::")
    SegundoVal = readLine()!!.toDoubleOrNull()

    val AreaRetangulo: Double? = (PrimeiroVal!!.times(SegundoVal!!))
    println("$PrimeiroVal * $SegundoVal = $AreaRetangulo")
    println("A área do retângulo é igual a: $AreaRetangulo")
    return (AreaRetangulo!!)
}