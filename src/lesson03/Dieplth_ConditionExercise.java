package lesson03;

import java.util.Scanner;

public class Dieplth_ConditionExercise {
    public static void main(String[] args) {
        Dieplth_ConditionExercise exercise = new Dieplth_ConditionExercise();
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
        /* Implement your code here */
        if (number%2 == 0) {
            System.out.println("Số chẵn");
        } else {
            System.out.println(("Số lẻ"));
        };

    }

    // Bài 2: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số dương hay số âm.
    public void checkPositiveNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        /* Implement your code here */
        if (number > 0) {
            System.out.println("Số dương");
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Số 0");
        };
    }

    // Bài 3: Kiểm Tra Tuổi: Viết một chương trình để nhập tuổi từ bàn phím và kiểm tra xem người đó có đủ tuổi bầu cử hay không (>= 18 tuổi).
    public void checkVotingAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        /* Implement your code here */
        if((age >= 16)&&(age<=18)) {
            System.out.println("Bạn sắp đủ tuổi bầu cử");
        } else if (age >= 18) {
            System.out.println("Bạn đã đủ tuổi bầu cử");
        } else if ((age >=0)&&(age < 16)) {
            System.out.println("Bạn chưa đủ tuổi bầu cử");
        } else {
            System.out.println("Vui lòng nhập số tuổi hợp lệ");
        }
    }

    // Bài 4: Viết một chương trình để nhập điểm từ bàn phím và phân loại điểm theo các mức
    public void gradeClassification() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm của bạn: ");
        int score = scanner.nextInt();
        /* Implement your code here */
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

    // Bài 5: Viết chương trình kiểm tra năm nhuận
    public void leapYearCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một năm: ");
        int year = scanner.nextInt();
        /* Implement your code here */
        if (((year%4 == 0)&&(year%100 != 0))||(year%400 == 0)) {
            System.out.println("Năm nhuận");
        } else {
            System.out.println("Năm không nhuận");
        }
    }

    // Bài 6: Tính Giá Trị Tuyệt Đối
    public void absoluteValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        /* Implement your code here */
        if (number >= 0) {
            System.out.println("Giá trị tuyệt đối của số vừa nhập là: " + number);
        } else {
            System.out.println("Giá trị tuyệt đối của số vừa nhập là: " + number*(-1));
        };
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
        if (electricity <= 50) {
            System.out.println("Số tiền điện là: " + electricity*1000 + "VND");
        } else if (electricity <= 100) {
            System.out.println("Số tiền điện là: " + ((electricity-50)*1200 + 50000) + "VND");
        } else if (electricity <= 200) {
            System.out.println("Số tiền điện là: " + ((electricity-100)*1500 + 110000) + "VND");
        } else {
            System.out.println("Số tiền điện là: " + ((electricity - 200) *2000 + 260000) + "VND");
        };
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
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if (delta > 0
        ) {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
           System.out.println("Phương trình có 2 nghiệm phân biệt: " + x1 + ", " + x2);
        } else if (delta == 0) {
            System.out.println("Phuơng trình có nghiệm kép: " + (-b/(2*a)));
        } else {
            System.out.println("Phương trình vô nghiệm");
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
        /* Implement your code here */
        if(bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi < 24.9) {
            System.out.println("Bình thường");
        } else if (bmi < 29.9) {
            System.out.println("Hơi béo");
        } else {
            System.out.println("Béo phì");
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
        /* Implement your code here */
        if ((a+b>c) && (a+c>b) && (b+c > a)){
            System.out.println("Ba cạnh là ba cạnh của tam giác");
        } else {
            System.out.println("Không phải tam giác");
        }
    }


    // Bài 11: Chuyển đổi tháng trong năm từ số nguyên 1-12 sang tên tháng tương ứng
    public void monthConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1-12: ");
        int month = scanner.nextInt();
        String monthName;
        // Implement your code here
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "Match";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid Month";
        }
        System.out.println(monthName);
    }
}
