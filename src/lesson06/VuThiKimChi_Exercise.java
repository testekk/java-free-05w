package lesson06;

import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class VuThiKimChi_Exercise {
    public static void main(String[] args) {
        VuThiKimChi_Exercise exercise = new VuThiKimChi_Exercise();
        exercise.calculateLoanInterest();
        exercise.findGCD();
        exercise.printShapes();
        exercise.convertDecimalToBinary();
    }

    //1. Bài 1: Xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.
    public void calculateLoanInterest() {
        System.out.println("\nBài 1: Xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cho vay: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Nhập tỉ lệ lãi suất theo tháng: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Nhập số tháng cho vay: ");
        int months = scanner.nextInt();
        // Implement your code here

        double interestAmount = loanAmount * interestRate / 12 * months;
        //double interestAmount = loanAmount * (interestRate/100) / 12 * months;
        double sum = interestAmount + loanAmount;
        DecimalFormat df = new DecimalFormat("#,###");
        String sumDf = df.format(sum);
        System.out.println("Tổng số tiền có được khi hết thời hạn cho vay: " + sumDf);
    }

    //2. Bài 2: Tìm UCLN của hai số nguyên.
    public void findGCD() {
        System.out.println("\nBài 2: Tìm UCLN của hai số nguyên.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
//        int a = 0;
//        int b = 5;

        if (a == 0 && b == 0) {
            System.out.println("a và b không có ƯCLN");
        } else {
            //Tính và in ra UCLN
            int gcd = ucln(a, b);
            System.out.println("ƯCLN của " + a + " và " + b + ": " + gcd);
        }
    }

    // Hàm tính UCLN bằng thuật toán Euclid
    private int ucln(int a, int b) {
        // Dùng vòng lặp để áp dụng thuật toán Euclid
        while (b != 0) {
            int tempt = b;
            b = a % b; // Cập nhật b bằng a % b
            a = tempt; // Cập nhật a bằng giá trị của b cũ
        }
        return (Math.abs(a)); // Khi b == 0, giá trị tuyệt đối của a chính là UCLN
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
        int side = scanner.nextInt();
        // Implement your code here
        for (int i = 0; i < side; i++) { //Vòng lặp ngoài hiển thị số dòng (chiều dài)
            for (int j = 0; j < side; j++) { //vòng lặp trong hiển thị số lượng * có trong mỗi dòng
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // In hình tam giác cân
    private void printIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // In hình tam giác vuông, có cạnh góc vuông ở top-left
    private void printTopLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
        for (int i = 0; i < height; i++) { //Vòng lặp ngoài hiển thị số dòng (chiều dài)
            for (int j = 0; j < (height - i); j++) { //Vòng lặp trong hiển thị số lượng * có trong mỗi dòng
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // In hình tam giác vuông, có cạnh góc vuông ở botton-left
    private void printBottomLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
        for (int i = 1; i <= height; i++) { //vòng lặp ngoài hiển thị số dòng(chiều dài)
            for (int j = 1; j <= i; j++) { //vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // In hình chữ nhật
    private void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int height = scanner.nextInt();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = scanner.nextInt();
        // Implement your code here
        for (int i = 1; i <= width; i++) { //vòng lặp ngoài hiển thị số dòng(chiều dài)
            for (int j = 1; j <= height; j++) { //vòng lặp trong hiển thị số cột(chiều rộng)
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Bài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2
    public void convertDecimalToBinary() {
        System.out.println("\nBài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();
        // Implement your code here
        // Kiểm tra trường hợp số nhập vào là 0
        if(number == 0){
            System.out.println("Số nhị phân là 0");
        }
        else{
            // Khởi tạo biến để chứa kết quả nhị phân
            StringBuilder binary = new StringBuilder();
            // Tiến hành chuyển đổi
            int num = number;
            while(num > 0){
                binary.insert(0, num % 2); // Lấy phần dư và thêm vào đầu chuỗi
                num /= 2; // Chia liên tiếp số cho 2
            }
            System.out.println("Số "+number+" chuyển sang hệ cơ số 2 là "+binary.toString());
        }
    }
}