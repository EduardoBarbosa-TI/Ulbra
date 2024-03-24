// Escreva uma função que remove números inteiros duplicados.

fun main(){
    val listNumbers = listOf(10,20,10,30,20,30,50,50)
	val result = removeDuplicateNumbers(listNumbers)
    println(result)
}

fun removeDuplicateNumbers(listNumbers: List<Int>) = 
    if (listNumbers.isEmpty()) listOf(0) else listNumbers.distinct()