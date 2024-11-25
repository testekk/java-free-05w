package lesson10;

public class TestekTicket {
    /**
     *  - `id`: Mã vé
     *    - `price`: Giá vé
     *    - `flightNumber`: Số hiệu chuyến bay
     *    - `departureDate`: Ngày khởi hành
     *    - `departureTime`: Giờ khởi hành
     *    - `arrivalDate`: Ngày đến
     *    - `arrivalTime`: Giờ đến
     *    - `passenger`: Hành khách
     *
     */
    private String id;
    private double price;
    private String flightNumber;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private TestekPassenger passenger;

    public TestekTicket(String id, double price, String flightNumber, String departureDate, String departureTime, String arrivalDate, String arrivalTime, TestekPassenger passenger) {
        this.id = id;
        this.price = price;
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.passenger = passenger;
    }

    public TestekTicket() {
        this.id = "000";
        this.price = 0.0;
        this.flightNumber = "000";
        this.departureDate = "00/00/0000";
        this.departureTime = "00:00";
        this.arrivalDate = "00/00/0000";
        this.arrivalTime = "00:00";
        this.passenger = new TestekPassenger();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public TestekPassenger getPassenger() {
        return passenger;
    }

    public void setPassenger(TestekPassenger passenger) {
        this.passenger = passenger;
    }
}
