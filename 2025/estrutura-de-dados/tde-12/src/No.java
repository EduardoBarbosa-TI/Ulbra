public class No<T> {
    T dado;
    No<T> proximo;

    public No(T elemento) {
        this.dado = elemento;
        this.proximo = null;
    }
}
