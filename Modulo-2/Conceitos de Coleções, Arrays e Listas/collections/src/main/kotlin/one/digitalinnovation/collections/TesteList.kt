package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 200.00, "CLT")
    val Pedro = Funcionario("Pedro", 1500.00, "PJ")
    val Maria = Funcionario("Maria", 4000.00,"CLT")

    val funcionarios = listOf(Joao, Pedro, Maria)

    funcionarios.forEach { println(it) }

    println("------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------------")
    funcionarios
        .groupBy {  it.tipoContratacao}
        .forEach { println(it) }


}

