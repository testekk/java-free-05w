package lesson01;

public class BongNT_VariableExercise {
    public static void main(String[] args) {

        //region Bài 01
        /* Implement your code here */
        /* Khai báo các biến kiểu int, double, char, boolean, và String.*/
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

        /* Khai báo và khởi tạo các biến số nguyên, số thực, boolean và chuỗi (mỗi loại 02 biến).*/
        int x1 = 100;
        int x2 = 200;
        double y1 = 100.1;
        double y2 = 200.2;
        boolean z1 = true;
        boolean z2 = false;
        String w1 = "Hello";
        String w2 = "World";

        /* Thực hiện các phép toán so sánh với các biến số nguyên và số thực.*/
        boolean x = x1 > x2;
        boolean y = y1 > y2;

        /* Thực hiện các phép toán logic với các biến boolean.*/
        if (z2) {
            System.out.println("In ra giá trị sai");
        } else if (z1) {
            System.out.println("In ra giá trị đúng");
        } else {
            System.out.println("Không có giá trị đúng");
        }

        /* Thực hiện phép toán cộng chuỗi với biến kiểu String.*/
        String w = w1 + w2;

        /* In kết quả của các phép toán ra màn hình.*/
        System.out.println("So sanh biến số nguyên: " +x);
        System.out.println("So sanh biến số thực: " +y);
        System.out.println("In kiểu String: " + w1 + " " + w2);
        //endregion
    }
}
