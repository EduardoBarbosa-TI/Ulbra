public class Zoo {
    private Animal[] animais;
    private Funcionario[] funcionarios;
    public Zoo(int qtdAnimais,int qtdFuncionarios){
        this.animais = new Animal[qtdAnimais];
        this.funcionarios = new Funcionario[qtdFuncionarios];
    }
    public void adicionarAnimais(Animal animal){
        boolean verificacao = false;

        for(int i = 0; i < animais.length;i++){
            if(animais[i] == null){
                verificacao = true;
                animais[i] = animal;
                System.out.println("Animal " + animal.getNome() + " adicionado com sucesso! Na posição " + i);
                break;
            }
        }
        if(!verificacao) {
            System.out.println("Acabaram as vagas para os animais!");
        }
    }
    public void adicioanarFuncionarios(Funcionario funcionario){
        boolean verificacaoFunc = false;

        for(int i = 0; i < funcionarios.length;i++){
            if(funcionarios[i] == null){
                verificacaoFunc = true;
                funcionarios[i] = funcionario;
                break;
            }
        }
        if(!verificacaoFunc) {
            System.out.println("Acabaram as vagas para os funcionários!");
        }
    }
}

