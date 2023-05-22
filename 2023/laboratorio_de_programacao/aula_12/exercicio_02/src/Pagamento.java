import java.time.LocalDate;

public abstract class Pagamento {
    LocalDate dataAtual = LocalDate.now();
    public void realizarPagamento(double valor){

    }

    public void emitirRecibo(){

    }
   public void dataAtual(){
        System.out.println("Recibo emitido na data: " + dataAtual);
    }

}
