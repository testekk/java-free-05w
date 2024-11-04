package lesson06;

import java.util.Scanner;

public class YourName_Exercise {
    public static void main(String[] args) {
        TestekExercise exercise = new TestekExercise();
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
    }

    // In hình tam giác cân
    private void printIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
    }

    // In hình tam giác vuông, có cạnh góc vuông ở top-left
    private void printTopLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
    }

    // In hình tam giác vuông, có cạnh góc vuông ở botton-left
    private void printBottomLeftTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt();
        // Implement your code here
    }

    // In hình chữ nhật
    private void printRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int height = scanner.nextInt();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int width = scanner.nextInt();
        // Implement your code here
    }

    // Bài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2
    public void convertDecimalToBinary() {
        System.out.println("\nBài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();
        // Implement your code here
    }
}
