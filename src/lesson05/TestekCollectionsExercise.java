package lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestekCollectionsExercise {
    public static void main(String[] args) {
        TestekCollectionsExercise exercise = new TestekCollectionsExercise();
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Danh sách các phần tử trong danh sách: ");
    }

    //2. Bài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.
    public void printStrings() {
        System.out.println("\nBài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        System.out.println("Danh sách các phần tử trong danh sách: ");
    }

    //3. Bài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.
    public void sumNumbersList() {
        System.out.println("\nBài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += numbers.get(i);
        }
        System.out.println("Tổng các phần tử trong danh sách: " + sum);
    }

    public void sumNumbersArray() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i;
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += numbers[i];
        }
        System.out.println("Tổng các phần tử trong danh sách: " + sum);
    }

    //4. Tìm số nguyên tố trong N số được nhập từ bàn phím
    public void findPrimeNumbers() {
        System.out.println("\nBài 4: Tìm số nguyên tố trong N số được nhập từ bàn phím.");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        List<Integer> primeNumbers = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                count++;
                primeNumbers.add(numbers[i]);
            }
        }
        System.out.println("Số lượng số nguyên tố trong danh sách: " + count);
        System.out.println("Danh sách các số nguyên tố trong danh sách: ");
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        // Sử dụng foreach
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
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
        int a = 0, b = 1;
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);

        System.out.println("Dãy số Fibonacci đến số thứ " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            fibonacciNumbers.add(c);
        }
        int sum = 0;
        for (int number : fibonacciNumbers) {
            sum += number;
        }
        System.out.println("\nTổng của dãy số Fibonacci đến số thứ " + n + ": " + sum);
    }

    //6. Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím
    public void sumDivisibleBy3Or5() {
        System.out.println("\nBài 6: Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến " + n + ": " + sum);
    }
}