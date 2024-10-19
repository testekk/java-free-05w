import java.util.Scanner;

public class NguyeThiHuong_VariableExercise_03 {
    public static void main(String[] args) {

            int a = 11;
            int b = 5;
            System.out.println("a="+a);
            System.out.println("b="+b);
//        Phép cộng
            System.out.println("a+b=" +(a+b)); // Phải để trong ngoặc
//        Gán biến
            int kq = a+b;
            System.out.println("a+b=" +kq); // kết quả giống trên
            System.out.println("Làm bài toán sau:");
//        Làm toán
            System.out.println("a+b=" +(int)(a+b)); // kết quả giống trên
            System.out.println("a-b=" +(int)(a-b)); // kết quả giống trên
            System.out.println("a*b=" + (int)(a*b)); // kết quả giống trên
            System.out.println("a/b=" +(double) a/b ); // kết quả giống trên, thật trọng với phép chia
            System.out.println("a%b=" +(double) a%b ); // kết quả giống trên, thật trọng với phép chia

        }
}
