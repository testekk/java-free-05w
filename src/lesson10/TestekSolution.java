package lesson10;

import java.util.ArrayList;
import java.util.List;

public class TestekSolution {
    List<TestekTicket> tickets = new ArrayList<>();

    public static void main(String[] args) {
        TestekSolution testekSolution = new TestekSolution();
        testekSolution.buyTicket();
        testekSolution.displayTicket();
        String id = "003";
        testekSolution.searchTicket(id);
        testekSolution.sortByPrice();
        testekSolution.sortByDepartureDate();
        testekSolution.sortByArrivalDate();
        testekSolution.priceTotal();
        testekSolution.prices();
        testekSolution.pricesPassenger("001");
    }

    // 2. Tạo danh sách các vé máy bay.
    private void buyTicket() {
        TestekPassenger nvA = new TestekPassenger("001", "Nguyen Van A", "Ha Noi", "0123456789");
        TestekPassenger nvB = new TestekPassenger("002", "Nguyen Van B", "Ha Noi", "0123456789");
        TestekPassenger nvC = new TestekPassenger("003", "Nguyen Van C", "Ha Noi", "0123456789");
        TestekPassenger nvD = new TestekPassenger("004", "Nguyen Van D", "Ha Noi", "0123456789");

        TestekTicket aEconomic01 = new TestekEconomyTicket("001", 300, "VN001", "01/01/2021", "08:00", "01/01/2021", "10:00", nvA, "Seat 1");
        TestekTicket aBusiness02 = new TestekBusinessTicket("002", 200, "VN002", "02/01/2021", "08:00", "02/01/2021", "10:00", nvA, "Meal 2", "Seat 2", "Lounge 2");
        TestekTicket aBusiness03 = new TestekBusinessTicket("003", 300, "VN003", "03/01/2021", "08:00", "03/01/2021", "10:00", nvA, "Meal 3", "Seat 3", "Lounge 3");
        TestekTicket aEconomic04 = new TestekEconomyTicket("004", 400, "VN004", "04/01/2021", "08:00", "04/01/2021", "10:00", nvA, "Seat 4");
        TestekTicket bEconomic01 = new TestekEconomyTicket("004", 200, "VN004", "04/01/2021", "08:00", "04/01/2021", "10:00", nvB, "Seat 8");
        TestekTicket bBusiness02 = new TestekBusinessTicket("005", 200, "VN005", "05/01/2021", "08:00", "05/01/2021", "10:00", nvB, "Meal 5", "Seat 5", "Lounge 5");
        TestekTicket bBusiness03 = new TestekBusinessTicket("006", 300, "VN006", "06/01/2021", "08:00", "06/01/2021", "10:00", nvB, "Meal 6", "Seat 6", "Lounge 6");
        TestekTicket bEconomic04 = new TestekEconomyTicket("007", 400, "VN007", "07/01/2021", "08:00", "07/01/2021", "10:00", nvB, "Seat 7");

        addTicket(aEconomic01);
        addTicket(aBusiness02);
        addTicket(aBusiness03);
        addTicket(aEconomic04);
        addTicket(bEconomic01);
        addTicket(bBusiness02);
        addTicket(bBusiness03);
        addTicket(bEconomic04);
    }

    // Tính tổng tiền của tất cả các vé.
    private void priceTotal() {
        double sum = 0;
        for (TestekTicket ticket : tickets) {
            sum += ticket.getPrice();
        }
        System.out.println("Tổng giá vé: " + sum);
    }

    // 9. Tính tổng tiền của tất cả các vé máy bay.
    private void prices() {
        double sum = 0;
        double sumBusiness = 0;
        double sumEconomy = 0;
        for (TestekTicket ticket : tickets) {
            sum += ticket.getPrice();
            if (ticket instanceof TestekBusinessTicket) {
                sumBusiness += ticket.getPrice();
            } else if (ticket instanceof TestekEconomyTicket) {
                sumEconomy += ticket.getPrice();
            }
        }
        System.out.println("Tổng giá vé: " + sum);
        System.out.println("Tổng giá vé Business: " + sumBusiness);
        System.out.println("Tổng giá vé Economy: " + sumEconomy);
    }

    // 10. Tính tổng tiền của khách và theo từng loại vé.
    private void pricesPassenger(String id) {
        double sum = 0;
        double sumBusiness = 0;
        double sumEconomy = 0;
        for (TestekTicket ticket : tickets) {
            sum += ticket.getPrice();
            if (ticket.getPassenger().getId().equals(id)) {
                if (ticket instanceof TestekBusinessTicket) {
                    sumBusiness += ticket.getPrice();
                } else if (ticket instanceof TestekEconomyTicket) {
                    sumEconomy += ticket.getPrice();
                }
            }
        }
        System.out.println(String.format("Tổng giá vé của id (%s): %s", id, sum));
        System.out.println(String.format("Tổng giá vé Business của id (%s): %s", id, sumBusiness));
        System.out.println(String.format("Tổng giá vé Economy của id (%s): %s", id, sumEconomy));
    }

    // 6. Sắp xếp vé máy bay theo giá vé tăng dần.
    private void sortByArrivalDate() {
        System.out.println("\nSắp xếp vé máy bay theo ngày đến tăng dần:");
        tickets.sort((o1, o2) -> o1.getArrivalDate().compareTo(o2.getArrivalDate()));
        displayTicket();
    }

    // 7. Sắp xếp vé máy bay theo ngày khởi hành tăng dần.
    private void sortByDepartureDate() {
        System.out.println("\nSắp xếp vé máy bay theo ngày khởi hành tăng dần:");
        tickets.sort((o1, o2) -> o1.getDepartureDate().compareTo(o2.getDepartureDate()));
        displayTicket();
    }

    // 8. Sắp xếp vé máy bay theo giá vé tăng dần.
    private void sortByPrice() {
        System.out.println("\nSắp xếp vé máy bay theo giá vé tăng dần:");
        tickets.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        displayTicket();
    }

    // 5. Tìm kiếm vé máy bay theo mã vé.
    private TestekTicket searchTicket(String id) {
        System.out.println("\nTìm kiếm vé máy bay theo mã vé: " + id);
        for (TestekTicket ticket : tickets) {
            if (ticket.getId().equals(id)) {
                System.out.println(ticket);
                return ticket;
            }
        }
        return null;
    }

    // 3. Thêm vé máy bay.
    private void addTicket(TestekTicket ticket) {
        tickets.add(ticket);
    }

    // 4. Hiển thị danh sách vé máy bay.
    private void displayTicket() {
        System.out.println("\nDanh sách vé máy bay:");
        for (TestekTicket ticket : tickets) {
            System.out.println("\t" + ticket);
        }
    }
}