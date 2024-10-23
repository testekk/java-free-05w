package lesson03;

import java.util.Scanner;

public class VuThiKimChi_ConditionExercise {
    public static void main(String[] args) {
        //Bài 1: Kiểm Tra Số Chẵn Lẻ Viết một chương trình để nhập một số nguyên từ bàn phím và kiểm tra xem số đó là số chẵn hay số lẻ.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int soNguyen = sc.nextInt();

        if (soNguyen % 2 == 0) {
            System.out.println(soNguyen + " là số chẵn");
        } else {
            System.out.println(soNguyen + " là số lẻ");
        }

        //Bài 2: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số dương hay số âm.
        if (soNguyen >= 0) {
            System.out.println(soNguyen + " là số dương");
        } else {
            System.out.println(soNguyen + " là số âm");
        }

        //Bài 3: Kiểm Tra Tuổi Viết một chương trình để nhập tuổi từ bàn phím và kiểm tra xem người đó có đủ tuổi bầu cử hay không (>= 18 tuổi).
        System.out.print("\n" + "Nhập tuổi của bạn: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Bạn đủ tuổi bầu cử");
        } else {
            System.out.println("Bạn không đủ tuổi bầu cử");
        }

        //Bài 4: Phân Loại Điểm Viết một chương trình để nhập điểm từ bàn phím và phân loại điểm theo các mức: A (>= 90), B (>= 80), C (>= 70), D (>= 60), F (< 60).
        System.out.print("\n" + "Nhập điểm số: ");
        float score = sc.nextFloat();
        String rating;

        if (score >= 90) {
            rating = "A";
        } else if (score >= 80 && score < 90) {
            rating = "B";
        } else if (score >= 70 && score < 80) {
            rating = "C";
        } else if (score >= 60 && score < 70) {
            rating = "D";
        } else {
            rating = "F";
        }
        System.out.println(String.format("Điểm của bạn là: %f, xếp loại: %s", score, rating));

        //Bài 5: Kiểm Tra Năm Nhuận Viết một chương trình để nhập một năm từ bàn phím và kiểm tra xem năm đó có phải là năm nhuận hay không.
        System.out.print("\n" + "Nhập năm: ");
        int year = sc.nextInt();
        boolean isLeapYear;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            isLeapYear = false;
            System.out.println("Năm " + year + " không phải là năm nhuận");
        }

//       HOẶC
//
//       boolean isLeapYear = false;
//
//       if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//           isLeapYear = true;
//       }
//
//       if(isLeapYear){
//           System.out.println("Năm "+year+" là năm nhuận");
//       }
//       else {
//           System.out.println("Năm "+year+" không phải là năm nhuận");
//       }

        //Bài 6: Tính Giá Trị Tuyệt Đối Viết một chương trình để nhập một số nguyên từ bàn phím và tính giá trị tuyệt đối của số đó.
        int absoluteValue = Math.abs(soNguyen);

        if (soNguyen >= 0) {
            System.out.println("\n" + "Giá trị tuyệt đối của " + soNguyen + " là " + soNguyen);
        } else {
            System.out.println("\n" + "Giá trị tuyệt đối của " + soNguyen + " là " + absoluteValue);
        }

//      Bài 7: Tính Tiền Điện với số điện sử dụng và theo quy tắc sau:
//      50 số đầu: 1000 VND/số
//      50 số tiếp theo: 1200 VND/số
//      100 số tiếp theo: 1500 VND/số
//      Còn lại: 2000 VND/số

        System.out.print("\n" + "Nhập số điện nhà bạn: ");
        float soDien = sc.nextFloat();
        float tienDien;
        if (soDien <= 50) {
            tienDien = 50 * 1000;
        } else if (soDien > 50 && soDien <= 100) {
            tienDien = (50 * 1000) + (soDien - 50) * 1200;
        } else if (soDien > 100 && soDien <= 200) {
            tienDien = 50 * 1000 + 50 * 1200 + (soDien - 50 - 50) * 1500;
        } else {
            tienDien = 50 * 1000 + 50 * 1200 + 100 * 1500 + (soDien - 200) * 2000;
        }
        System.out.println("Số điện nhà bạn là: " + soDien + " và tiền điện của gia đình bạn là: " + tienDien);

        //Bài 8: Giải phương trình bậc 2 ax^2 + bx + c = 0 với a, b, c nhập từ bàn phím.
        System.out.print("\n"+"Nhập hệ số a: ");
        float a = sc.nextFloat();
        System.out.print("Nhập hệ số b: ");
        float b = sc.nextFloat();
        System.out.print("Nhập hằng số c: ");
        float c = sc.nextFloat();

        System.out.println("Giả sử x1, x2 là nghiệm của phương trình => ax1^2 + bx + c = 0");
        double x1, x2;
        double delta = Math.pow(b, 2) - 4*a*c;
        if(delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = "+ x1 +" và x2= "+ x2);
        }
        else if(delta == 0) {
            x1 = x2 = (-b) / (2*a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 bằng "+ x1);
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }

        //Bài 9: Tính chỉ số BMI (Body Mass Index) với cân nặng (kg) và chiều cao (m) nhập từ bàn phím.
        System.out.print("\n"+"Nhập vào chiều cao của bạn: ");
        float height = sc.nextFloat();

        System.out.print("Nhập vào cân nặng của bạn: ");
        float weight = sc.nextFloat();

        double BMI = weight/Math.pow(height, 2);
        String message;

        if(BMI < 18.5){
            message = "Gầy";
        }
        else if(BMI >= 18.5 && BMI <= 24.9){
            message = "Bình thường";
        }
        else if(BMI > 24.9 && BMI <= 29.9){
            message = "Thừa cân";
        }
        else{
            message = "Béo phì";
        }
        System.out.println(String.format("Chiều cao: "+height+" cân nặng: "+weight+" Chỉ số BMI của bạn là: "+BMI+" => "+message));

        //Bài 10: Kiểm tra tam giác với ba cạnh a1, b1, c1 nhập từ bàn phím.
        System.out.print("\n"+"Nhập cạnh a: ");
        float a1 = sc.nextFloat();
        System.out.print("Nhập cạnh b: ");
        float b1 = sc.nextFloat();
        System.out.print("Nhập cạnh b: ");
        float c1 = sc.nextFloat();
        if(a + b > c && a + c > b && c + b > a) {
            System.out.println("Đây là tam giác");
        }
        else {
            System.out.println("Đây không phải tam giác");
        }

        //Bài 11: Chuyển đổi tháng trong năm từ số nguyên 1-12 sang tên tháng tương ứng.
        System.out.print("\n"+"Nhập tháng: ");
        int month = sc.nextInt();
        String monthName;

        switch(month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Febuary";
                break;
            case 3:
                monthName = "March";
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
                monthName = "Invalid";
        }
        System.out.println("Tên của tháng "+month+" là "+monthName);
    }
}

