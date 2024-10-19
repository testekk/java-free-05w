import java.util.Scanner;

public class NguyeThiHuong_VariableExercise_02 {

    /*Bài 2:
Tính chu vi, diện tích hình chũ nhật nhập 2 số thực dương a, b.
 - Công thức diện tích : s= a*b
 - Công thức chu vi: p =(a+b)*2
*/
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        double chieudai = sc.nextDouble();
        System.out.println("Chiều dài của hình chủ nhật là:" +chieudai);

        // Nhập chiều rộng
        System.out.println("Nhập chiều rộng:");
        float chieurong  = sc.nextFloat();
        System.out.println("Chiều rộng của hình chủ nhật là:" +chieurong);
         double cv = (chieudai + chieurong)*2;
         float dt = (float) (chieurong  * chieudai);

         // in câu thông báo ra màn hình
        System.out.println("Chu vi của hình chữ nhật là:" +cv);
        System.out.println("Diện tích của hình chữ nhật là:"+ dt);
    }
}
