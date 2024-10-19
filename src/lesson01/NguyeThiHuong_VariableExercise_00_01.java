import java.util.Scanner;

public class NguyeThiHuong_VariableExercise_00_01 {
    public static void main(String[] args) {
// Khai báo biến
        String name = "Nguyễn Thị Hương";
        String tiente = "VNĐ";

        System.out.println("Chi tiêu của gia đình::" + name);

// Tổng chi tiêu được phép
        double tongchi = 10;
//Cho phép người dùng nhập từ hệ thống

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chi tiêu hàng tháng:");

        //Tiền nhà
        System.out.println("Tiền nhà");
        int tiennha = sc.nextInt();

        // Tiền điện
        System.out.println("Tiền điện:");
        double tiendien = sc.nextDouble();

        // Tiền thực phẩm
        System.out.println("Tiền thực phẩm");
        float tientp = sc.nextFloat();

        // Các khoản chi khác
        System.out.println("Các khoản chi khác");
        float ortherChi = sc.nextFloat();

        // Tính toán

        double tongtieu = tiennha + tiendien + ortherChi + tientp;
        System.out.println("Tổng đã chi tiêu:" + tongtieu);
        System.out.println("Tổng ngân sách bạn được phép chi trong 1 tháng:" + tongchi + tiente);

        if (tiennha + tiendien + ortherChi + tientp > tongchi) {

            System.out.println("Bạn đã vượt ngân sách:" + (tongtieu - tongchi) + tiente);
        } else {
            System.out.println("Bạn chưa vượt ngân sách. Bạn phải tiêu từng này tiền nữa:" + (tongchi - tongtieu) + tiente);
        }

    }

}