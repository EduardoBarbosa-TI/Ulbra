import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int idade;
    private ArrayList<Conta> contas;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setContas(Conta conta) {
        this.contas.add(conta);
    }
    public void getContas() {
        for(int i = 0; i < this.contas.size();i++){
            System.out.println(this.contas.get(i));
        }
    }
}
