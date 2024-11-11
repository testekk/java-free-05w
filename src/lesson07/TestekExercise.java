package lesson07;

import java.awt.*;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class TestekExercise {
    public static void main(String[] args) {
        TestekExercise exercise = new TestekExercise();
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
        List<Character> res = new ArrayList<>();
        char[] strChars = str.toCharArray();
        for (char v : strChars) {
            if (Character.isLetter(v) && Character.isUpperCase(v)) res.add(v);
        }
        System.out.printf("Res: %s(%s)", res.size(), res);
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

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }

        //int count = (int) str.chars().filter(v -> v == 'e').count();
        System.out.printf("So luong ky tu e: %s\n", count);
        System.out.printf("So luong ky tu: %s\n", str.length());
        System.out.println("Chuoi bat dau bang Test: " + String.valueOf(str.startsWith("Test")));
        System.out.println("Vi tri cua [thực]: " + str.indexOf("thực"));

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("1. Dao nguoc chuoi: " + stringBuilder.reverse());
        System.out.print("2. Dao nguoc chuoi: ");
        char[] strChars = str.toCharArray();
        for (int i = strChars.length - 1; i >= 0; i--) {
            System.out.print(strChars[i]);
        }
    }

    /**
     * 3. Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
     * 1. In ra list theo thứ tự giảm dần.
     * 2. Chỉ ra vị trí số 77 trong list(Array)
     */

    public void findNumber() {
        System.out.println("\nBai 3: ");
        List<Integer> res = new ArrayList<>();
        for (int i = 10; i <= 200; i++) {
            if (i % 7 == 0 && i % 5 != 0) res.add(i);
        }

        System.out.println("Danh sach cac so chia het cho 7 nhung k phai boi so cua 5:");
        //res.sort((o1, o2) -> o2.compareTo(o1));
        res.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(res);

        System.out.println("Vi tri cua phan tu 77 : " + (res.indexOf(77) + 1));
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

        if (N <= 0 || M <= 0) return;

        int[][] arr = new int[N][M];
        System.out.printf("\nMa tran cua ban dang %s x %s\n", N, M);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("Moi nhap nhap gia tri vi tri [%s, %s]: ", (i + 1), (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix: ");
        int max = Integer.MIN_VALUE;
        List<Point> index = new ArrayList<>();
        int[][] newArr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int value = arr[i][j];
                System.out.print(value + " ");
                if (isPrime(value)) {
                    newArr[i][j] = value;
                } else newArr[i][j] = 0;
                if (max <= value) {
                    max = value;
                    index.add(new Point(i, j));
                }
            }
            System.out.println();
        }

        int finalMax = max;
        index = index.stream().filter(p -> arr[(int) p.getX()][(int) p.getY()] == finalMax).collect(Collectors.toList());

        System.out.println("Max value: " + max);
        System.out.println("Index: " + index);
        System.out.println("New Array: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }

        // Sap xep cac cot cua Array
        for (int i = 0; i < M; i++) {
            List<Integer> colList = new ArrayList<>();
            int sum = 0;
            for (int j = 0; j < N; j++) {
                colList.add(arr[j][i]);
                sum += arr[j][i];
            }
            Collections.sort(colList);
            for (int j = 0; j < colList.size(); j++) {
                arr[j][i] = colList.get(j);
            }
            System.out.printf("\nTong gia tri cua cot %s: %s", (i + 1), sum);
        }

        System.out.println("\nMatrix sau khi sort colum: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
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
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Tong cac chu so cua so nguyen: " + sum);
    }

    /**
     * 6. Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố.
     */
    public void primeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so nguyen: ");
        int number = sc.nextInt();
        System.out.print("So nguyen " + number + " = ");
        boolean first = true;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                if (!first) {
                    System.out.print(" x ");
                }
                System.out.print(i);
                number /= i;
                first = false;
            }
        }
    }
}