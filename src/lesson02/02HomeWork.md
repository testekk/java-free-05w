# Bài Tập về String trong Java

## Mục tiêu
- Hiểu và sử dụng các phương thức của lớp `String` trong Java.
- Biết cách sử dụng các phương thức của lớp `String` để thao tác với chuỗi:
  - Xử lý chuỗi
  - So sánh chuỗi
  - Tìm kiếm chuỗi
  - Thay thế chuỗi
  - Cắt chuỗi
  - Chuyển đổi chuỗi
  - Kiểm tra chuỗi
  - ...

## Bài Tập
1. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra độ dài của chuỗi đó.
2. Viết một chương trình để nhập một chuỗi và một vị trí từ bàn phím, sau đó in ra ký tự tại vị trí đó trong chuỗi.
3. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.
4. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
5. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu và cuối chuỗi.
6. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
7. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã thay thế một chuỗi con bằng một chuỗi khác.
8. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai.
9. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư.
10. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
11. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.
12. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
13. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
14. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó thay thế một chuỗi con bằng một chuỗi khác.
15. Viết một chương trình để nhập một chuỗi từ bàn phím và in ra chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa và thay thế một chuỗi con bằng một chuỗi khác.

## Hướng dẫn
Chung
- Tạo một file Java mới tên là `StringExercise.java`.
  - Thực hiện phát triển các yêu cầu
      - Sử dụng lớp `Scanner` để nhập chuỗi từ bàn phím.
        ```java
          import java.util.Scanner;
    
          public class StringExercise {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập một chuỗi: ");
                String input = scanner.nextLine(); // Đây là chuỗi bạn cần xử lý
                /* Implement your code here */
                
            }
          }
        ```
    - Sử dụng các phương thức của lớp `String` để thực hiện các yêu cầu.
1. Bài 1:
   - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên
   - Sử dụng phương thức `length()` để lấy độ dài của chuỗi.
   - In độ dài của chuỗi
2. Bài 2:
   - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
   - Sử dụng phương thức `charAt(int index)` để lấy ký tự tại vị trí chỉ định trong chuỗi.
   - In ký tự tại vị trí đó
3. Bài 3:
   - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
   - Sử dụng phương thức `toUpperCase()` để chuyển tất cả các ký tự trong chuỗi thành chữ hoa.
   - In chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.
4. Bài 4:
   - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
   - Sử dụng phương thức `toLowerCase()` để chuyển tất cả các ký tự trong chuỗi thành chữ thường.
   - In chuỗi sau khi đã chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
5. Bài 5:
   - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
   - Sử dụng phương thức `trim()` để xóa tất cả các khoảng trắng ở đầu và cuối chuỗi.
   - In chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu và cuối chuỗi.
6. Bài 6:
   - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
   - Sử dụng phương thức `replaceAll("\\s+", " ")` để xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
   - In chuỗi sau khi đã xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
7. Bài 7:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `replace(CharSequence target, CharSequence replacement)` để thay thế một chuỗi con bằng một chuỗi khác.
    - In chuỗi sau khi đã thay thế một chuỗi con bằng một chuỗi khác.
8. Bài 8:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai.
9. Bài 9:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến vị trí thứ tư.
10. Bai 10:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
11. Bai 11:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
    - Sử dụng phương thức `toUpperCase()` để chuyển tất cả các ký tự trong chuỗi thành chữ hoa.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa.
12. Bai 12:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
    - Sử dụng phương thức `toLowerCase()` để chuyển tất cả các ký tự trong chuỗi thành chữ thường.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ thường.
13. Bai 13:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
    - Sử dụng phương thức `replaceAll("\\s+", " ")` để xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó xóa tất cả các khoảng trắng ở đầu, cuối chuỗi và giữa các từ.
14. Bai 14:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
    - Sử dụng phương thức `replace(CharSequence target, CharSequence replacement)` để thay thế một chuỗi con bằng một chuỗi khác.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó thay thế một chuỗi con bằng một chuỗi khác.
15. Bai 15:
    - Sử dụng lớp `Scanner` để nhập chuỗi và vị trí từ bàn phím như ở trên.
    - Sử dụng phương thức `substring(int beginIndex, int endIndex)` để cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi.
    - Sử dụng phương thức `toUpperCase()` để chuyển tất cả các ký tự trong chuỗi thành chữ hoa.
    - Sử dụng phương thức `replace(CharSequence target, CharSequence replacement)` để thay thế một chuỗi con bằng một chuỗi khác.
    - In chuỗi sau khi đã cắt chuỗi từ vị trí đầu tiên đến vị trí thứ hai và từ vị trí thứ ba đến hết chuỗi, sau đó chuyển tất cả các ký tự trong chuỗi đó thành chữ hoa và thay thế một chuỗi con bằng một chuỗi khác.