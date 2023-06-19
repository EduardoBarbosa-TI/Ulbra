public class Main {
    public static void main(String[] args) {
        //Inicializando um objeto Mamífero
        Mamifero ornitorrinco = new Mamifero();
        ornitorrinco.setNome("Fred");
        ornitorrinco.setEspecie("Ornithorhynchus");
        ornitorrinco.setIdade(3);
        ornitorrinco.setPeso(10.40);

        //Inicializando um objeto Ave
        Ave papagaio = new Ave();
        papagaio.setNome("Loro");
        papagaio.setEspecie("Psitacídeos");
        papagaio.setIdade(2);
        papagaio.setPeso(5);
        papagaio.setEnvergaduraAsa(1.20);

        //Inicializando um objeto Veterinário
        Veterinario ricardo = new Veterinario();
        ricardo.setNome("Ricardo Santos Alves");
        ricardo.setEspecialidade("Especializado em mamíferos e aves");
        ricardo.setCargo("Veterinário");
        ricardo.setSalario(5000.00);

        //Inicializando um objeto Zoo com vagas disponíveis
        Zoo zoologico01 = new Zoo(5,1);
        zoologico01.adicionarAnimais(papagaio);
        zoologico01.adicionarAnimais(ornitorrinco);
        zoologico01.adicioanarFuncionarios(ricardo);

        System.out.println(" ");

        //Inicializando um objeto Zoo com vagas indisponível
        Zoo zoologico02 = new Zoo(0,0);
        zoologico02.adicionarAnimais(ornitorrinco);
        zoologico02.adicioanarFuncionarios(ricardo);

        System.out.println(" ");

        //Utilizando métodos da class e subclass Animal e Mamifero
        ornitorrinco.getNome();
        ornitorrinco.getIdade();
        ornitorrinco.getEspecie();
        ornitorrinco.getPeso();
        ornitorrinco.amamentar();
        ornitorrinco.movimentar();
        ornitorrinco.movimentar("Direita");

        System.out.println(" ");

        //Utilizando métodos da class e subclass Animal e Ave
        papagaio.realizarTruque();
        papagaio.voar();
        papagaio.getNome();
        papagaio.getEspecie();
        papagaio.getIdade();
        papagaio.getEnvergaduraAsa();
        papagaio.getPeso();

        System.out.println(" ");

        //Utilizando métodos da class e subclass Funcionario e Veterinario
        ricardo.getNome();
        ricardo.getCargo();
        ricardo.getEspecialidade();
        ricardo.getSalario();
        ricardo.realizarExame(ornitorrinco);
        ricardo.realizarExame(papagaio);

    }
}