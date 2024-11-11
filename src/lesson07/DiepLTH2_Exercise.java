package lesson07;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DiepLTH2_Exercise {
    public static void main(String[] args) {
        DiepLTH2_Exercise exercise = new DiepLTH2_Exercise();
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
        for (int i =0; i<str.length(); i++){
            String character = String.valueOf(str.charAt(i));
            if (character.equals(character.toUpperCase())&&(!character.equals(" "))){
                System.out.println(character);
            }
        }
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
        // Đếm số lươnng ký tự e trong chuỗi
        int countE = 0;
        for (int i =0; i< str.length(); i++){
            if (str.charAt(i) == 'e'){
                countE +=1;
            }
        }
        System.out.println("Số lượng ký tự e trong chuỗi: "+ countE);
        // 2. Kiểm tra chuỗi có phải bắt đầu bằng "Test" không, nếu đúng in ra true, sai in false
        if (str.substring(0, 3).equals("Test")) {
            System.out.println("true");
        };
        //3. Lấy vị trí của từ "thực" trong chuỗi
        System.out.println("Vị trí của từ 'thực' trong chuỗi: " + str.indexOf("thực"));
        //4. In ra chuỗi đảo ngược của chuỗi trên (Ví dụ: Chuỗi đầu vào là "TestekVN" -> Kết quả: "NVketseT")
        String changeStr ="";
        for (int i = str.length()-1; i>=0; i--){
            changeStr += str.charAt(i);
        }
        System.out.println(changeStr);
    }

    /**
     * 3. Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
     * 1. In ra list theo thứ tự giảm dần.
     * 2. Chỉ ra vị trí số 77 trong list(Array)
     */

    public void findNumber() {
        System.out.println("\nBai 3: ");

        // Implement your code here
        List<Integer> listResult = new ArrayList<>();
        for (int i = 10; i<= 200; i++){
            if (i%7 ==0 && i%5 != 0){
                listResult.add(i);
            }
        }
        Collections.reverse(listResult);
        System.out.println("In ra list theo thứ tự giảm dần: " + listResult);

//         2. Chỉ ra vị trí số "77"
        System.out.println("Vị trí so 77 trong list" + listResult.indexOf(77));
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
        int[][] matrix = new int[N][M];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i< N; i++){
            for (int j = 0; j<M; j++){
                System.out.printf("a[%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Các phần tử của ma trận: ");


        // Print matrix, find max value and index, Implement your code here
        show(matrix);
        int max = matrix[0][0];
        int maxCol = 0;
        int maxRow = 0;
        for (int i = 0; i<N; i++){
            for (int j =0; j<M; j++){
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Print max value and index, Implement your code here
        System.out.println("Số lớn nhất trong ma trận là: " + max);
        System.out.printf("Index của số max là: [%d][%d]", maxRow, maxCol);

        // Print new matrix, Implement your code here
        int[][] newPrimeMatrix = new int[N][M];
        for (int i = 0; i<N; i++){
            for (int j = 0; j<M; j++){
                if (isPrime(matrix[i][j])){
                    newPrimeMatrix[i][j] = matrix[i][j];
                } else {
                    newPrimeMatrix[i][j] = 0;
                }
            }
        }
        System.out.println("Ma trận chứa số nguyên tố: ");
        show(newPrimeMatrix);

        // Sort column of matrix, Implement your code here
        int[] sumCol = new int[M];
        for (int i = 0; i<M; i++){
            for (int j=0; j<(N-1); j++){
                int temp;
                if(matrix[j][i] > matrix[j+1][i]){
                    temp = matrix[j][i];
                    matrix[j][i] = matrix[j+1][i];
                    matrix[j+1][i] = temp;
                }
            }
        }
        System.out.println("Ma trận sau khi sắp xếp cột: ");
        show(matrix);
        // Tính tổng các cột
        System.out.println("Tổng của các cột là: ");
        for (int i = 0; i<M; i++){
            sumCol[i] = 0;
            for (int j = 0; j <N; j++){
                sumCol[i] += matrix[j][i];
            }
            System.out.print(sumCol[i] + " ");
        }

    }

    // check prime number, return true if number is prime
    public boolean isPrime(int number) {
        // Implement your code here
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void show(int[][] arr){
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
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
        int number = sc.nextInt();
        String strOfNum = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i< strOfNum.length(); i++) {
            sum += (strOfNum.charAt(i) - '0');
        }
        System.out.println("Tổng các chữ số là: " + sum);
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
        List<Integer> elementOfPrimeNumber = new ArrayList<>();
        for (int i = 2; i<=number; i++){
            if(isPrime(i) && (number%i == 0)){
                elementOfPrimeNumber.add(i);
                number = number/i;
            }
            if (number==1){
                break;
            }
        }
        // In ra dạng phép nhân thừa số nguyên tố
        String strPrimeNumber = "";
        for (int i = 0; i < elementOfPrimeNumber.size();i++){
            if (elementOfPrimeNumber.size() != 1){
                strPrimeNumber = strPrimeNumber + "x" + String.valueOf(elementOfPrimeNumber.get(i));
            } else {
                strPrimeNumber = String.valueOf(elementOfPrimeNumber.get(i));
            }

        }
        System.out.println(strPrimeNumber);
    }
}
