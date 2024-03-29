public class Ave extends Animal implements ITreinavel{
    private double envergaduraAsa;
    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }
    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }
    public void voar(){
        System.out.println("A ave está voando...");
    }
    @Override
    public void realizarTruque() {
        System.out.println("Bah a ave realizou um truque voador jamais visto!");
    }

    public void informacoesAve(){
        System.out.println("Informações do animal " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Espécie: " + super.getEspecie());
        System.out.println("Peso: " + super.getPeso());
        System.out.println("Envergadura da asa: " + this.envergaduraAsa);
    }
}
