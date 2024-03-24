// Escreva uma função de extensão onde disponibiliza para todas as Strings uma função que concatena o R$ aos números

fun main(){
    val number = 20
	val result = number.convertNumberToBRL()
    println(result)
}

fun Int.convertNumberToBRL() = "R$ " + this