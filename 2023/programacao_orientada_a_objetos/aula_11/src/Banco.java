import java.util.ArrayList;

public class Banco {
     private String name;
     private ArrayList<Conta> contas = new ArrayList();
     public Banco(String name){
         this.name = name;
     }
    public String getName() {
        return name;
    }
    public void criarConta(Conta conta){
         this.contas.add(conta);
    }
    public void atualizarConta(){

    }
    public void listarContas(){
        for(int i = 0; i < this.contas.size(); i++){
            System.out.println("Conta " + this.contas.get(i).getNumeroDaconta());
        }
    }
    public void deletarConta(Conta conta){
        for(int i = 0; i < this.contas.size(); i++){
            if(this.contas.get(i) == conta){
                this.contas.remove(i);
            }
        }
    }
}
