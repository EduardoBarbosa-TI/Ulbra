// Escreva uma função que recebe uma lista de strings e retorna uma nova lista com todas as strings em maiúsculas

fun main(){
    val listStrings = listOf("Eduardo","Barbosa","Bernardes")
	val result = convertToUpperCase(listStrings)
    println(result)
}

fun convertToUpperCase(listStrings: List<String>) = 
    if (listStrings.isEmpty()) listOf("Lista vazia!") else listStrings.map { it.toUpperCase() }