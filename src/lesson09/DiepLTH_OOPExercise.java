package lesson09;

import java.awt.*;

public class DiepLTH_OOPExercise {
    public static void main(String[] args) {
        //region Bài 01
        /* Implement your code here */
//        DiepLTHShape circle = new DiepLTHCircle(5);
//        DiepLTHShape rectangle = new DiepLTHRectangle(2,3);
//        System.out.println("Diện tích hình tròn là: " + Math.round(circle.getArea()));
//        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
        //endregion

        //region Bài 02
        /* Implement your code here */
        DiepLTHShape circle = new DiepLTHCircle("Hình tròn", "Đỏ", 5, false);
        DiepLTHShape rectangle = new DiepLTHRectangle("Hình chữ nhật", "Xanh", 2,3);
        System.out.println("Diện tích hình tròn là: " + Math.round(circle.getArea()));
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea());
        System.out.println("In ra thông tin hình tròn: " + circle.getInfo());
        System.out.println("In ra thông tin hình chữ nhật: " + rectangle.getInfo());
        //endregion
    }
}
