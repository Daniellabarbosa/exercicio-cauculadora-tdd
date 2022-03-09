fun main () {


    println("Digite o primeiro número: ")
    val n1 = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val n2 = readLine()!!.toInt()

    println("Digite um operador: ")
    val operador = readLine()!!

    if (operador == "+") {
        soma(n1, n2)

    } else if (operador == "-") {
        subtração(n1, n2)
    } else if (operador == "/") {
        divisão(n1, n2)
    } else if (operador == "*") {
        multiplicação(n1, n2)
    }

}

fun soma(n1: Int, n2: Int) {
    val resultado = n1 + n2
    println("O resultado da soma é: $resultado")
}

fun subtração(n1: Int, n2: Int) {
    val resultado = n1 - n2
    println("O resultado da subtração é: $resultado")
}

fun divisão(n1: Int, n2: Int) {
    val resultado = n1 / n2
    println("O resultado da divisão é: $resultado")
}

fun multiplicação(n1: Int, n2: Int) {
    val resultado = n1 * n2
    println("O resultado da multiplicação é: $resultado")
}

