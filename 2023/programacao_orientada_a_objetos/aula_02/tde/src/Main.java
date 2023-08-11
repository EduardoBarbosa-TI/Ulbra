import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listCars = new ArrayList<String>();
        String cars01 = "Gol";
        String cars02 = "Bmw";
        String cars03 = "Fiat";

        addCar(cars01,listCars);
        addCar(cars02,listCars);
        addCar(cars03,listCars);

        findAllCars(listCars);

        findByIdCars(1,listCars);

        removeCar(1,listCars);

        findAllCars(listCars);

        updateCars(listCars,"Fiat uno 1995",1);

        findAllCars(listCars);
    }

    public static void addCar(String cars,ArrayList listCars){
        listCars.add(cars);
        System.out.println("Carro " + cars + " adicionado com sucesso!");
    }

    public static void findAllCars(ArrayList<String> listCars){
        System.out.println("Todos os carros disponíveis " + listCars);
    }

    public static void findByIdCars(int index,ArrayList<String> listCars){
        System.out.println(listCars.get(index));
    }

    public static void updateCars(ArrayList<String> listCars,String car,int index){
        listCars.set(index,car);
        System.out.println("O carro atualizado na posição " + index +  " atualizado com sucesso!");
    }

    public static void removeCar(int index,ArrayList listCars){
        listCars.remove(index);
        System.out.println("O carro na posição " + index + " removido com sucesso!");
    }


}