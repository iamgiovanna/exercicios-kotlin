package calculos_renais
import kotlin.math.sqrt

fun main(args: Array<String>){
    println("\nPrograma que calcula a área do trapézio::")
    CalculoTrapezio(a = 0.0, b = 0.0, c = 0.0)
}

fun CalculoTrapezio(a: Double, b:Double, c:Double ): Double?{
    var ValMaior: Double?
    var ValMenor: Double?
    var ValAltura: Double?

    println("Insira o valor da base MAIOR do trapézio (B)")
    ValMaior = readLine()!!.toDoubleOrNull()

    println("Insira o valor da base MENOR do trapézio (b)")
    ValMenor = readLine()!!.toDoubleOrNull()

    println("Insira o valor da altura do trapézio (h)")
    ValAltura = readLine()!!.toDoubleOrNull()

    //Calculo para achar a área do losango
    val AreaTrapezio: Double? = ((ValMaior!! + ValMenor!!).times(ValMenor!!))/2
    println("(($ValMaior + $ValMenor) * $ValAltura)/2 = $AreaTrapezio cm²")
    println("A área do trapézio é igual a: $AreaTrapezio cm²")
    return (AreaTrapezio!!)
}