//package lesson01;
//
//import java.util.Scanner;
//
//public class NguyeThiHuong_VariableExercise_00 {
//    public static void main(String[] args) {
//        System.out.println("----Bài 1-----");
//        Exercise00();
//        System.out.println("----Bài 2-----");
//        Exercise01();
//        System.out.println("----Bài 3-----");
//        Exercise02();
//        System.out.println("----Bài 4-----");
//        Exercise03();
//        System.out.println("----Bài 5-----");
//        Exercise04();
//        System.out.println("----Bài 6-----");
//        Exercise05();
//
//
//    }
//
//    public static void Exercise00() {                            // Testek: Tên hàm nên đặt theo quy tắc camelCase
//        // Khai báo và khởi tạo biến với các kiểu dữ liệu khác nhau
//        int tuoi = 32;                                          // Testek: Nên đặt tên biến có ý nghĩa hơn, ví dụ: age
//        int namsinh = 1992;
//        int thangsing = 01;
//        double chieucao = 1.63;
//        double cannang = 54;
//        char chucai = 'H';
//        int socon = 1;
//        String hoten = "Nguyễn Thị Hương";
//
//        boolean lapgiadinh = true;
//        //In giá trị ban đầu của các biến ra màn hình
//        System.out.println("Thông tin của tôi:");
//        System.out.println("Họ tên:" + hoten);
//        System.out.println("Tuổi:" + tuoi);
//        System.out.println("Tháng,năm sinh:" + thangsing + "/" + namsinh);
//        System.out.println("Chiều cao:" + chieucao + "mét");
//        System.out.println("Cân nặng:" + cannang + "Kg");
//        if (lapgiadinh = true)                                          // Có thể sử dụng if (lapgiadinh) thay vì if (lapgiadinh = true), và sử dụng {} cho if
//            System.out.println("Đã lập gia đình rồi. và có " + socon + " con trai");
//        else                                                            // Sử dụng {} cho else
//            System.out.println("Chưa lập gia đình rồi.");
//        System.out.println("Tôi đang làm tại: " + "Phòng QLCLPM - Công ty cổ phần sản xuất và kinh doanh VinFast");
//
//        // Tính toán
//
//        System.out.println("--------------------");
//        System.out.println("Năm sau tuổi của tôi sẽ là: " + (tuoi + 1));
//        System.out.println("Chiều cao gấp đôi,có thể là: " + (chieucao * 2));
//        System.out.println("Số lượng con gấp đôi: " + (socon * 2));
//
////        String hoten = "Nguyễn Thị Hương";
//        char letterH = hoten.charAt(11);
//        // Lấy ký tự thứ 2, 3, 4, 5
//        String selectedChars = hoten.substring(10, 16);
//        System.out.println("Tên của tôi là:" + selectedChars);
//        System.out.println("Kí tự đầu tiên trong tên tôi là:" + letterH);
//    }
//
//    public static void Exercise01() {
//// Khai báo biến
//        String name = "Nguyễn Thị Hương";
//        String tiente = "VNĐ";
//
//        System.out.println("Chi tiêu của gia đình::" + name);
//
//// Tổng chi tiêu được phép
//        double tongchi = 10;
////Cho phép người dùng nhập từ hệ thống
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chi tiêu hàng tháng:");
//
//        //Tiền nhà
//        System.out.println("Tiền nhà");
//        int tiennha = sc.nextInt();
//
//        // Tiền điện
//        System.out.println("Tiền điện:");
//        double tiendien = sc.nextDouble();
//
//        // Tiền thực phẩm
//        System.out.println("Tiền thực phẩm");
//        float tientp = sc.nextFloat();
//
//        // Các khoản chi khác
//        System.out.println("Các khoản chi khác");
//        float ortherChi = sc.nextFloat();
//
//        // Tính toán
//
//        double tongtieu = tiennha + tiendien + ortherChi + tientp;
//        System.out.println("Tổng đã chi tiêu:" + tongtieu);
//        System.out.println("Tổng ngân sách bạn được phép chi trong 1 tháng:" + tongchi + tiente);
//
//        if (tiennha + tiendien + ortherChi + tientp > tongchi) {
//
//            System.out.println("Bạn đã vượt ngân sách:" + (tongtieu - tongchi) + tiente);
//            // Testek: Nên sử dụng String.format() để format chuỗi, ví dụ: System.out.println(String.format("Bạn đã vượt ngân sách: %f %s", (tongtieu - tongchi), tiente));
//        } else {
//            System.out.println("Bạn chưa vượt ngân sách. Bạn phải tiêu từng này tiền nữa:" + (tongchi - tongtieu) + tiente);
//        }
//
//    }
//
//    public static void Exercise02() {
//
//        Scanner sc = new Scanner(System.in);
//        //Khai báo đối tượng để user nhập dữ liệu từ bàn phím
//        System.out.println("Mời nhập vào bán kính đường tròn:"); // Câu thông báo:
//
//        double r = sc.nextDouble(); // Ghi lại thông tin khi kh nhập cho vào biến r
//        double cv = 2 * Math.PI * r; // Khai báo và gán = biểu thức
//        double dientich = Math.PI * Math.pow(r, 2);
//
//        System.out.println("Chu vi của hình tròn là:" + cv);
//        System.out.println("Diện tích của hình tròn:" + dientich);
//    }
//
//    public static void Exercise03() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chiều dài:");
//        double chieudai = sc.nextDouble();
//        System.out.println("Chiều dài của hình chủ nhật là:" + chieudai);
//
//        // Nhập chiều rộng
//        System.out.println("Nhập chiều rộng:");
//        float chieurong = sc.nextFloat();
//        System.out.println("Chiều rộng của hình chủ nhật là:" + chieurong);
//        double cv = (chieudai + chieurong) * 2;
//        float dt = (float) (chieurong * chieudai);
//
//        // in câu thông báo ra màn hình
//        System.out.println("Chu vi của hình chữ nhật là:" + cv);         // Testek: Khi in thì sau : nên có dấu cách
//        System.out.println("Diện tích của hình chữ nhật là:" + dt);
//    }
//
//    public static void Exercise04() {
//
//        int a = 11;
//        int b = 5;
//        System.out.println("a=" + a);
//        System.out.println("b=" + b);
////        Phép cộng
//        System.out.println("a+b=" + (a + b)); // Phải để trong ngoặc
////        Gán biến
//        int kq = a + b;
//        System.out.println("a+b=" + kq); // kết quả giống trên
//        System.out.println("Làm bài toán sau:");
////        Làm toán
//        System.out.println("a+b=" + (int) (a + b)); // kết quả giống trên
//        System.out.println("a-b=" + (int) (a - b)); // kết quả giống trên
//        System.out.println("a*b=" + (int) (a * b)); // kết quả giống trên
//        System.out.println("a/b=" + (double) a / b); // kết quả giống trên, thật trọng với phép chia
//        System.out.println("a%b=" + (double) a % b); // kết quả giống trên, thật trọng với phép chia
//
//    }
//
//    public static void Exercise05() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào điểm trung bình:");
//        double dtb = sc.nextDouble();
//        if (dtb >= 8 && dtb <= 10)                     // Testek: Cần format lại code cho đẹp nhe, Ctrl + Alt + L
//        {
//            System.out.println("Bạn xếp loaị giỏi:");
//
//        } else if (dtb < 8 && dtb >= 6.5) {
//            System.out.println("Bạn xếp loaị khá:");
//
//        } else if (dtb < 6.5 && dtb >= 5) {
//            System.out.println("Bạn xếp loaị trung bình:");
//
//        } else {
//            System.out.println("Bạn xếp loaị Yếu:");
//        }
//
//        // Testek: Ví dụ
//        if (dtb >= 8 && dtb <= 10) {
//            System.out.println("Bạn xếp loaị giỏi:");
//        } else if (dtb < 8 && dtb >= 6.5) {
//            System.out.println("Bạn xếp loaị khá:");
//        } else if (dtb < 6.5 && dtb >= 5) {
//            System.out.println("Bạn xếp loaị trung bình:");
//        } else {
//            System.out.println("Bạn xếp loaị Yếu:");
//        }
//
//        // Testek: Có thể phát triển như sau
////        String rank = "Invalid - Your rank is not defined";
////        if (dtb >= 8 && dtb <= 10) {
////            rank = "Excellent";
////        } else if (dtb < 8 && dtb >= 6.5) {
////            rank = "Good";
////        } else if (dtb < 6.5 && dtb >= 5) {
////            rank = "Average";
////        } else if (dtb >= 0 && dtb < 5) {
////            rank = "Weak";
////        }
////        System.out.println("Xếp loại của bạn: " + rank);
//    }
//
//}
//
