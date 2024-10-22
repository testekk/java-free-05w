package lesson03;

import javax.swing.*;
import java.util.Scanner;

public class AnhThai_ConditionExercise {
    public static void main(String[] args) {
        AnhThai_ConditionExercise exercise = new AnhThai_ConditionExercise();
        exercise.checkEvenOdd();
        exercise.checkPositiveNegative();
        exercise.checkVotingAge();
        exercise.gradeClassification();
        exercise.leapYearCheck();
        exercise.absoluteValue();
        exercise.electricityBill();
        exercise.quadraticEquation();
        exercise.bmiIndex();
        exercise.triangleCheck();
        exercise.monthConversion();
    }


    // Bài 1: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số chẵn hay số lẻ.
    public void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bài 1: Nhập một số nguyên: ");
        int number = scanner.nextInt();
        /* Implement your code here */
        if (number % 2 == 0){
            System.out.println("So ban nhap la so chan");
        }
        else
        {
            System.out.println("So ban nhap la so le");
        }
    }

    // Bài 2: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số dương hay số âm.
    public void checkPositiveNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bài 2: Nhập một số nguyên: ");
        int number = scanner.nextInt();
        /* Implement your code here */
        if (number > 0){
            System.out.println("So ban nhap la so duong");
        }
        else
        {
            System.out.println("So ban nhap la so am");
        }
    }

    // Bài 3: Kiểm Tra Tuổi: Viết một chương trình để nhập tuổi từ bàn phím và kiểm tra xem người đó có đủ tuổi bầu cử hay không (>= 18 tuổi).
    public void checkVotingAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bài 3: Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        /* Implement your code here */
        if (age >= 18){
            System.out.println("Ban da du tuoi de bau cu");
        }
        else
        {
            System.out.println("Ban chua du tuoi de bau cu");
        }
    }

    // Bài 4: Viết một chương trình để nhập điểm từ bàn phím và phân loại điểm theo các mức
    public void gradeClassification() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bài 4: Nhập điểm của bạn: ");
        int score = scanner.nextInt();
        /* Implement your code here */
        if (score <= 5)
        {
            System.out.println("Ban la hoc sinh yeu");
        }
        else if (score > 5 && score <= 7)
        {
            System.out.println("Ban la hoc sinh trung binh");
        }
        else if (score > 7 && score <= 8)
        {
            System.out.println("Ban la hoc sinh kha");
        }
        else if (score > 8 && score <= 10)
        {
            System.out.println("Ban la hoc sinh gioi");
        }
        else
        {
            System.out.println("Diem ban nhap khong hop le");
        }

    }

    // Bài 5: Viết chương trình kiểm tra năm nhuận
    public void leapYearCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một năm: ");
        int year = scanner.nextInt();
        /* Implement your code here */
    }

    // Bài 6: Tính Giá Trị Tuyệt Đối
    public void absoluteValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        /* Implement your code here */
    }

    // Bài 7: Tính Tiền Điện với số điện sử dụng và theo quy tắc sau:
    // - 50 số đầu: 1000 VND/số
    // - 50 số tiếp theo: 1200 VND/số
    // - 100 số tiếp theo: 1500 VND/số
    // - Còn lại: 2000 VND/số
    public void electricityBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện sử dụng (kWh): ");
        int electricity = scanner.nextInt();
        /* Implement your code here */
    }

    // Bài 8: Giải phương trình bậc 2 ax^2 + bx + c = 0 với a, b, c nhập từ bàn phím.
    public void quadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a (khác 0): ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        /* Implement your code here */
    }

    //Bài 9: Tính chỉ số BMI (Body Mass Index) với cân nặng (kg) và chiều cao (m) nhập từ bàn phím.
    public void bmiIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        /* Implement your code here */
    }

    // Bài 10: Kiểm tra tam giác với ba cạnh a, b, c nhập từ bàn phím.
    public void triangleCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        /* Implement your code here */
    }


    // Bài 11: Chuyển đổi tháng trong năm từ số nguyên 1-12 sang tên tháng tương ứng
    public void monthConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1-12: ");
        int month = scanner.nextInt();
        // Implement your code here
    }
}
