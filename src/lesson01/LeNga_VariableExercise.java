//package lesson01;
//
///**
// * Các bạn sẽ phát triển code của các bạn ở đây, lưu ý mỗi người tạo 01 file và đặt tên theo rule
// * 1. Copy file này, và change name của file theo cú pháp sau: YourName_VariableExercise.java
// *  Ví dụ: Nguyễn Văn An -> NguyenVanAn_VariableExercise.java
// * 2. Truy cập file gitCommitMac.sh hoặc gitCommitWin.bat (Lựa chọn theo HĐH bạn đang sử dụng) và thêm thông tin commit của bạn.
// *   2.1 Tại dòng 8: Thay đường dẫn file của bạn tại [Your file Path] (Ví dụ: src/lesson01/NguyenVanAn_VariableExercise.java)
// *   2.2 Truy cập terminal có sử dụng IntelliJ IDEA: Vào View -> Tool Windows -> Terminal và thực thi dòng lệnh sau:
// *    - Trên Mac: sh gitCommitMac.sh
// *    - Trên Windows: gitCommitWin.bat
// *    2.3 Nếu gặp lỗi về quyền truy cập thì bạn cần cấp quyền cho file .sh hoặc .bat đó, mở terminal và thực thi lệnh sau:
// *    - Trên Mac: chmod +x gitCommitMac.sh
// *    - Trên Windows: Không cần thực thi lệnh này
// *  3. Sau khi thực thi xong, bạn sẽ thấy thông báo "Git commit successfully" trên terminal
// */
//public class LeNga_VariableExercise {
//    public static void main(String[] args) {
//        //region Bài 01
//        System.out.println("-----------------------------------Bài 1--------------------------------------");
//        // Khai báo các biến
//        int numberInt  = 8;
//        double numberDouble = 5.5;
//        char character = 'b';
//        boolean isFalse =false;
//        String string = "Hello, I'm here!";
//
//        //Thực hiện các phép toán
//        int sum = numberInt + 2;
//        double multip = numberDouble * sum;     // Testek: Chú ý chính tả biến, ví dụ: multiple
//        double division = multip / numberInt;
//
//        //Kết quả
//        System.out.println("Kết quả phép cộng là: "+sum);
//        System.out.println("Kết quả phép nhân là: " +multip);
//        System.out.println("Kết quả phép chia là: " +division);
//
//        System.out.println("Ký tự: " + character);
//        System.out.println("Giá trị boolean: " + isFalse);
//        System.out.println("chuỗi: " + string);
//        //endregion
//        System.out.println("\n");
//        //region Bài 02
//        System.out.println("-----------------------------------Bài 2--------------------------------------");
//        /* Implement your code here */
//        // Khai báo các biến
//        int numberInt1  = 8;
//        int numberInt2  = 5;
//        double numberDouble1 = 5.5;                     // Testek: Tên biến nên là firstNum
//        double numberDouble2 = 5.54;                    // Testek: Tên biến nên là secondNum
//        String string1 = "Hello,";
//        String string2 = "Nice to meet you!";
//        boolean flag1 = true;                           // Testek: Tên biến nên là firstFlag
//        boolean flag2 = false;                          // Testek: Tên biến nên là secondFlag
//
//        //So sánh với các số nguyên
//        System.out.printf("%n%d > %d: %b",numberInt1,numberInt2,numberInt1 > numberInt2);
//        System.out.printf("%n%d < %d: %b",numberInt1,numberInt2,numberInt1 < numberInt2);
//        System.out.printf("%n%d = %d: %b",numberInt1,numberInt2,numberInt1 == numberInt2);
//        System.out.printf("%n%d != %d: %b",numberInt1,numberInt2,numberInt1 != numberInt2);
//        System.out.printf("%n%d <= %d: %b",numberInt1,numberInt2,numberInt1 <= numberInt2);
//        System.out.printf("%n%d >= %d: %b%n",numberInt1,numberInt2,numberInt1 >= numberInt2);
//
//        //So sánh với các số thực
//        System.out.printf("%n%.2f > %.2f: %b",numberDouble1,numberDouble2,numberDouble1 > numberDouble2);
//        System.out.printf("%n%.2f < %.2f: %b",numberDouble1,numberDouble2,numberDouble1 < numberDouble2);
//        System.out.printf("%n%.2f = %.2f: %b",numberDouble1,numberDouble2,numberDouble1 == numberDouble2);
//        System.out.printf("%n%.2f != %.2f: %b",numberDouble1,numberDouble2,numberDouble1 != numberDouble2);
//        System.out.printf("%n%.2f <= %.2f: %b",numberDouble1,numberDouble2,numberDouble1 <= numberDouble2);
//        System.out.printf("%n%.2f >= %.2f: %b%n",numberDouble1,numberDouble2,numberDouble1 >= numberDouble2);
//
//        //Các phép toán logic
//        System.out.printf("%n%b && %b: %b",flag1,flag2,flag1 && flag2);
//        System.out.printf("%n%b || %b: %b",flag1,flag2,flag1 || flag2);
//        System.out.printf("%n!%b: %b%n",flag2,!flag2);
//
//        //Phép cộng chuỗi
//        System.out.printf("%n%s %s%n",string1,string2);
//        //endregion
//    }
//}
