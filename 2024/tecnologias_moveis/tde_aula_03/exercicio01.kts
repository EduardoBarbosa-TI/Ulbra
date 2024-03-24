// Escreva uma função que recebe uma lista de números e retorna a média aritmética

fun main(){
    val listNumbers = listOf(20,39,49,50)
	val result = calculateAverage(listNumbers)
    println("A média dos números: " + result)
}

fun calculateAverage(listNumbers: List<Int>) = 
    if (listNumbers.isEmpty()) 0.0 else listNumbers.average()