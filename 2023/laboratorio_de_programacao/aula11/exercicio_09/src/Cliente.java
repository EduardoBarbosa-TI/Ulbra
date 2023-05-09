public class Cliente extends Pessoa{
    int numCartao;

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void exibirDados(){
        System.out.println("Dados do cartão " + numCartao + ": ");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}
