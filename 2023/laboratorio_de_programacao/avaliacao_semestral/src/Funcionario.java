public abstract class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
}

