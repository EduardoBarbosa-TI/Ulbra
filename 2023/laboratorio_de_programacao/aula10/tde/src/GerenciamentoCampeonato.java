public class GerenciamentoCampeonato {
    public static void main(String[] args) {

        Equipe equipe01 = new Equipe("monstersFury");
        equipe01.registrarVitorias();
        equipe01.registrarVitorias();
        equipe01.registrarEmpates();
        equipe01.registrarEmpates();
        equipe01.registrarDerrotas();

        Equipe equipe02 = new Equipe("DragonsRed");
        equipe02.registrarVitorias();
        equipe02.registrarVitorias();
        equipe02.registrarVitorias();
        equipe02.registrarEmpates();
        equipe02.registrarEmpates();
        equipe02.registrarDerrotas();


        System.out.println("Placar atual da equipe " + equipe01.getNome() + ":");
        System.out.println("Vitórias: " + equipe01.getVitorias());
        System.out.println("Empates: " + equipe01.getEmpates());
        System.out.println("Derrotas: " + equipe01.getDerrotas());

        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Placar atual da equipe " + equipe02.getNome() + ":");
        System.out.println("Vitórias: " + equipe02.getVitorias());
        System.out.println("Empates: " + equipe02.getEmpates());
        System.out.println("Derrotas: " + equipe02.getDerrotas());
    }
}
