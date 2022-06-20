package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 1000.00)
    val Pedro = Funcionario("Pedro", 2000.00)
    val Maria = Funcionario("Maria", 4000.00)

    val funcionario = listOf(Joao, Pedro, Maria)

    funcionario.forEach { println(it) }

    println("------------------------")
    println(funcionario.find { it.nome == "Maria" })

}

data class Funcionario(
    val nome: String,
    val salario: Double
){

    override fun toString(): String =
        """
           Nome: $nome
           Salário: $salario
        """.trimIndent()



}