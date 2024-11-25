package lesson10;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class ChivtkTicket {
    private String id;
    private double price;
    private int flightNumber;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private LocalDate arrivalDate;
    private LocalTime arrivalTime;
    private String passenger;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public double getFlightNumber(){
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }

    public LocalDate getDepartureDate(){
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate){
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime(){
        return departureTime;
    }
    public void setDepartureTime(LocalTime departureTime){
        this.departureTime = departureTime;
    }

    public LocalDate getArrivalDate(){
        return arrivalDate;
    }
    public void setArrivalDate(LocalDate arrivalDate){
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getArrivalTime(){
        return arrivalTime;
    }
    public void setArrivalTime(LocalTime arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    public String getPassenger(){
        return passenger;
    }
    public void setPassenger(String passenger){
        this.passenger = passenger;
    }

    //constructor
    public ChivtkTicket(String id, double price, int flightNumber, String passenger, LocalDate departureDate,
                        LocalTime departureTime, LocalDate arrivalDate, LocalTime arrivalTime){
        this.id = id;
        this.price = price;
        this.flightNumber = flightNumber;
        this.passenger = passenger;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
    }

    //DISPLAYINFOR
    public void displayInfor(){
        System.out.println("Thông tin vé máy bay");
        System.out.println("- id: "+getId());
        System.out.println("- Giá vé: "+getPrice());
        System.out.println("- Số hiệu chuyến bay: "+getFlightNumber());
        System.out.println("- Hành khách: "+getPassenger());
        System.out.println("- Ngày xuất phát: "+getDepartureDate());
        System.out.println("- Thời gian xuất phát: "+getDepartureTime());
        System.out.println("- Ngày đến: "+getArrivalDate());
        System.out.println("- Thời gian đến: "+getArrivalTime());
    }
}
