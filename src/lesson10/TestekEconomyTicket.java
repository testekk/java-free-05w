package lesson10;

public class TestekEconomyTicket extends TestekTicket {
    private String seat;

    public TestekEconomyTicket(String id, double price, String flightNumber, String departureDate, String departureTime, String arrivalDate, String arrivalTime, TestekPassenger passenger, String seat) {
        super(id, price, flightNumber, departureDate, departureTime, arrivalDate, arrivalTime, passenger);
        this.seat = seat;
    }

    public TestekEconomyTicket() {
        super();
    }


    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "TestekEconomyTicket{" +
                "id='" + getId() + '\'' +
                ", price=" + getPrice() +
                ", flightNumber='" + getFlightNumber() + '\'' +
                ", departureDate='" + getDepartureDate() + '\'' +
                ", departureTime='" + getDepartureTime() + '\'' +
                ", arrivalDate='" + getArrivalDate() + '\'' +
                ", arrivalTime='" + getArrivalTime() + '\'' +
                ", passenger=" + getPassenger().getName() +
                ", seat='" + seat + '\'' +
                '}';
    }
}
