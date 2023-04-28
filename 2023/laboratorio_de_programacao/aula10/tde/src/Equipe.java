public class Equipe {
    String nome;
    int vitorias;
    int derrotas;
    int empates;

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

    public void registrarVitorias(){
        this.vitorias= vitorias + 1;
    }

    public void registrarDerrotas(){
        this.derrotas = this.derrotas + 1;
    }

    public void registrarEmpates(){
        this.empates = this.empates + 1;
    }
}
