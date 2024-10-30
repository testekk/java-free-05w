package lesson03;

import java.util.Scanner;

public class TestekConditionExercise {
    public static void main(String[] args) {
        TestekConditionExercise exercise = new TestekConditionExercise();
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
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }

    // Bài 2: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số dương hay số âm.
    public void checkPositiveNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " là số dương.");
        } else if (number < 0) {
            System.out.println(number + " là số âm.");
        } else {
            System.out.println(number + " không phải số dương cũng không phải số âm.");
        }
    }

    // Bài 3: Kiểm Tra Tuổi: Viết một chương trình để nhập tuổi từ bàn phím và kiểm tra xem người đó có đủ tuổi bầu cử hay không (>= 18 tuổi).
    public void checkVotingAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Bạn đủ tuổi bầu cử.");
        } else {
            System.out.println("Bạn chưa đủ tuổi bầu cử.");
        }
    }

    // Bài 4: Viết một chương trình để nhập điểm từ bàn phím và phân loại điểm theo các mức
    public void gradeClassification() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm của bạn: ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("Hạng A");
        } else if (score >= 80) {
            System.out.println("Hạng B");
        } else if (score >= 70) {
            System.out.println("Hạng C");
        } else if (score >= 60) {
            System.out.println("Hạng D");
        } else {
            System.out.println("Hạng F");
        }
    }

    // Bài 5: Viết chương trình kiểm tra năm nhuận
    public void leapYearCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một năm: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
    }

    // Bài 6: Tính Giá Trị Tuyệt Đối
    public void absoluteValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        int absoluteValue = (number >= 0) ? number : -number;
        System.out.println("Giá trị tuyệt đối của " + number + " là: " + absoluteValue);
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
        int bill = 0;
        if (electricity <= 50) {
            bill = electricity * 1000;
        } else if (electricity <= 100) {
            bill = 50 * 1000 + (electricity - 50) * 1200;
        } else if (electricity <= 200) {
            bill = 50 * 1000 + 50 * 1200 + (electricity - 100) * 1500;
        } else {
            bill = 50 * 1000 + 50 * 1200 + 100 * 1500 + (electricity - 200) * 2000;
        }
        System.out.println("Số tiền điện phải trả là: " + bill + " VND");
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
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm ph��n biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    //Bài 9: Tính chỉ số BMI (Body Mass Index) với cân nặng (kg) và chiều cao (m) nhập từ bàn phím.
    public void bmiIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cân nặng (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Chỉ số BMI của bạn là: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Bạn đang gầy.");
        } else if (bmi < 24.9) {
            System.out.println("Bạn đang bình thường.");
        } else if (bmi < 29.9) {
            System.out.println("Bạn đang hơi béo");
        } else {
            System.out.println("Bạn đang béo phì");
        }
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
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân.");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh a, b, c không phải là cạnh của một tam giác.");
        }
    }

    // Bài 11: Chuyển đổi tháng trong năm từ số nguyên 1-12 sang tên tháng tương ứng
    public void monthConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1-12: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("Tháng 1: Tháng Một");
                break;
            case 2:
                System.out.println("Tháng 2: Tháng Hai");
                break;
            case 3:
                System.out.println("Tháng 3: Tháng Ba");
                break;
            case 4:
                System.out.println("Tháng 4: Tháng Bốn");
                break;
            case 5:
                System.out.println("Tháng 5: Tháng Năm");
                break;
            case 6:
                System.out.println("Tháng 6: Tháng Sáu");
                break;
            case 7:
                System.out.println("Tháng 7: Tháng Bảy");
                break;
            case 8:
                System.out.println("Tháng 8: Tháng Tám");
                break;
            case 9:
                System.out.println("Tháng 9: Tháng Chín");
                break;
            case 10:
                System.out.println("Tháng 10: Tháng Mười");
                break;
            case 11:
                System.out.println("Tháng 11: Tháng Mười Một");
                break;
            case 12:
                System.out.println("Tháng 12: Tháng Mười Hai");
                break;
            default:
                System.out.println("Số bạn nhập không phải là một tháng trong năm.");
        }
    }
}