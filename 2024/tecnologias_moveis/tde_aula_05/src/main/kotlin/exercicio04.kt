//Crie uma data class pessoa que recebe no seu construtor primário nome, idade, profissão e cpf, ambos são parâmetros imutáveis.
// Após instanciar a classe, utilize o método copy para criar uma nova instância alterando o nome passando por parâmetro o nome completo.

data class Pessoa(val name: String, val age: Int,val profession: String, val cpf: String){
    fun getPessoa() = "Nome: " + name + "\nIdade: " + age + "\nProfissão: " + profession + "\nCPF: " + cpf
}