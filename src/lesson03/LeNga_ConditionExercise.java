package lesson03;

import java.util.Scanner;

public class LeNga_ConditionExercise {
    public static void main(String[] args) {
        LeNga_ConditionExercise exercise = new LeNga_ConditionExercise();
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
        String result = (number % 2 ==0) ? "Số vừa nhập là số chẵn": "Số vừa nhập là số lẻ";
        System.out.println(result);
    }

    // Bài 2: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số dương hay số âm.
    public void checkPositiveNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if(number>0){
            System.out.println("Số vừa nhập là số dương");
        }else if (number <0){
            System.out.println("Số vừa nhập là số âm");
        }else {
            System.out.println("Số vừa nhập là số 0");
        }
    }

    // Bài 3: Kiểm Tra Tuổi: Viết một chương trình để nhập tuổi từ bàn phím và kiểm tra xem người đó có đủ tuổi bầu cử hay không (>= 18 tuổi).
    public void checkVotingAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        String result = (age >= 18) ? "Bạn đủ điều kiện để bầu cử": "Bạn chưa đủ điều kiện để bầu cử";
        System.out.println(result);
    }

    // Bài 4: Viết một chương trình để nhập điểm từ bàn phím và phân loại điểm theo các mức
    public void gradeClassification() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm của bạn: ");
        int score = scanner.nextInt();
        if (score>=90){
            System.out.println("Xếp hạng: A");
        }else if (score>=80){
            System.out.println("Xếp hạng: B");
        }else if (score>=70){
            System.out.println("Xếp hạng: C");
        }else if (score>=60){
            System.out.println("Xếp hạng: D");
        }else {
            System.out.println("Xếp hạng: F");
        }
    }

    // Bài 5: Viết chương trình kiểm tra năm nhuận
    public void leapYearCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một năm: ");
        int year = scanner.nextInt();
        String result = ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0 ) ?
                "Năm bạn vừa nhập là năm nhuận": "Năm bạn vừa nhập không phải là năm nhuận";
        System.out.println(result);
    }

    // Bài 6: Tính Giá Trị Tuyệt Đối
    public void absoluteValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        int absoluteNumber = (number<0)? -number : number;
        System.out.println("Giá trị tuyệt đối số vừa nhập là: "+absoluteNumber);
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
        int bill =0;
        if (electricity <= 50){
            bill = electricity *1000;
        }else if (electricity<=100){
            bill = electricity *1200;
        }else if (electricity<=200){
            bill = electricity *1500;
        }else {
            bill = electricity *2000;
        }
        System.out.println(" Số tiền điện bạn phải trả là: "+bill);
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

        if (a != 0) {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");

                System.out.println("x1 = " + x1);
                System.out.println("x2 =" + x2);
            }
        } else {
            System.out.println("Không phải phương trình bậc hai.");
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
            System.out.println("Bạn đang bị thiếu cân.");
        } else if (bmi < 25) {
            System.out.println("Bạn có cân nặng bình thường.");
        } else if (bmi < 30) {
            System.out.println("Bạn đang thừa cân.");
        } else {
            System.out.println("Bạn đang bị béo phì.");
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
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            if (a==b && b==c){
                System.out.println("Ba cạnh tạo thành tam giác đều");
            }else if (a == b || a == c || b == c){
                System.out.println("Ba cạnh tạo thnahf tam giác cân");
            }else if (a*a + b*b == c*c|| a*a + c*c == b*b || b*b + c*c == a*a){
                System.out.println("Ba cạn tạo thành tam giác vuông");
            }else {
                System.out.println("Ba cạnh tạo thành tam giác thường");
            }
        }else {
            System.out.println("Ba cạnh không tạo thành một tam giác.");
        }
    }


    // Bài 11: Chuyển đổi tháng trong năm từ số nguyên 1-12 sang tên tháng tương ứng
    public void monthConversion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1-12: ");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("Tháng một");
                break;
            case 2:
                System.out.println("Tháng hai");
                break;
            case 3:
                System.out.println("Tháng ba");
                break;
            case 4:
                System.out.println("Tháng bốn");
                break;
            case 5:
                System.out.println("Tháng năm");
                break;
            case 6:
                System.out.println("Tháng sáu");
                break;
            case 7:
                System.out.println("Tháng bảy");
                break;
            case 8:
                System.out.println("Tháng tám");
                break;
            case 9:
                System.out.println("Tháng chín");
                break;
            case 10:
                System.out.println("Tháng mười");
                break;
            case 11:
                System.out.println("Tháng mười một");
                break;
            case 12:
                System.out.println("Tháng mười hai");
                break;
            default:
                System.out.println("Tháng bạn nhập không hợp lệ");
                break;
        }
    }
}
