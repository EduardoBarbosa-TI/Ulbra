public class Mamifero extends Animal{
    private String tipoPelagem;

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void amamentar(){
        System.out.println("Mamífero amamentando...");
    }

    public void informacoesMamifero(){
        System.out.println("Informações do animal " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Espécie: " + super.getEspecie());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Pelagem: " + this.tipoPelagem);
    }
}
