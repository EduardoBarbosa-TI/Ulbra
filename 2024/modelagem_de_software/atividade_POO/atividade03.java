import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("Latam","Latitude: -29.8008, Longitude: -50.0515 29° 48 3″ Sul, 50° 3′ 5″ Oeste","Latitude: -39.8028, Longitude: -60.0215 19° 68 3″ Norte, 50° 3′ 5″ Leste" , "2024/12/01", 1500.00);
        System.out.println(flight.getFlight());
    }
}

class Flight {
    private String airlineCompany;
    private String origin;
    private String destiny;
    private String departureDate;
    private double ticketPrice; 


    public Flight(String airlineCompany, String origin, String destiny, String departureDate, double ticketPrice){
        this.airlineCompany = airlineCompany;
        this.origin = origin;
        this.destiny = destiny;
        this.departureDate = departureDate;
        this.ticketPrice = ticketPrice;
    }

    public String getFlight(){           
        String informationFlight = "Nome da companhia: " + airlineCompany + 
                                    "\nOrigem: " + origin + 
                                    "\nDestino: " + destiny +
                                    "\nData da partida: " + departureDate +
                                    "\nPreço da passagem: " + ticketPrice;
        return informationFlight;
    }
}
