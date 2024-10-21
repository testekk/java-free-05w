package lesson02;

import java.util.Scanner;

public class TestekStringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // region Bài 01: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra độ dài của chuỗi đó.
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();
        System.out.println("Độ dài của chuỗi là: " + input.length());
        // endregion

        // region Bài 02: Viết một chương trình để nhập một chuỗi và một vị trí từ bàn phím, sau đó in ra ký tự tại vị trí đó trong chuỗi.
        System.out.print("Nhập một chuỗi: ");
        String inputString = scanner.nextLine();
        System.out.print("Nhập một vị trí: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < inputString.length()) {       // Kiểm tra vị trí có hợp lệ không, nếu không hợp lệ thì thông báo
            System.out.println("Ký tự tại vị trí " + index + " là: " + inputString.charAt(index));
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
        // endregion

        // region Bài 03: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.
        System.out.print("Nhập một chuỗi: ");
        String inputStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi chuyển thành chữ hoa: " + inputStr.toUpperCase());
        // endregion

        // region Bài 04: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
        System.out.print("Nhập một chuỗi: ");
        inputStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi chuyển thành chữ thường: " + inputStr.toLowerCase());
        // endregion

        // region Bài 05: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu và cuối chuỗi.
        System.out.print("Nhập một chuỗi: ");
        inputStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi xóa khoảng trắng ở đầu và cuối chuỗi: " + inputStr.trim());
        // endregion

        // region Bài 06: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
        System.out.print("Nhập một chuỗi: ");
        inputStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi xóa tất cả khoảng trắng: " + inputStr.replaceAll(" ", ""));
        // System.out.println("Chuỗi sau khi xóa tất cả khoảng trắng: " + inputStr.replaceAll("\\s+", ""));
        // endregion

        // region Bài 07: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã thay thế một chuỗi con bằng một chuỗi khác.
        System.out.print("Nhập một chuỗi: ");
        inputStr = scanner.nextLine();
        System.out.print("Nhập chuỗi con cần thay thế: ");
        String oldStr = scanner.nextLine();
        System.out.print("Nhập chuỗi mới: ");
        String newStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi thay thế: " + inputStr.replace(oldStr, newStr));
        // endregion

        // region Bài 08: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai.
        System.out.print("Nhập một chuỗi: ");
        inputStr = scanner.nextLine();
        System.out.print("Nhập vị trí đầu: ");
        int start = scanner.nextInt();
        System.out.print("Nhập vị trí cuối: ");
        int end = scanner.nextInt();
        //System.out.println("Chuỗi sau khi cắt: " + inputStr.substring(0, 2));
        System.out.println("Chuỗi sau khi cắt: " + inputStr.substring(start, end));
        // region

        // region Bài 09: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư.
        System.out.print("Nhập một chuỗi: ");
        inputStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi cắt: " + inputStr.substring(0, 2) + inputStr.substring(3, 5));
        // region

        // region Bài 10: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
        System.out.print("Nhập một chuỗi với độ dài >= 4: ");
        inputStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi cắt: " + inputStr.substring(0, 2) + inputStr.substring(3));
        // region

        // region Bài 11: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa
        System.out.print("Nhập một chuỗi với độ dài >= 4: ");
        inputStr = scanner.nextLine();
        String result = inputStr.substring(0, 2) + inputStr.substring(3);
        System.out.println("Chuỗi sau khi cắt và chuyển thành chữ hoa: " + result.toUpperCase());
        // endregion

        // region Bài 12: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
        System.out.print("Nhập một chuỗi với độ dài >= 4: ");
        inputStr = scanner.nextLine();
        result = inputStr.substring(0, 2) + inputStr.substring(3);
        System.out.println("Chuỗi sau khi cắt và chuyển thành chữ thường: " + result.toLowerCase());
        // endregion

        // region Bài 13: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ
        System.out.print("Nhập một chuỗi với độ dài >= 4: ");
        inputStr = scanner.nextLine();
        result = inputStr.substring(0, 2) + inputStr.substring(3);
        System.out.println("Chuỗi sau khi cắt và xóa khoảng trắng: " + result.replaceAll(" ", ""));
        // endregion

        // region Bài 14: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó thay thế một chuỗi con bằng một chuỗi khác.
        System.out.print("Nhập một chuỗi với độ dài >= 4: ");
        inputStr = scanner.nextLine();
        result = inputStr.substring(0, 2) + inputStr.substring(3);
        System.out.print("Nhập chuỗi con cần thay thế: ");
        oldStr = scanner.nextLine();
        System.out.print("Nhập chuỗi mới: ");
        newStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi cắt và thay thế: " + result.replace(oldStr, newStr));
        // endregion

        // region Bài 15: Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa và thay thế một chuỗi con bằng một chuỗi khác.
        System.out.print("Nhập một chuỗi với độ dài >= 4: ");
        inputStr = scanner.nextLine();
        result = inputStr.substring(0, 2) + inputStr.substring(3);
        System.out.print("Nhập chuỗi con cần thay thế: ");
        oldStr = scanner.nextLine();
        System.out.print("Nhập chuỗi mới: ");
        newStr = scanner.nextLine();
        System.out.println("Chuỗi sau khi cắt, chuyển thành chữ hoa và thay thế: " + result.toUpperCase().replace(oldStr, newStr));
        // endregion
    }
}