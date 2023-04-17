public class Main {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        estudante01.setNome("Eduardo");
        estudante01.setIdade(21);
        estudante01.setPontos(30);


        Estudante estudante02 = new Estudante();
        estudante02.setNome("Ricardo");
        estudante02.setIdade(26);
        estudante02.setPontos(80);


        Estudante estudante03 = new Estudante();
        estudante03.setNome("Paulo");
        estudante03.setIdade(28);
        estudante03.setPontos(70);

        Gincana gincana = new Gincana();
        gincana.setNomeGincana("Gincana ADS");

        gincana.adicionarEstudante(estudante01);
        gincana.adicionarEstudante(estudante02);
        gincana.adicionarEstudante(estudante03);
        System.out.println("  ");
        gincana.exibirVencedor();

    }
}