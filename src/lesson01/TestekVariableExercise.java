package lesson01;

public class TestekVariableExercise {
    public static void main(String[] args) {

        // Bài 01
        // Khai báo và khởi tạo các biến
        int intVar = 10;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean boolVar = true;
        String stringVar = "Hello, Java!";

        // Thực hiện các phép toán với các biến số nguyên và số thực
        int sum = intVar + 5;
        int difference = intVar - 3;
        int product = intVar * 2;
        double quotient = doubleVar / 2.5;

        // In kết quả của các phép toán ra màn hình
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // In giá trị của các biến kiểu char, boolean, và String
        System.out.println("Character: " + charVar);
        System.out.println("Boolean: " + boolVar);
        System.out.println("String: " + stringVar);


        // Bài 02
        // Khai báo và khởi tạo các biến
        int intVar1 = 10;
        int intVar2 = 20;
        double doubleVar1 = 15.5;
        double doubleVar2 = 20.5;
        boolean boolVar1 = true;
        boolean boolVar2 = false;
        String stringVar1 = "Hello";
        String stringVar2 = "World";

        // Phép toán so sánh với các biến số nguyên và số thực
        System.out.println("intVar1 == intVar2: " + (intVar1 == intVar2));
        System.out.println("intVar1 != intVar2: " + (intVar1 != intVar2));
        System.out.println("intVar1 > intVar2: " + (intVar1 > intVar2));
        System.out.println("intVar1 < intVar2: " + (intVar1 < intVar2));
        System.out.println("intVar1 >= intVar2: " + (intVar1 >= intVar2));
        System.out.println("intVar1 <= intVar2: " + (intVar1 <= intVar2));

        System.out.println("doubleVar1 == doubleVar2: " + (doubleVar1 == doubleVar2));
        System.out.println("doubleVar1 != doubleVar2: " + (doubleVar1 != doubleVar2));
        System.out.println("doubleVar1 > doubleVar2: " + (doubleVar1 > doubleVar2));
        System.out.println("doubleVar1 < doubleVar2: " + (doubleVar1 < doubleVar2));
        System.out.println("doubleVar1 >= doubleVar2: " + (doubleVar1 >= doubleVar2));
        System.out.println("doubleVar1 <= doubleVar2: " + (doubleVar1 <= doubleVar2));

        // Phép toán logic với các biến boolean
        System.out.println("boolVar1 && boolVar2: " + (boolVar1 && boolVar2));
        System.out.println("boolVar1 || boolVar2: " + (boolVar1 || boolVar2));
        System.out.println("!boolVar1: " + (!boolVar1));

        // Phép toán cộng chuỗi với biến kiểu String
        String concatenatedString = stringVar1 + " " + stringVar2;
        System.out.println("Concatenated String: " + concatenatedString);
    }
}