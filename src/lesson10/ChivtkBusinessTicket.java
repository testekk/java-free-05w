package lesson10;

import java.time.LocalDate;
import java.time.LocalTime;

public class ChivtkBusinessTicket extends ChivtkTicket {
    private String lounge, meal, seat;

    //GETTER + SETTER
    public String getLounge(){
        return lounge;
    }
    public void setLounge(String lounge){
        this.lounge = lounge;
    }

    public String getMeal(){
        return meal;
    }
    public void setMeal(String meal){
        this.meal = meal;
    }

    public String getSeat(){
        return seat;
    }
    public void setSeat(String seat){
        this.seat = seat;
    }

    public ChivtkBusinessTicket(String id, double price, int flightNumber, String passenger, LocalDate departureDate,
                                LocalTime departureTime, LocalDate arrivalDate, LocalTime arrivalTime, String lounge, String meal, String seat){
        super(id, price, flightNumber, passenger, departureDate, departureTime, arrivalDate, arrivalTime);
        this.lounge = lounge;
        this.meal = meal;
        this.seat = seat;
    }

    public void displayTicket(){
        System.out.println("Business Ticket");
    }


}
