package lesson10;

import java.time.LocalDate;
import java.time.LocalTime;

public class DiepLthBusinessTicket extends DiepLthTicket{
    private String meal;
    private String seat;
    private String lounge;


    public DiepLthBusinessTicket(String id, double price, String flightNumber, LocalDate departureDate, LocalTime departureTime, LocalDate arrivalDate, LocalTime arrivalTime, DiepLthPassenger passenger, String meal, String seat, String lounge) {
        super(id, price, flightNumber, departureDate, departureTime, arrivalDate, arrivalTime, passenger);
        this.meal = meal;
        this.seat = seat;
        this.lounge = lounge;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getLounge() {
        return lounge;
    }

    public void setLounge(String lounge) {
        this.lounge = lounge;
    }

    @Override
    public void printTicketDetail() {
        System.out.println("Business Ticket: ");
        System.out.println("Ticket ID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("Departure: " + getDepartureDate() + getDepartureTime());
        System.out.println("Arrival: " + getArrivalDate() + getArrivalTime());
        System.out.println("Meal: " + getMeal());
        System.out.println("Seat: " + getSeat());
        System.out.println("Lounge: " + getLounge());
        getPassenger().printPassenger();
    }
}
