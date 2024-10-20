package lesson02;

import java.util.Scanner;

public class Dieplth_StringExercise {
    public static void main(String[] args) {
        // Input from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();
        System.out.println("Chuỗi là: " + input);

        //region Bài 01
        /* Implement your code here */
        int lengthOfString = input.length();
        System.out.println("B1_Độ dài của chuỗi vừa nhập là: " + lengthOfString);
        //endregion

        //region Bài 02
        /* Implement your code here */
        Scanner numberOfKey = new Scanner(System.in);
        System.out.print("Nhập một số bất kỳ: ");
        int inputNum = numberOfKey.nextInt();
        System.out.println("B2_Ký tự tại vị trí vừa nhập là: " + input.charAt(inputNum));

        //endregion

        //region Bài 03
        /* Implement your code here */
        System.out.println("B03_Viết hoa tất cả các ký tự trong text vừa nhập: " + input.toUpperCase());

        //endregion

        //region Bài 04
        /* Implement your code here */
        System.out.println("B04_Viết thường tất cả các ký tự trong text vừa nhập: " + input.toLowerCase());

        //endregion

        //region Bài 05
        /* Implement your code here */
        System.out.println("B05_Bỏ khoảng trắng ở đầu và cuối chuỗi: " + input.trim());

        //endregion

        //region Bài 06
        /* Implement your code here */
        System.out.println("B06_Xóa tất cả các khoảng trắng trong chuỗi: " + input.replaceAll("\\s+",""));

        //endregion

        //region Bài 07
        /* Implement your code here */
        Scanner childInput = new Scanner(System.in);
        System.out.print("Nhập chuỗi thay thế: ");
        System.out.println("B07_Thay thế chuỗi con: " + input.replace(childInput.nextLine(), "replace text"));

        //endregion

        //region Bài 08
        /* Implement your code here */
        System.out.println("B08_Chuỗi mới bài 08: " + input.substring(2,input.length()));

        //endregion

        //region Bài 09
        /* Implement your code here */
        // cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư
        // Tức là chuỗi mới là từ ký tự số 5 đến cuối chuỗi vừa nhập
        System.out.println("B09_Chuỗi mới cho bài 09: " + input.substring(4,input.length()));

        //endregion

        //region Bài 10
        /* Implement your code here */
        //cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi
        String moveFromFirstToSecond = input.substring(2,input.length());
        String strBai10 = moveFromFirstToSecond.substring(0,2);
        System.out.println("B10_Chuỗi mới cho bài 10: " + strBai10);

        //endregion

        //region Bài 11
        /* Implement your code here */
        System.out.println("B11_Chuỗi mới cho bài 11: " + strBai10.toUpperCase());


        //endregion

        //region Bài 12
        /* Implement your code here */
        System.out.println("B12_Chuỗi mới cho bài 12: " + strBai10.toLowerCase());

        //endregion

        //region Bài 13
        /* Implement your code here */
        System.out.println("B13_Chuỗi mới bài 13: " + strBai10.replaceAll("\\s+",""));

        //endregion

        //region Bài 14
        /* Implement your code here */
        System.out.println("B14_Chuỗi mới bài 14: " + strBai10.replace(strBai10,"NewString"));
        //endregion

        //region Bài 15
        /* Implement your code here */
        String upperCase = strBai10.toUpperCase();
        System.out.println("B15_Chuỗi mới bài 15: " + upperCase.replace(upperCase,"NewUpperCase"));

        //endregion
    }
}
