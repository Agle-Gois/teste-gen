
fun main() {

    println("Digite o diâmetro do circulo ")
    val diametro = readln().toDouble()

    val raio = diametro / 2
    val area = 3.1415926 * (raio * raio)
    val perimetro = 2 * 3.1415 * raio

    println("A área do circulo é: ${"%.2f".format(area)}")

    println("O perímetro do circulo é: ${"%.2f".format(perimetro)}")

}



