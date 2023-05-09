public class GerenciamentoCampeonato {
    public static void main(String[] args) {

        Equipe equipe01 = new Equipe("monstersFury");
        equipe01.registrarVitorias(24);
        equipe01.registrarVitorias(35);
        equipe01.registrarEmpates(24);
        equipe01.registrarEmpates(45);
        equipe01.registrarDerrotas(21);

        Equipe equipe02 = new Equipe("DragonsRed");
        equipe02.registrarVitorias(23);
        equipe02.registrarVitorias(45);
        equipe02.registrarVitorias(21);
        equipe02.registrarEmpates(35);
        equipe02.registrarEmpates(12);
        equipe02.registrarDerrotas(12);

        equipe01.imprimirEquipe();

        equipe02.imprimirEquipe();
    }
}
