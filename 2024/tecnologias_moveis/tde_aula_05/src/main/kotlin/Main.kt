import Result

fun main(args: Array<String>) {
    println("Exercício 01")
    val charGenerator = CharGenerator('C','R')
    val newCaracter = charGenerator.generateChar()
    println("Novo caracter: ${charGenerator.generateChar()}")


    println("\nExercício 02")
    val person = Person("Eduardo", 22)
    println("Nome da pessoa: " + person.name)
    println("Idade da pessoa: " + person.age)
    person.toSpeak()
    person.toWalk()

    println("\nExercício 03")
    val sucessResult = Result.Sucess
    val errorResult = Result.Error
    val loadingResult = Result.Loadding
    updateResult(sucessResult)
    updateResult(errorResult)
    updateResult(loadingResult)

    println("\nExercício 04")
    val pessoa01 = Pessoa("Eduardo", 22, "Analista de Sistema", "030.405.308-43")
    print(pessoa01.getPessoa())
    val pessoa02 = pessoa01.copy("Ricardo", cpf = "047.283.394-49")
    println("\n\n" + pessoa02.getPessoa())
}