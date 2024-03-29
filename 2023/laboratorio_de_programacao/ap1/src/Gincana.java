public class Gincana {
    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;

    public void setNomeGincana(String nomeGincana) {
        this.nomeGincana = nomeGincana;
    }

    public void setTotalEstudantes(int totalEstudantes) {
        this.totalEstudantes = totalEstudantes;
    }

    public void setPontuacaoMaxima(int pontuacaoMaxima) {
        this.pontuacaoMaxima = pontuacaoMaxima;
    }
    public String getNomeGincana() {
        return nomeGincana;
    }

    public int getTotalEstudantes() {
        return totalEstudantes;
    }

    public Estudante getEstudanteVencedor() {
        return this.estudanteVencedor;
    }

    public int getPontuacaoMaxima() {
        return this.pontuacaoMaxima;
    }

    public void adicionarEstudante(Estudante estudante){
        if(estudante.getNome() != null && estudante.getPontos() != 0 && estudante.getIdade() > 6 ){
            if(estudante.getPontos() > this.pontuacaoMaxima ) {
                this.estudanteVencedor = estudante;
                this.pontuacaoMaxima = estudante.getPontos();
            }
            this.totalEstudantes++;
        }else{
            System.out.println("Usuário não foi adicionado corretamente !!");
        }
    }

    public void exibirVencedor(){
        System.out.println("Gincana finalizada!!!");
        System.out.println(" ");
        System.out.println("Vencedor:");
        System.out.println("Nome: " + this.estudanteVencedor.getNome() + " Pontuação: " + this.estudanteVencedor.getPontos() );
    }

}
