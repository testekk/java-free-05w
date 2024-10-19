import java.util.Scanner;

/*Bài 4: Tìm x, y khi bết tổng và hiệu của chúng
Gợi ý :
 - x + y = 14
 - x-y = 4
 => 2x = tong + hieu => x= (tong + hieu)/2
* */public class NguyeThiHuong_VariableExercise_05 {
    public static void main(String[] args) {
        // Khai báo tổng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng của 2 số:");
        float tong = sc. nextFloat();

        // Khai báo hiêu
        System.out.println("Nhập hiệu của 2 số:");
        float hieu = sc. nextFloat();
        // Tính toán
        float x = (tong + hieu)/2;
        float y = tong - x;
        // Xuất kết quả
        System.out.println("Giá trị X cần tìm là:"+x);
        System.out.println("Giá trị Y cần tìm là:"+y);

    }
}
