package lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VuThiKimChi_CollectionsExercise {
    public static void main(String[] args) {
        VuThiKimChi_CollectionsExercise exercise = new VuThiKimChi_CollectionsExercise();
        exercise.printNumbers();
        exercise.printStrings();
        exercise.sumNumbersList();
        exercise.sumNumbersArray();
        exercise.findPrimeNumbers();
        exercise.fibonacci();
        exercise.sumDivisibleBy3Or5();
    }

    //1. Bài 1: Tạo một danh sách các số nguyên và in ra các phần tử trong danh sách.
    public void printNumbers() {
        System.out.println("\nBài 1: Tạo một danh sách các số nguyên và in ra các phần tử trong danh sách.");

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int listSize = arr.size();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();

        if (n > listSize) {
            System.out.println("Số lượng phần tử n đã nhập vượt quá độ dài của danh sách là " + listSize);
        } else if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên hợp lệ");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Phần tử thứ " + (i + 1) + ": " + arr.get(i));
            }
        }
    }

    //2. Bài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.
    public void printStrings() {
        System.out.println("\nBài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.");

        ArrayList<String> arrStr = new ArrayList<>();
        arrStr.add("Vũ");
        arrStr.add("Thị");
        arrStr.add("Kim");
        arrStr.add("Chi");
        int listSize = arrStr.size();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của danh sách (<= 4 phần tử): ");
        int n = scanner.nextInt();

        if (n > listSize) {
            System.out.println("Số lượng phần tử n đã nhập vượt quá độ dài của danh sách là " + listSize);
        } else if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên hợp lệ");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("Phần tử thứ " + (i + 1) + ": " + arrStr.get(i));
            }
        }
    }

    //3. Bài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.
    public void sumNumbersList() {
        System.out.println("\nBài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.");
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
            sum += numbers.get(i);
        }
//        System.out.println("Tổng các phần tử trong danh sách: " + sum);
    }

    public void sumNumbersArray() {
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            sum += arr[i];
        }
        System.out.println("Tổng các phần tử trong danh sách: " + sum);
    }

    //4. Tìm số nguyên tố trong dãy số cho trước
    public void findPrimeNumbers() {
        System.out.println("\nBài 4: Tìm số nguyên tố trong N số được nhập từ bàn phím.");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                //if (!isPrime(numbers[i]))
                primeNumbers.add(numbers[i]);
            }
        }
        System.out.println(primeNumbers);
    }

    // Kiểm tra số nguyên tố
    private boolean isPrime(int number) {
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

    //5. In ra dãy số Fibonacci đến số thứ N được nhập từ bàn phím và tính tổng của dãy số đó
    public void fibonacci() {
        System.out.println("\nBài 5: In ra dãy số Fibonacci đến số thứ N được nhập từ bàn phím và tính tổng của dãy số đó.");

        List<Integer> fibonacciNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int sumFinal = 0;

        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên hợp lệ");
        } else if (n == 1) {
            fibonacciNumbers.add(0);
//            sum = fibonacciNumbers.get(0);
        } else if (n == 2) {
            fibonacciNumbers.add(0);
            fibonacciNumbers.add(1);
//            sum = fibonacciNumbers.get(0) + fibonacciNumbers.get(1);
        } else { // n > 2
            fibonacciNumbers.add(0);
            fibonacciNumbers.add(1);
            sum = fibonacciNumbers.get(0) + fibonacciNumbers.get(1);
            for (int i = 2; i < n; i++) {
                //fibonacciNumbers.add(fibonacciNumbers.get(i-1)+fibonacciNumbers.get(i-2));
                int nextFib = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2);
                fibonacciNumbers.add(nextFib);
                sum += nextFib;
            }
        }
        System.out.println("Dãy số fibonacci là: " + fibonacciNumbers);
        System.out.println("Tổng của dãy số là: " + sum);
    }

    //6. Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím
    public void sumDivisibleBy3Or5() {
        System.out.println("\nBài 6: Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();

        int sum = 0;
        List<Integer> numbers = new ArrayList<>();

        if (n <= 0) {
            System.out.println("Vui lòng nhập một số nguyên hợp lệ");
        } else {
            for (int i = 1; i <= n; i++) {
                numbers.add(i);
            }
            for (int j = 0; j < n; j++) {
                if ((numbers.get(j) % 3 == 0) || (numbers.get(j) % 5 == 0)) {
                    sum += numbers.get(j);
                }
            }
            System.out.println(numbers);
        }
        System.out.println("Tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến " + n + ": " + sum);
    }
}
