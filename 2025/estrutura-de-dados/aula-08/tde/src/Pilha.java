public class Pilha {
    private String[] elementos;
    private int tamanho;

    public Pilha(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    public int tamanho(){
        return this.tamanho;
    }
    public boolean estaVazia(){
        return tamanho == 0;
    }
    public boolean estaCheia(){
        return tamanho == elementos.length;
    }
    public boolean empilhar(String e){
        if(!estaCheia()){
            this.elementos[tamanho] = e;
            tamanho++;
            return true;
        }
        return false;
    }
    public void listar(){
        for(int i =0; i < tamanho; i++){
            System.out.println(elementos[i]);
        }
    }

    public String desempilhar(){
        if(!estaVazia()){
            tamanho--;
            return elementos[tamanho];
        }
        return null;
    }

    public String espiar(){
        if(!estaVazia()){
            return elementos[tamanho - 1];
        }
        return null;
    }


}