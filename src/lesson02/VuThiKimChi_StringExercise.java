package lesson02;

import java.util.Scanner;

public class VuThiKimChi_StringExercise {
    public static void main(String[] args) {
        // LESSON 2:
        //1. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra độ dài của chuỗi đó.
        System.out.println("\n" + "1. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra độ dài của chuỗi đó.");
        // Nhập chuỗi từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();
        // In ra độ dài chuỗi
        int doDai = input.length();
        System.out.println("Độ dài của chuỗi vừa nhập là: "+doDai);

        //2. Viết một chương trình để nhập một chuỗi và một vị trí từ bàn phím, sau đó in ra ký tự tại vị trí đó trong chuỗi.
        System.out.println("\n" + "2. Viết một chương trình để nhập một chuỗi và một vị trí từ bàn phím, sau đó in ra ký tự tại vị trí đó trong chuỗi.");
        // Nhập vị trí từ bàn phím
        System.out.print("Nhập một vị trí (bắt đầu từ 0): ");
        int viTri = scanner.nextInt();

        // Kiểm tra vị trí hợp lệ
        if (viTri < 0 || viTri >= doDai) {
            System.out.println("Vị trí không hợp lệ. Vui lòng nhập lại");
        } else {
            // In ra ký tự tại vị trí đó
            char kyTu = input.charAt(viTri);
            System.out.println("Ký tự tại vị trí " + viTri + " là: " + kyTu);
        }

        //3. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.
        System.out.println("\n" + "3. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.");
        String upperCase = input.toUpperCase();
        System.out.println("Chuỗi sau khi được in hoa: "+upperCase);

        //4. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
        System.out.println("\n" + "4. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.");
        String lowerCase = input.toLowerCase();
        System.out.println("Chuỗi sau khi được in hoa: "+lowerCase);

        //5. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu và cuối chuỗi.
        System.out.println("\n" + "5. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu và cuối chuỗi.");
        String trimSpace = input.trim();
        System.out.println("Chuỗi sau khi xóa khoảng trắng đầu cuối: "+trimSpace);

        //6. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
        System.out.println("\n" + "6. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.");
        String replaceAll = input.replaceAll("\\s+", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng đầu cuối: "+replaceAll);

        //7. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã thay thế một chuỗi con bằng một chuỗi khác.
        System.out.println("\n" + "7. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã thay thế một chuỗi con bằng một chuỗi khác.");
        // Cắt chuỗi để chỉ thay thế phần được cắt này
        String newStr0 = input.substring(0, 2);
        String newSTr = input.substring(2, input.length());

        // Thay thế chuỗi con vừa cắt
        String replace = input.replace(newStr0, "Lưu");
        System.out.println("Chuỗi sau khi được thay thế: "+replace);

        //8. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai.
        System.out.println("\n" + "8. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ 2: ");
        String input1 = scanner1.nextLine();

        // Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai
        String subString = input1.substring(0, 2);
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai: "+subString);

        //9. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư.
        System.out.println("\n" + "9. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư.");
        // Cắt chuỗi từ vị trí thứ 3 đến vị trí thứ 4
        String subString1 = input1.substring(2, 4);
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ 2: "+subString);
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí thứ 3 đến vị trí thứ 4: "+subString1);

        //10. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
        System.out.println("\n" + "10. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.");
        // Độ dài chuỗi
        int n = input1.length();

        // Cắt chuỗi từ vị trí thứ 3 đến hết chuỗi
        String subString2 = input1.substring(2, n);
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ 2: "+subString);
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí thứ 3 đến hết chuỗi: "+subString2);

        //11. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.
        System.out.println("\n" + "11. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.");
        // In hoa các chuỗi
        String upperCase1 = subString.toUpperCase();
        String upperCase2 = subString2.toUpperCase();
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ 2 và từ vị trí thứ 3 đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa: "+upperCase1+upperCase2);

        //12. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
        System.out.println("\n" + "12. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.");
        // In hoa các chuỗi
        String lowerase1 = subString.toLowerCase();
        String lowerCase2 = subString2.toLowerCase();
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ 2 và từ vị trí thứ 3 đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ thường: "+lowerase1+lowerCase2);

        //13. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
        System.out.println("\n" + "13. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.");
        // Xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
        String newStr1 = subString.replaceAll("\\s+", "");
        String newStr2 = subString2.replaceAll("\\s+", "");
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ 2 và từ vị trí thứ 3 đến hết chuỗi, sau đó xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ: "+newStr1+newStr2);

        //14. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó thay thế một chuỗi con bằng một chuỗi khác.
        System.out.println("\n" + "14. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó thay thế một chuỗi con bằng một chuỗi khác.");
        // Thay thế chuỗi con bằng 1 chuỗi khác
        String newStr4 = subString2.replace("Kim", "Tester");
        System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ 2 và từ vị trí thứ 3 đến hết chuỗi, sau đó thay thế một chuỗi con bằng một chuỗi khác. "+subString+newStr4);

        //15. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa và thay thế một chuỗi con bằng một chuỗi khác.
        System.out.println("\n" + "15. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa và thay thế một chuỗi con bằng một chuỗi khác.");
        // Thay thế 1 chuỗi con bằng 1 chuỗi khác
        String newStr5 = upperCase1.replace("V", "Automation test");
        System.out.println(newStr5);
        System.out.println(subString2+" - "+newStr5);
        // System.out.println("Chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ 2 và từ vị trí thứ 3 đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa và thay thế một chuỗi con bằng một chuỗi khác."+newStr5+subString2);
    }
}
