public class Veterinario extends Funcionario {
    private String especialidade;
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void realizarExame(Animal animal){
        System.out.println("Realizando exame no animal " + animal.getNome());
    }
}
