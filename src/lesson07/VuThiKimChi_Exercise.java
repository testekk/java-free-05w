package lesson07;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VuThiKimChi_Exercise {
    public static void main(String[] args) {
        VuThiKimChi_Exercise exercise = new VuThiKimChi_Exercise();
//        exercise.printUpperCase();
//        exercise.stringExercise();
//        exercise.findNumber();
//        exercise.matrix();
        exercise.sumNumber();
//        exercise.primeNumber();
    }

    //1. Nhập một chuỗi từ bàn phím và in ra số lượng ký tự viết hoa. Ví dụ: TestekVN -> In ra 3 (T, V, N)
    public void printUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        String str = sc.nextLine();

        System.out.printf("Your string: %s\n", str);
        // Implement your code here
        // Biến để đếm số lượng ký tự viết hoa
        int upperCaseCount = 0;

        // Vòng lặp để duyệt từng ký tự trong chuỗi
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                upperCaseCount++;
                System.out.println("Các ký tự viết hoa trong chuỗi: "+str.charAt(i));
            }
        }
        System.out.println("\nSố lượng ký tự viết hoa trong chuỗi: "+upperCaseCount);
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

        //1. Đếm số lượng ký tự e trong chuỗi
        // Đếm ký tự e
        int countE = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                countE++;
            }
        }
        System.out.println("Số lượng ký tự e trong chuỗi: "+countE);

        //2. Kểm tra chuỗi có phải bắt đầu bằng "Test" không, nếu đúng in ra true, sai in false
        boolean isTest;
        String test = "Test";
        int n = test.length();
//        System.out.println("Số lượng ký tự trong chuỗi Test: "+n);
        String l = str.substring(0, n);
        if(l.equals("Test")){
            isTest = true;
        }
        else{
            isTest = false;
        }
        System.out.println("Chuỗi có phải bắt đầu bằng \"Test\" hay không: "+isTest);

        //3. Lấy vị trí của từ "thực" trong chuỗi
        int k = str.indexOf("thực");
        if(k != -1){
            System.out.println("Vị trí của từ \"thực\" trong chuỗi là "+k);
        }
        else {
            System.out.println("Không tìm thấy vị trí của từ \"thực\" trong chuỗi " + str);
        }

        //4. In ra chuỗi đảo ngược của chuỗi trên (Ví dụ: Chuỗi đầu vào là "TestekVN" -> Kết quả: "NVketseT")
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap chuoi: ");
        String string = "TestekVN";

        List<Character> arrStr = new ArrayList<>();
        int doDai = string.length();
        System.out.println(n);
        for(int i = (doDai-1); i >=0; i--){
            arrStr.add(string.charAt(i));
        }
        System.out.println(arrStr);
    }

    /**
     * 3. Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
     * 1. In ra list theo thứ tự giảm dần.
     * 2. Chỉ ra vị trí số 77 trong list(Array)
     */

    public void findNumber() {
        System.out.println("\nBai 3: ");

        // Implement your code here
        List<Integer> arr = new ArrayList<>();
        for(int i = 200; i >= 10; i--){
            if((i % 7 == 0) && (i % 5 !=0)){
                arr.add(i);
            }
        }
        System.out.println("Các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200 và theo thứ tự giảm dần là: ");
        System.out.println(arr);

        //Chỉ ra vị trí số 77 trong list(Array)
        System.out.println("Vị trí số 77 trong list: "+arr.indexOf(77));

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
        int n = sc.nextInt();
        int sum = 0;
        String strN = Integer.toString(n);
        int doDaiN = strN.length();
//        System.out.println(doDaiN);
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < doDaiN; i++){
            // arr.add(Character.getNumericValue(strN.charAt(i)));
            arr.add(strN.charAt(i) - '0'); //chuyển char -> string và - '0' để thành kiểu Integer
            sum += arr.get(i);
        }
//        System.out.println(arr);
        System.out.println("Tổng các chữ số của số nguyên "+n+" là: "+sum);
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
