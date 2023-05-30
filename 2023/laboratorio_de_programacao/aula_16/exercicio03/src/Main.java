public class Main {
    public static void main(String[] args) {
        int[] valores = {23,1,34,89,2};
        int maiorValor = valores[1];

        for(int i = 0; i < valores.length; i++){
            if(valores[i] > maiorValor){
                maiorValor = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maiorValor);



    }
}