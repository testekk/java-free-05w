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
///*
// * Review: Testek: Bạn đã hoàn thành bài tập rất tốt, code sạch, dễ đọc, đúng yêu cầu.
// * Bài 01: Khai báo và khởi tạo các biến: chưa thực hiện đầy đủ yêu cầu
// * Bài 02: Chưa thực hiện các phép toán logic với các biến boolean
// * Bạn có thể tham khảo cách viết comment ở các bài tập khác để cải thiện comment của mình.
// */
//
//public class Diep_VariableExercise {
//    public static void main(String[] args) {
//        //region Bài 01
//        /* Implement your code here */
//        int age = 29;
//        double yearTester = 6.5;
//        char a = 'A';                   // Testek: Đặt tên cần có ý nghĩa hơn, ví dụ: grade
//        boolean isValidate = true;
//        String me = "Tôi tên là Lê Thị Hồng Diệp.";
//        double result = age - yearTester;
//        System.out.println(me + "Năm nay tôi " + age + " tuổi. Tôi có " + yearTester + " năm trong nghề.");
//        System.out.println("Tôi bắt đầu vào nghề từ năm " + result + " tuổi");
//        System.out.println(a);
//
//        //endregion
//
//        //region Bài 02
//        /* Implement your code here */
//        int x = 50;
//        double y = 20.5;
//        boolean isGreater = (double)x > y;
//        boolean isEqual = (double)x == y;
//        boolean isGreaterOrEqual = isGreater || isEqual;
//        String str1 = "Thực hiện phép toán";
//        String str2 = " cộng";
//        System.out.println(str1 + str2);
//        System.out.println("X lớn hơn y là " + isGreater);
//        System.out.println("X bằng y là " + isEqual);
//        System.out.println("X lớn hơn hoặc bằng y là " + isGreaterOrEqual);
//
//        //endregion
//    }
//}
