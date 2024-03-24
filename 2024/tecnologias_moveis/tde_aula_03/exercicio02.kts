// Escreva uma função que recebe uma lista de números e retorna apenas os números pares

fun main(){
    val listNumbers = listOf(20,39,49,50)
	val result = returnEvenNumbers(listNumbers)
    println("Os números pares são: " + result)
}

fun returnEvenNumbers(listNumbers: List<Int>) = 
    if (listNumbers.isEmpty()) listOf(0) else listNumbers.filter(){ it % 2 == 0}