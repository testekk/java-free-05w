package lesson02;

import java.util.Scanner;

public class LeNga_StringExercise {
    public static void main(String[] args) {
        // Input from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String input = scanner.nextLine();
        System.out.println("Chuỗi là: " + input);

        //region Bài 01
        System.out.println("\n- Bài 1: Độ dài của chuỗi là: "+input.length());
        //endregion

        //region Bài 02
        System.out.println("\n- Bài 2: Lấy ra ký tự ở vị trí thứ 2: "+input.charAt(1));
        //endregion

        //region Bài 03
        System.out.println("\n- Bài 3: Chuyển tất cả các ký tự trong chuỗi thành chữ hoa: "+input.toUpperCase());
        //endregion

        //region Bài 04
        System.out.println("\n- Bài 4: Chuyển tất cả các ký tự trong chuỗi thành chữ thường: "+input.toLowerCase());
        //endregion

        //region Bài 05
        System.out.println("\n- Bài 5: Xóa tất cả các khoảng trắng ở đầu và cuối chuỗi: "+input.trim());
        //endregion

        //region Bài 06
        System.out.println("\n- Bài 6: Xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ: "+input.replaceAll("\\s+", ""));
        //endregion

        //region Bài 07
        System.out.println("\n- Bài 7: Thay thế một chuỗi con bằng một chuỗi khác: "+input.replace("you", "you!"));
        //endregion

        //region Bài 08
        System.out.println("\n- Bài 8: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai: "+input.substring(0,2));
        //endregion

        //region Bài 09
        System.out.println("\n- Bài 9: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư: "+(input.substring(0,2) + input.substring(3,4)));
        //endregion

        //region Bài 10
        String output = input.substring(0,2) + input.substring(2);
        System.out.println("\n- Bài 10: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi: "+output);
        //endregion

        //region Bài 11
        System.out.println("\n- Bài 11: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi," +
                " sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa: "+output.toUpperCase());
        //endregion

        //region Bài 12
        System.out.println("\n- Bài 12: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi," +
                " sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa: "+output.toLowerCase());
        //endregion

        //region Bài 13
        System.out.println("\n- Bài 13: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi," +
                " sau đó xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ: "+output.replaceAll("\\s+", ""));
        //endregion

        //region Bài 14
        System.out.println("\n- Bài 14: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi," +
                " sau đó thay thế một chuỗi con bằng một chuỗi khác: "+output.replace("you", "you!"));
        //endregion

        //region Bài 15
        System.out.println("\n- Bài 15: Cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi," +
                " sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa và thay thế một chuỗi con bằng một chuỗi khác: "
                +output.replace("you", "you!").toUpperCase());
        //endregion
    }
}
