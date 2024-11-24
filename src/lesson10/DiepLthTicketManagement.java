package lesson10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DiepLthTicketManagement {

    private List<DiepLthTicket> tickets;

    public DiepLthTicketManagement() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(DiepLthTicket ticket){
        tickets.add(ticket);
    }

    public void displayListTicket(){
        for (DiepLthTicket ticket : tickets){
            ticket.printTicketDetail();
            System.out.println("-------------------------");
        }
    }

    public DiepLthTicket searchByTicketId(String idToSearch){
        for (DiepLthTicket ticket : tickets){
            if (ticket.getId().equalsIgnoreCase(idToSearch)){
                return ticket;
            }

        }
        return null;
    }
    public void sortTicketsByPrice() {
        tickets.sort(Comparator.comparingDouble(DiepLthTicket::getPrice));
    }
    public void sortTicketsByDepartureDate() {
        tickets.sort(Comparator.comparing(DiepLthTicket::getDepartureDate));
    }

    public void sortTicketsByArrivalDate() {
        tickets.sort(Comparator.comparing(DiepLthTicket::getArrivalDate));
    }
    public double calculateTotalRevenue() {
        double total = 0;
        for (DiepLthTicket ticket : tickets) {
            total += ticket.getPrice();
        }
        return total;
    }

    public void calculateTotalByTicketType() {
        double economyTotal = 0;
        double businessTotal = 0;

        for (DiepLthTicket ticket : tickets) {
            if (ticket instanceof DiepLthEconomyTicket) {
                economyTotal += ticket.getPrice();
            } else if (ticket instanceof DiepLthBusinessTicket) {
                businessTotal += ticket.getPrice();
            }
        }
        System.out.println("Total Revenue by Ticket Type:");
        System.out.println("Economy Tickets: $" + economyTotal);
        System.out.println("Business Tickets: $" + businessTotal);
    }

    public static void main(String[] arg){
        DiepLthTicketManagement ticketManagement = new DiepLthTicketManagement();
        DiepLthPassenger passenger1 = new DiepLthPassenger("Nguyễn Văn A", 1, "Nam Định", "0973811299");
        DiepLthPassenger passenger2 = new DiepLthPassenger("Nguyễn Văn B", 2, "Hà Nội","0982711233");
        DiepLthPassenger passenger3 = new DiepLthPassenger("Nguyễn Văn C", 3, "Vĩnh Phúc", "033899012");
        DiepLthBusinessTicket businessTicket1 = new DiepLthBusinessTicket("T001", 2000000, "A", LocalDate.of(2024, 12, 1), LocalTime.of(10, 30),
                LocalDate.of(2024, 12, 1), LocalTime.of(13, 45), passenger1, "Noodle", "3A", "VIP");
        DiepLthEconomyTicket economyTicket1 = new DiepLthEconomyTicket("E01", 1000000, "B", LocalDate.of(2024, 12, 03), LocalTime.of(12,30),LocalDate.of(2024,12,03),LocalTime.of(13,40),passenger2,"Rice", "4A");
        DiepLthBusinessTicket businessTicket2 = new DiepLthBusinessTicket("C01", 2500000, "A2", LocalDate.of(2024, 12, 2), LocalTime.of(10, 30),
                LocalDate.of(2024, 12, 2), LocalTime.of(13, 45), passenger3, "Noodle", "3A", "VIP");
        ticketManagement.addTicket(businessTicket1);
        ticketManagement.addTicket(economyTicket1);
        ticketManagement.addTicket(businessTicket2);
        ticketManagement.displayListTicket();
        ticketManagement.searchByTicketId("T001");
        ticketManagement.sortTicketsByArrivalDate();
        ticketManagement.sortTicketsByDepartureDate();
        ticketManagement.sortTicketsByPrice();
        ticketManagement.calculateTotalRevenue();
        ticketManagement.calculateTotalByTicketType();
    }
}
