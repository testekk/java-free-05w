package lesson10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

public class DiepLthEconomyTicket extends DiepLthTicket{
    private String meal;
    private String seat;
    public DiepLthEconomyTicket(String id, double price, String flightNumber, LocalDate departureDate, LocalTime departureTime, LocalDate arrivalDate, LocalTime arrivalTime, DiepLthPassenger passenger, String meal, String seat) {
        super(id, price, flightNumber, departureDate, departureTime, arrivalDate, arrivalTime, passenger);
        this.meal = meal;
        this.seat = seat;
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

    @Override
    public void printTicketDetail() {
        System.out.println("Economy Ticket: ");
        System.out.println("Ticket ID: " + getId());
        System.out.println("Price: " + getPrice());
        System.out.println("Flight Number: " + getFlightNumber());
        System.out.println("Departure: " + getDepartureDate() + getDepartureTime());
        System.out.println("Arrival: " + getArrivalDate() + getArrivalTime());
        System.out.println("Meal: " + getMeal());
        System.out.println("Seat: " + getSeat());
        getPassenger().printPassenger();
    }
}
