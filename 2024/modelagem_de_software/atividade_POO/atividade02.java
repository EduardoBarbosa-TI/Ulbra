
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Beach beach = new Beach("Praia de atlântida","Latitude: -29.8008, Longitude: -50.0515 29° 48 3″ Sul, 50° 3′ 5″ Oeste" , 40, "Fina");
        System.out.println(beach.getBeach());
    }
}

class Beach {
    private String name;
    private String location;
    private int waterTemperature;
    private String sandType; 

    public Beach(String name, String location, int waterTemperature, String sandType){
        this.name = name;
        this.location = location;
        this.waterTemperature = waterTemperature;
        this.sandType = sandType;
    }

    public String getBeach(){           
        String informationBeach = "Nome da praia: " + name + 
                                    "\nLocalização da praia: " + location + 
                                    "\nTemperatura da praia: " + waterTemperature + "°" +
                                    "\nTipo da Areia da praia: " + sandType;
        return informationBeach;
    }

}
