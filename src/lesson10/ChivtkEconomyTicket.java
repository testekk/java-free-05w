package lesson10;

import java.time.LocalDate;
import java.time.LocalTime;

public class ChivtkEconomyTicket extends ChivtkTicket {
    private String meal, seat;

    //GETTER + SETTER
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

    //CONSTRUCTOR
    public ChivtkEconomyTicket(String id, double price, int flightNumber, String passenger, LocalDate departureDate, LocalTime departureTime,
                         LocalDate arrivalDate, LocalTime arrivalTime, String meal, String seat) {
        super(id, price, flightNumber, passenger, departureDate, departureTime, arrivalDate, arrivalTime); //Gọi constructor của lớp cha tại lớp con
        this.meal = meal;
        this.seat = seat;
    }

}
