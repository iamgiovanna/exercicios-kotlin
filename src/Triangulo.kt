package calculos_renais

import kotlin.math.sqrt
import kotlin.time.times

fun main(args: Array<String>) {
    println("Calculo da área de triângulos::")
    CalculoTri(a = 0.0, b = 0.0)

}

fun CalculoTri(a: Double, b: Double): Double {
    var num: Double? = 0.0
    var Valb: Double?
    var Valh: Double?


    println(
        "\nEscolha um triângulo!! Segue o menu com os tipos de triângulos e digite o que deseja calcular::" +
                "\nDigite::\n'1' para TRIÂNGULO ISÓCELES\n'2' para TRIÂNGULO EQUILÁTERO\n'3' para TRIÂNGULO ESCALENO \n"
    )
    num = readLine()!!.toDoubleOrNull()

    if (num == 1.0) {
        println("Triângulo selecionado--> ISÓCELES")
        println("Insira o valor da base do triângulo (b)")
        Valb = readLine()!!.toDoubleOrNull()

        println("Insira o valor da altura do triângulo (h)")
        Valh = readLine()!!.toDoubleOrNull()

        //Calculo para achar a área do triângulo
        val AreaIsoceles: Double? = (Valb!!.times(Valh!!)) / 2
        println("($Valb cm² * $Valh cm²)/2 = $AreaIsoceles cm²")
        println("A área do Triângulo Isóceles é igual a: $AreaIsoceles cm²")
        return (AreaIsoceles!!)

    } else if (num == 2.0) {
        println("Triângulo selecionado--> EQUILÁTERO")
        println("Insira o valor do lado do triângulo (l)")
        val ValorL: Double? = readLine()!!.toDoubleOrNull()

        //Calculo para achar a área do triângulo
        val AreaEquilatero: Double? = (Math.pow(ValorL!!, 2.0)) * sqrt(3.0) / 2
        println("($ValorL² * sqrt(3))/2 = $AreaEquilatero cm²")
        println("A área do Triângulo Equilátero é igual a: $AreaEquilatero cm²")
        return (AreaEquilatero!!)

    } else if (num == 3.0) {
        println("Triângulo selecionado--> ESCALENO")
        println("Insira o valor da base do triângulo (b)")
        Valb = readLine()!!.toDoubleOrNull()

        println("Insira o valor da altura do triângulo (h)")
        Valh = readLine()!!.toDoubleOrNull()

        //Calculo para achar a área do triângulo
        val AreaEscaleno: Double? = (Valb!!.times(Valh!!)) / 2
        println("($Valb cm² * $Valh cm²)/2 = $AreaEscaleno cm²")
        println("A área do Triângulo Escaleno é igual a: $AreaEscaleno cm²")
        return (AreaEscaleno!!)

    }
    return 1.0
}