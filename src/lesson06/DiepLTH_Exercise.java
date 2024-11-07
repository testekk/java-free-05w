package lesson06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiepLTH_Exercise {
    public static void main(String[] args) {
        DiepLTH_Exercise exercise = new DiepLTH_Exercise();
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
        double loanInterest;
        if (loanAmount>0 && interestRate > 0 && months>0){
            // Tính tiền nhận được
            loanInterest = loanAmount* interestRate/12 * months + loanAmount;
            // Làm tròn số
            loanInterest = Math.round(loanInterest/1000)*1000;
            System.out.print(loanInterest);
        }

    }

    //2. Bài 2: Tìm UCLN của hai số nguyên.
    public void findGCD() {
        System.out.println("\nBài 2: Tìm UCLN của hai số nguyên.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();
        // Implement your code here
        int gcd = 0;
        if (a==b) {
            gcd = a;
        } else if (a ==0 && b != 0) {
            gcd = b;
        } else if (a != 0 && b==0) {
            gcd = a;
        } else {
            int min = Math.min(a,b);
            for (int i = min; i>0; i--){
                if (((a%i) == 0) && ((b%i) == 0)){
                    gcd = i;
                    break;
                };
            }
        }
        System.out.println("UCLN của 2 số a và b là: " + gcd);
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
        for (int i = 1; i<= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    // In hình tam giác cân
    private void printIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
        for (int i =1; i <= height; i++){
            for (int j =1; j<= (height-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    // In hình tam giác vuông, có cạnh góc vuông ở top-left
    private void printTopLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
        for (int i=0; i<=height; i++){
            for (int j =1; j<=(height-i); j++){
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    // In hình tam giác vuông, có cạnh góc vuông ở botton-left
    private void printBottomLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
        for (int i=1; i<=height; i++){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\r\n");
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
        for (int i = 1; i<=height; i++){
            for (int j = 1; j<=width; j++){
                System.out.print("*");
            }
            System.out.print("\r\n");
        }
    }

    // Bài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2
    public void convertDecimalToBinary() {
        System.out.println("\nBài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();
        // Implement your code here
        String decimalToBinary = "";
        List<Integer> list = new ArrayList<>();
        if (number>0){
            while (number > 0) {
                list.add(number%2);
                number = number/2;
            }
            for (int element : list){
                decimalToBinary += Integer.toString(element);
            }
            System.out.print("Hệ cơ số 2 là: " + decimalToBinary);
        } else {
            System.out.print("Vui lòng nhập số nguyên dương");
        }
    }
}
