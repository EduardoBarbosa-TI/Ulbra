fun main(){
    val color = "blue"
    
    val result = when(color) {
        "blue" -> "Azul"
        "red" -> "Vermelho"
        "green" -> "Verde"
        "yellow" -> "Amarelo"
        else -> "Cor não encontrada"
    }   

    println(result)
}
