//Crie uma classe pessoa que tenha um construtor primário que recebe nome e idade como parâmetro, além disso, é necessário ter um método caminhar e falar.
// Obs: Os métodos caminhar e falar devem apenas printar "caminhando" e "falando"


class Person(val name: String,val age: Int){
    fun toWalk() = println(name + " caminhando...")
    fun toSpeak() = println(name + " falando...")
}
