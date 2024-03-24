// Escreva uma função que encontra o último elemento ímpar em uma lista de inteiros.

fun main(){
    val listNumbers = listOf(20,39,44,3)
	val result = returnOddLastNumbers(listNumbers)
    println("O último número ímpar é: " + result)
}

fun returnOddLastNumbers(listNumbers: List<Int>) =
    if (listNumbers.isEmpty()) 0 else listNumbers.lastOrNull(){ it % 2 != 0 } ?: 0      
