package lesson10;

public class TestekBusinessTicket extends TestekTicket {
    private String meal;
    private String seat;
    private String lounge;

    public TestekBusinessTicket() {
        super();
        this.meal = "000";
        this.seat = "000";
        this.lounge = "000";
    }

    public TestekBusinessTicket(String id, double price, String flightNumber, String departureDate, String departureTime, String arrivalDate, String arrivalTime, TestekPassenger passenger, String meal, String seat, String lounge) {
        super(id, price, flightNumber, departureDate, departureTime, arrivalDate, arrivalTime, passenger);
        this.meal = meal;
        this.seat = seat;
        this.lounge = lounge;
    }

    public TestekBusinessTicket(String meal, String seat, String lounge) {
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
    public String toString() {
        return "TestekBusinessTicket{" +
                "id='" + getId() + '\'' +
                ", price=" + getPrice() +
                ", flightNumber='" + getFlightNumber() + '\'' +
                ", departureDate='" + getDepartureDate() + '\'' +
                ", departureTime='" + getDepartureTime() + '\'' +
                ", arrivalDate='" + getArrivalDate() + '\'' +
                ", arrivalTime='" + getArrivalTime() + '\'' +
                ", passenger=" + getPassenger().getName() +
                ", meal='" + meal + '\'' +
                ", seat='" + seat + '\'' +
                ", lounge='" + lounge + '\'' +
                '}';
    }
}
