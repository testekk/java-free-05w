package lesson10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ChivtkTicketManagement {
    //Tạo danh sách các vé máy bay.
    List<ChivtkTicket> tickets;

    //GETTER + SETTER
    public List<ChivtkTicket> getTicket(){
        return tickets;
    }
    public void setTicket(ChivtkTicket tickets){
        this.tickets = new ArrayList<>();
    }

    //CONSTRUCTOR:
    public ChivtkTicketManagement(){
        this.tickets = new ArrayList<>();
    }

    //Thêm vé máy bay.
    public void addTicket(ChivtkTicket ticket){
        tickets.add(ticket);
    }

    //Hiển thị danh sách vé máy bay
    public void displayInfor(){
        System.out.println("Thông tin vé máy bay");
        for(ChivtkTicket ticket : tickets){
            System.out.println("- Mã vé máy bay: "+ticket.getId());
            System.out.println("- Giá vé máy bay: "+ticket.getPrice());
            System.out.println("- Số hiệu máy bay: "+ticket.getFlightNumber());
            System.out.println("- Ngày khởi hành: "+ticket.getDepartureDate());
            System.out.println("- Thời gian khởi hành: "+ticket.getDepartureTime());
            System.out.println("- Ngày đến: "+ticket.getArrivalDate());
            System.out.println("- Thời gian đến: "+ticket.getArrivalTime());
            System.out.println("- Hành khách: "+ticket.getPassenger());
            System.out.println();
        }
    }

    //Tìm kiếm vé máy bay theo mã vé.
    public ChivtkTicket searchTicketById(String id){
        System.out.println("Thông tin mã vé máy bay "+id+" vừa tìm kiếm");
        for(ChivtkTicket ticket : tickets){
            if(ticket.getId().equalsIgnoreCase(id)){
                return ticket;
            }
        }
        return null;
    }

    //Sắp xếp vé máy bay theo giá vé tăng dần.
    public void sortByPrice(){
        System.out.println("Sắp xếp vé máy bay theo giá vé tăng dần.");
        tickets.sort((ticket1, ticket2) -> Double.compare(ticket1.getPrice(), ticket2.getPrice()));
    }

    //Sắp xếp vé máy bay theo ngày khởi hành tăng dần.
    public void sortByDepartureDate(){
        System.out.println("Sắp xếp vé máy bay theo ngày khởi hành tăng dần.");
        tickets.sort((ticket1, ticket2) -> ticket1.getDepartureDate().compareTo(ticket2.getDepartureDate()));
    }

    //Sắp xếp vé máy bay theo ngày đến tăng dần.
    public void sortByArriveDate(){
        System.out.println("Sắp xếp vé máy bay theo ngày đến tăng dần.");
        tickets.sort((ticket1, ticket2) -> ticket1.getArrivalDate().compareTo(ticket2.getArrivalDate()));
    }

    //Tính tổng tiền của tất cả các vé máy bay.
    public double getTotalPrice(){
        System.out.println("Tổng tiền của tất cả các vé máy bay.");
        double totalPrice = 0;
        for(ChivtkTicket ticket : tickets){
            totalPrice += ticket.getPrice();
        }
        return totalPrice;
    }

    //Tính tổng tiền theo từng loại vé

    public static void main(String[] args) {
        // Khởi tạo đối tượng Passenger
        ChivtkPassenger passenger1 = new ChivtkPassenger("P001", "John Doe", "123 Main St", 123456789);
        ChivtkPassenger passenger2 = new ChivtkPassenger("P002", "Jane Doe", "456 Elm St", 987654321);

        // Khởi tạo đối tượng TicketManagement
        ChivtkTicketManagement ticketManagement = new ChivtkTicketManagement();

        // Tạo vé máy bay
        ChivtkTicket ticket1 = new ChivtkEconomyTicket("T001", 1000000, 123, "P001",
                LocalDate.of(2024, 11, 26), LocalTime.of(13, 30),
                LocalDate.of(2024, 11, 26), LocalTime.of(16, 30),
                "Dinner", "S001");
        ChivtkTicket ticket2 = new ChivtkEconomyTicket("T002", 1500000, 456, "P002",
                LocalDate.of(2024, 11, 25), LocalTime.of(7, 30),
                LocalDate.of(2024, 11, 26), LocalTime.of(6, 00),
                "Breakefast, Lunch, Dinner", "S002");

        // Thêm vé vào hệ thống
        ticketManagement.addTicket(ticket1);
        ticketManagement.addTicket(ticket2);

        // Hiển thị danh sách vé máy bay
        ticketManagement.displayInfor();

        // Tìm vé theo mã
        ChivtkTicket foundTicket = ticketManagement.searchTicketById("T001");
        System.out.println("- Giá vé: "+foundTicket.getPrice());
        System.out.println("- Số hiệu chuyến bay: "+foundTicket.getFlightNumber());
        System.out.println("- Hành khách: "+foundTicket.getPassenger());
        System.out.println("- Ngày xuất phát: "+foundTicket.getDepartureDate());
        System.out.println("- Thời gian xuất phát: "+foundTicket.getDepartureTime());
        System.out.println("- Ngày đến: "+foundTicket.getArrivalDate());
        System.out.println("- Thời gian đến: "+foundTicket.getArrivalTime());
        System.out.println();

        // Sắp xếp theo giá vé
        ticketManagement.sortByPrice();
        ticketManagement.displayInfor();

        //Sắp xếp vé máy bay theo ngày khởi hành tăng dần.
        ticketManagement.sortByDepartureDate();
        ticketManagement.displayInfor();

        //Sắp xếp vé máy bay theo ngày đến tăng dần.
        ticketManagement.sortByArriveDate();
        ticketManagement.displayInfor();

        // Tính tổng tiền tất cả vé
        System.out.println("Total Price: " + ticketManagement.getTotalPrice());
        System.out.println();

        //Tính tổng tiền theo từng loại vé
    }
}
