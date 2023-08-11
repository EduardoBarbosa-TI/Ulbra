import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        int idade = 25;
        //Mais espaço na mémoria
        long idadeLong = 2353653572235L;

        boolean isActive = false;

        double numberDouble = 12.2;
        //Condicionais
        var idadeReferencia = 18;
        if(idadeReferencia >= 18) System.out.println("é maior");
        else System.out.println("é menor");

        var result = (idadeReferencia>=18)? "é maior" : "é menor";
        System.out.println(result);

        //Laços
        switch(idadeReferencia){
            case 18:
                System.out.println("18");
                break;
            case 19:
                System.out.println("19");
                break;
            default:
                System.out.println("Não encontrado!");
                break;
        }

        var cont = 0;
        while(cont < 6){
            System.out.println(cont);
            cont++;
        }

        for(var i = 0; i < 5;i++){
            System.out.println(i);
        }

        //Listas

        int[] ints = {10, 20, 30, 40};
        String[] strings = {"Hello","World"};

        System.out.println(ints[1]);
        System.out.println(strings[1]);

        ArrayList<String> cars = new ArrayList();
        cars.add("BMW");
        cars.add("Fiat Uno");
        cars.add("Gol");

        System.out.println(cars);
        System.out.println(cars.get(0));

        cars.remove(0);
        System.out.println(cars);

        cars.set(0,"Mercedes");
        System.out.println(cars);

        addItemsList("Carro novo",cars);
        System.out.println(cars);
    }
    public static void addItemsList(String elemento, ArrayList<String> lista){
        lista.add(elemento);
    }

}