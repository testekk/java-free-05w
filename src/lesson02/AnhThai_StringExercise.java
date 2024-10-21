package lesson02;

//import java.util.Scanner;
//
//public class AnhThai_StringExercise {
//    public static void main(String[] args) {
//        // Input from keyboard
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap chuoi: ");
//        String input = scanner.nextLine();
//        System.out.println("Chuoi vua nhap B1: " + input);
//
//        //region Bài 01
//        /* Implement your code here */
//        int lengthOfString = input.length();
//        System.out.println("Do dai cua chuoi vua nhap B2: " + lengthOfString);
//        //endregion
//
//        //region Bài 02
//        /* Implement your code here */
//        Scanner numberOfKey = new Scanner(System.in);
//        System.out.print("Nhap so bat ky: ");
//        int inputNum = numberOfKey.nextInt();
//        System.out.println("Ky tu tai vi tri vua nhap B3: " + input.charAt(inputNum));
//
//        //endregion
//
//        //region Bài 03
//        /* Implement your code here */
//        System.out.println("Viet hoa text vua nhap B4: " + input.toUpperCase());
//
//        //endregion
//
//        //region Bài 04
//        /* Implement your code here */
//        System.out.println("Viet thuong text vua nhap B5: " + input.toLowerCase());
//
//        //endregion
//
//        //region Bài 05
//        /* Implement your code here */
//        System.out.println("Trim space dau va cuoi B5: " + input.trim());
//
//        //endregion
//
//        //region Bài 06
//        /* Implement your code here */
//        System.out.println("Trim space trong chuoi B6: " + input.replaceAll("\\s+",""));
//
//        //endregion
//
//        //region Bài 07
//        /* Implement your code here */
//        Scanner childInput = new Scanner(System.in);
//        System.out.print("Nhap chuoi thay the: ");
//        System.out.println("Chuoi thay the B7: " + input.replace(childInput.nextLine(), "replace text"));
//
//        //endregion
//
//        //region Bài 08
//        /* Implement your code here */
//        System.out.println("Chuoi moi B8 la: " + input.substring(2,input.length()));
//
//        //endregion
//
//        //region Bài 09
//        /* Implement your code here */
//        // cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư
//        // Tức là chuỗi mới là từ ký tự số 5 đến cuối chuỗi vừa nhập
//        System.out.println("Chuoi moi la: " + input.substring(4,input.length()));
//
//        //endregion
//
//        //region Bài 10
//        /* Implement your code here */
//        //cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi
//        String moveFromFirstToSecond = input.substring(2,input.length());
//        String strBai10 = moveFromFirstToSecond.substring(0,2);
//        System.out.println("Chuoi moi B10 la: " + strBai10);
//
//        //endregion
//
//        //region Bài 11
//        /* Implement your code here */
//        System.out.println("Chuoi moi B11 la: " + strBai10.toUpperCase());
//
//
//        //endregion
//
//        //region Bài 12
//        /* Implement your code here */
//        System.out.println("Chuoi moi B12 la: " + strBai10.toLowerCase());
//
//        //endregion
//
//        //region Bài 13
//        /* Implement your code here */
//        System.out.println("Chuoi moi B13 la: " + strBai10.replaceAll("\\s+",""));
//
//        //endregion
//
//        //region Bài 14
//        /* Implement your code here */
//        System.out.println("Chuoi moi B14 la: " + strBai10.replace(strBai10,"NewString"));
//        //endregion
//
//        //region Bài 15
//        /* Implement your code here */
//        String upperCase = strBai10.toUpperCase();
//        System.out.println("Chuoi moi B15 la: " + upperCase.replace(upperCase,"NewUpperCase"));
//
//        //endregion
//    }
//}
