// Escreva uma função de extensão onde disponibiliza para todas as Strings uma função que deixa todas as letras maiúsculas

fun main(){
    val name = "Eduardo Barbosa Bernardes"
	val result = name.myToUpperCase()
    println(result)
}

fun String.myToUpperCase() = this.toUpperCase() 