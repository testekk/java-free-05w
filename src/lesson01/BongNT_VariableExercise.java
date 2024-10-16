package lesson01;

/**
 * Các bạn sẽ phát triển code của các bạn ở đây, lưu ý mỗi người tạo 01 file và đặt tên theo rule
 * 1. Copy file này, và change name của file theo cú pháp sau: YourName_VariableExercise.java
 *  Ví dụ: Nguyễn Văn An -> NguyenVanAn_VariableExercise.java
 * 2. Truy cập file gitCommitMac.sh hoặc gitCommitWin.bat (Lựa chọn theo HĐH bạn đang sử dụng) và thêm thông tin commit của bạn.
 *   2.1 Tại dòng 8: Thay đường dẫn file của bạn tại [Your file Path] (Ví dụ: src/lesson01/NguyenVanAn_VariableExercise.java)
 *   2.2 Truy cập terminal có sử dụng IntelliJ IDEA: Vào View -> Tool Windows -> Terminal và thực thi dòng lệnh sau:
 *    - Trên Mac: sh gitCommitMac.sh
 *    - Trên Windows: gitCommitWin.bat
 *    2.3 Nếu gặp lỗi về quyền truy cập thì bạn cần cấp quyền cho file .sh hoặc .bat đó, mở terminal và thực thi lệnh sau:
 *    - Trên Mac: chmod +x gitCommitMac.sh
 *    - Trên Windows: Không cần thực thi lệnh này
 *  3. Sau khi thực thi xong, bạn sẽ thấy thông báo "Git commit successfully" trên terminal
 */
public class BongNT_VariableExercise {
    public static void main(String[] args) {

                //region Bài 01
        /* Implement your code here */
        /*Khai báo các biến kiểu int, double, char, boolean, và String.*/
        int myNum;
        double myDoubleNum;
        char myChar;
        boolean myBoolean;
        String myString;

        /*Khởi tạo các biến với các giá trị cụ thể.*/
        myNum = 10;
        myDoubleNum = 16.10;
        myChar = 'A';
        myBoolean = true;
        myString = "Testekk";

        /*   Thực hiện các phép toán cộng, trừ, nhân, chia với các biến số nguyên và số thực.*/
        int a = 10 + 5;
        int b = 10 - 5;
        int c = 10 * 5;
        int d = 10 / 5;
        double e = 10.01 + 5.01;
        double f = 10.01 - 5.01;
        double g = 10.01 * 5.01;
        double h = 10.01 / 5.01;

        /*In kết quả của các phép toán ra màn hình.*/
        System.out.println("Phép toán cộng biến số nguyên: " + a);
        System.out.println("Phép toán trừ biến số nguyên: " + b);
        System.out.println("Phép toán nhân biến số nguyên: " + c);
        System.out.println("Phép toán chia biến số nguyên: " + d);
        System.out.println("Phép toán cộng biến số thực: " + e);
        System.out.println("Phép toán trừ biến số thực: " + f);
        System.out.println("Phép toán nhân biến số thực: " + g);
        System.out.println("Phép toán chia biến số thực: " + h);

        /*In giá trị của các biến kiểu char, boolean, và String.*/
        System.out.println("In giá trị kiểu char: " + myChar);
        System.out.println("In giá trị kiểu boolean: " + myBoolean);
        System.out.println("In giá trị kiểu String: " + myString);

        //endregion

        //region Bài 02
        /* Implement your code here */


        //endregion
    }
}
