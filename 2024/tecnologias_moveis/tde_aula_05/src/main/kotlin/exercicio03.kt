//Crie uma sealed class que tenha o nome result e algumas classes que herdam da mesma, como Sucesso, Error e Loading.
// Utilizar sintaxe apresentada em aula.

sealed class Result{
    object Sucess: Result()
    object Error: Result()
    object Loadding: Result()
}

fun updateResult(state: Result){
    when (state) {
        is Result.Loadding -> println("Carregando...")
        is Result.Sucess -> println("Sucesso!")
        is Result.Error -> println("Erro!")
    }
}

