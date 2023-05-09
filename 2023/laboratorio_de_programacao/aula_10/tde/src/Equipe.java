public class Equipe {
    String nome;
    int vitorias;
    int derrotas;
    int empates;
    int pontos;
    int kills;

    public Equipe(String nome){
        this.nome = nome;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getPontos() {
        return pontos;
    }

    public void registrarVitorias(int kills){
        this.vitorias++;
        this.pontos+=3;
        this.kills = this.kills + kills;
    }

    public void registrarDerrotas(int kills){
        this.derrotas++;
        this.kills = this.kills + kills;
    }

    public void registrarEmpates(int kills){
        this.empates++;
        this.pontos++;
        this.kills = this.kills + kills;
    }

    public void imprimirEquipe(){
        System.out.println("Placar atual da equipe " + getNome() + ":");
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontuação: " + pontos);
        System.out.println("Aproveitamentos: " + aproveitamentoJogos() + "%");
        System.out.println("Kills: " + kills);
        System.out.println("  ");
        System.out.println("  ");
    }



    public double aproveitamentoJogos(){
        int totalJogos = vitorias + derrotas + empates;
        int totalPontosPossiveis = totalJogos * 3;
        double aproveitamentos = 0;
        if(totalPontosPossiveis > 0)
            aproveitamentos = (double) pontos / totalPontosPossiveis * 100;

        return aproveitamentos;
    }
}
