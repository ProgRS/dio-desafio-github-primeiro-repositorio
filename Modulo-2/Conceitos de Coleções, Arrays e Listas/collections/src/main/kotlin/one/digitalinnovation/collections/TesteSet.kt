package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 200.00, "CLT")
    val Pedro = Funcionario("Pedro", 1500.00, "PJ")
    val Maria = Funcionario("Maria", 4000.00, "CLT")

    val funcionarios1 = setOf(Joao, Pedro)
    val funcionarios2 = setOf(Maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-----------------------")
    val funcionario3 = setOf(Joao, Pedro, Maria)
    val resultSubtract = funcionario3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-----------------------")
    val resultIntersect = funcionario3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}