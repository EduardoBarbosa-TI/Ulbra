//Crie uma classe "CharGenerator" que receba no seu construtor primário (primary constructor),
// um valor min e um max e tenha um método onde gere um novo caracter.

import kotlin.random.Random

class CharGenerator(val valueMin: Char, val valueMax: Char) {
    fun generateChar() = "${valueMin}${valueMax}${(Random.nextInt())}"
}