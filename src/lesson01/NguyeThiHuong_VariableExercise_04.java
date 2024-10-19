/*Bài 3: Nhập vào điểm tb, in ra xếp loại của
- Học sinh giỏi: 8=< dtb<=10
- Học sinh khá:  8> dtb >= 6.5
- Học sinh TB: 6.5 > dtb >= 5
- Học sinh yếu : dtb < 5*/

import java.util.Scanner;
public class NguyeThiHuong_VariableExercise_04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời nhập vào điểm trung bình:");
            double dtb = sc.nextDouble();
            if (dtb>= 8 && dtb<=10)
            {
                System.out.println("Bạn xếp loaị giỏi:");

            } else if (dtb < 8 && dtb>= 6.5) {
                System.out.println("Bạn xếp loaị khá:");

            } else if (dtb < 6.5 && dtb>= 5) {
                System.out.println("Bạn xếp loaị trung bình:");

            } else {
                System.out.println("Bạn xếp loaị Yếu:");
            }


        }
    }


