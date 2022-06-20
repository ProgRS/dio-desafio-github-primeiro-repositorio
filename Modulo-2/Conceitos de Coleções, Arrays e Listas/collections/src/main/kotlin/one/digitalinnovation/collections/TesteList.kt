package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 200.00, "CLT")
    val Pedro = Funcionario("Pedro", 1500.00, "PJ")
    val Maria = Funcionario("Maria", 4000.00,"CLT")

    val funcionario = listOf(Joao, Pedro, Maria)

    funcionario.forEach { println(it) }

    println("------------------------")
    println(funcionario.find { it.nome == "Maria" })

    println("------------------------")
    funcionario
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------------")
    funcionario
        .groupBy {  it.tipoContratacao}
        .forEach { println(it) }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){

    override fun toString(): String =
        """
           Nome: $nome
           Salário: $salario
        """.trimIndent()



}