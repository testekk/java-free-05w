package lesson07;

import java.util.Scanner;

public class YourName_Exercise {
    public static void main(String[] args) {
        YourName_Exercise exercise = new YourName_Exercise();
        exercise.printUpperCase();
        exercise.stringExercise();
        exercise.findNumber();
        exercise.matrix();
        exercise.sumNumber();
        exercise.primeNumber();

    }

    //1. Nhập một chuỗi từ bàn phím và in ra số lượng ký tự viết hoa. Ví dụ: TestekVN -> In ra 3 (T, V, N)
    public void printUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        String str = sc.nextLine();

        System.out.printf("Your string: %s\n", str);
        // Implement your code here

    }

    /**
     * 2. Cho chuỗi: "TestekVN - Đào tạo kiểm thử thực chiến", hãy thực hiện các yêu cầu sau:
     * 1. Đếm số lượng ký tự e trong chuỗi
     * 2. Kểm tra chuỗi có phải bắt đầu bằng "Test" không, nếu đúng in ra true, sai in false
     * 3. Lấy vị trí của từ "thực" trong chuỗi
     * 4. In ra chuỗi đảo ngược của chuỗi trên (Ví dụ: Chuỗi đầu vào là "TestekVN" -> Kết quả: "NVketseT")
     */
    public void stringExercise() {
        System.out.println("\nBai 2: ");
        String str = "TestekVN - Đào tạo kiểm thử thực chiến";

        // Implement your code here

    }

    /**
     * 3. Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
     * 1. In ra list theo thứ tự giảm dần.
     * 2. Chỉ ra vị trí số 77 trong list(Array)
     */

    public void findNumber() {
        System.out.println("\nBai 3: ");

        // Implement your code here

    }

    /**
     * 4. Viết chương trình nhập vào ma trận A có N dòng, M cột chua các phần từ là số nguyên lớn hơn 0 và nhỏ hơn 100, hãy thực hiện các chức năng sau:
     * 1. Tìm phần tử lớn nhất và chỉ số của nó (Nếu có nhiều thì in ra toàn bộ các index đó)
     * 2. Tìm và in ra ma trận với điều kiện các phần tử là số nguyên tố của ma trận thì giữ nguyên, không phải thì in 0
     * 3. Sắp xếp các cột của ma trận và in ra tổng của mỗi cột
     */

    public void matrix() {
        System.out.println("\nBai 4: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ma tran");
        System.out.print("So hang: ");
        int N = sc.nextInt();

        System.out.print("So cot: ");
        int M = sc.nextInt();

        // Input matrix,  Implement your code here

        // Print matrix, find max value and index, Implement your code here

        // Print max value and index, Implement your code here

        // Print new matrix, Implement your code here

        // Sort column of matrix, Implement your code here

    }

    // check prime number, return true if number is prime
    public boolean isPrime(int number) {
        // Implement your code here

        return true;
    }

    /**
     * 5. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
     * Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
     */
    public void sumNumber() {
        System.out.println("\nBai 5: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so nguyen: ");
        // Implement your code here

    }

    /**
     * 6. Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố.
     */
    public void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so nguyen: ");
        int number = sc.nextInt();
        System.out.print("So nguyen " + number + " = ");
       // Implement your code here

    }
}
