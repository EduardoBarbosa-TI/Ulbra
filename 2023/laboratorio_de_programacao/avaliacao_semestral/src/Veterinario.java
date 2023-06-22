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

    public void informacoesVeterinario(){
        System.out.println("Informações do veterinário " + super.getNome());
        System.out.println("Cargo: " + super.getCargo());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Salário: " + super.getSalario());
    }

}
