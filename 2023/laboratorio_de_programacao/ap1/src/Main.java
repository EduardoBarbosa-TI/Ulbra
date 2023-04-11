public class Main {
    public static void main(String[] args) {


        //Instanciando a classe para objeto
        Estudante estudante01 = new Estudante();
        estudante01.setNome("Eduardo");
        estudante01.setIdade(21);
        estudante01.setPontos(30);


        Estudante estudante02 = new Estudante();
        estudante02.setNome("Ricardo");
        estudante02.setIdade(26);
        estudante02.setPontos(50);


        Gincana gincana = new Gincana();
        gincana.setNomeGincana("Gincana ADS");

        gincana.adicionarEstudante(estudante01);

        gincana.adicionarEstudante(estudante02);






        gincana.exibirVencedor();

    }
}