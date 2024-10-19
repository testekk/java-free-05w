import java.util.Scanner;

public class NguyeThiHuong_VariableExercise_00 {
    public static void main(String[] args) { // Khai báo và khởi tạo biến với các kiểu dữ liệu khác nhau
        int tuoi = 32;
        int namsinh = 1992;
        int thangsing = 01;
        double chieucao = 1.63;
        double cannang = 54;
        char chucai = 'H';
        int socon = 1;
        String hoten = "Nguyễn Thị Hương";

        boolean lapgiadinh = true;

        //In giá trị ban đầu của các biến ra màn hình
        System.out.println("Thông tin của tôi:");
        System.out.println("Họ tên:" + hoten);
        System.out.println("Tuổi:" +tuoi );
        System.out.println("Tháng,năm sinh:" +thangsing +"/"+ namsinh );
        System.out.println("Chiều cao:" +chieucao + "mét");
        System.out.println("Cân nặng:"  +cannang + "Kg");
        if (lapgiadinh = true)
            System.out.println("Đã lập gia đình rồi. và có " + socon + " con trai");
        else
            System.out.println("Chưa lập gia đình rồi.");
        System.out.println("Tôi đang làm tại: " + "Phòng QLCLPM - Công ty cổ phần sản xuất và kinh doanh VinFast");

        // Tính toán

        System.out.println("-------------------");
        System.out.println("Năm sau tuổi của tôi sẽ là: " + (tuoi+1));
        System.out.println("Chiều cao gấp đôi,có thể là: " + (chieucao * 2));
        System.out.println("Số lượng con gấp đôi: " + (socon * 2));

//        String hoten = "Nguyễn Thị Hương";
        char letterH = hoten.charAt(11);
        // Lấy ký tự thứ 2, 3, 4, 5
        String selectedChars = hoten.substring(10, 16);
        System.out.println("Tên của tôi là:" + selectedChars );
        System.out.println("Kí tự đầu tiên trong tên tôi là:" + letterH );
    }
    }

