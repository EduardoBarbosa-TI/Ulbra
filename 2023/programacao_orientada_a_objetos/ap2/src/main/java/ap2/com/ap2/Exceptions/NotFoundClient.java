package ap2.com.ap2.Exceptions;

public class NotFoundClient extends RuntimeException{
    public NotFoundClient(){
        super("Cliente não encontrado!");
    }
}
