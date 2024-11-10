package lesson06;

import java.util.Scanner;

public class CuongNB_Exercise {

    public static void main(String[] args) {
        CuongNB_Exercise exercise = new CuongNB_Exercise();
        exercise.calculateLoanInterest();
        exercise.findGCD();
        exercise.printShapes();
        exercise.convertDecimalToBinary();
    }

    // 1. Bài 1: Xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.
    public void calculateLoanInterest() {
        System.out.println("\nBài 1: Xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cho vay: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Nhập tỉ lệ lãi suất theo tháng (ví dụ: 0.05 cho 5%): ");
        double monthlyInterestRate = scanner.nextDouble(); // Đặt lại tên biến
        System.out.print("Nhập số tháng cho vay: ");
        int months = scanner.nextInt();

        // Tính lãi suất và tổng số tiền phải trả
        double totalInterest = loanAmount * monthlyInterestRate * months;
        double totalPayment = loanAmount + totalInterest;
        System.out.println("Tổng số tiền lãi: " + totalInterest);
        System.out.println("Tổng số tiền phải trả: " + totalPayment);
    }

    // 2. Bài 2: Tìm UCLN của hai số nguyên.
    public void findGCD() {
        System.out.println("\nBài 2: Tìm UCLN của hai số nguyên.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        // Tính UCLN
        int gcd = calculateGCD(a, b);
        System.out.println("UCLN của " + a + " và " + b + " là: " + gcd);
    }

    private int calculateGCD(int a, int b) {
        // Sử dụng thuật toán Euclid để tìm UCLN
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);  // Đảm bảo kết quả là số dương
    }

    // 3. In ra các hình theo yêu cầu của người dùng.
    public void printShapes() {
        System.out.println("\nBài 3: In ra các hình theo yêu cầu của người dùng.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn hình bạn muốn in: ");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. Hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("4. Hình tam giác cân");
        System.out.println("5. Hình vuông");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                printRectangle();
                break;
            case 2:
                printBottomLeftTriangle();
                break;
            case 3:
                printTopLeftTriangle();
                break;
            case 4:
                printIsoscelesTriangle();
                break;
            case 5:
                printSquare();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    // In hình vuông
    private void printSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài cạnh của hình vuông: ");
        int side = scanner.nextInt(); // Khai báo biến side
        // In hình vuông
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // In hình tam giác cân
    private void printIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt(); // Khai báo biến height
        // In hình tam giác cân
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // In hình tam giác vuông, có cạnh góc vuông ở top-left
    private void printTopLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt(); // Khai báo biến height
        // In hình tam giác
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // In hình tam giác vuông, có cạnh góc vuông ở botton-left
    private void printBottomLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt(); // Khai báo biến height
        // In hình tam giác
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // In hình chữ nhật
    private void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int height = scanner.nextInt(); // Khai báo biến height
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = scanner.nextInt(); // Khai báo biến width
        // In hình chữ nhật
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) { // Sửa biến length thành width
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Bài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2
    public void convertDecimalToBinary() {
        System.out.println("\nBài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt(); // Khai báo biến number

        String binary = "";
        int num = number;

        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println("Số " + number + " trong hệ cơ số 2 là: " + binary);
    }
}
