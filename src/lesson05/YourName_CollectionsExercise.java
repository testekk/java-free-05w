package lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YourName_CollectionsExercise {
    public static void main(String[] args) {
        YourName_CollectionsExercise exercise = new YourName_CollectionsExercise();
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
        // Implement your code here
    }

    //2. Bài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.
    public void printStrings() {
        System.out.println("\nBài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();
        // Implement your code here
    }

    //3. Bài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.
    public void sumNumbersList() {
        System.out.println("\nBài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        // Implement your code here
    }

    public void sumNumbersArray() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i;
        }

        // Implement your code here
    }

    //4. Tìm số nguyên tố trong dãy số cho trước
    public void findPrimeNumbers() {
        System.out.println("\nBài 4: Tìm số nguyên tố trong N số được nhập từ bàn phím.");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        List<Integer> primeNumbers = new ArrayList<>();
        // Implement your code here
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
        // Implement your code here
    }

    //6. Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím
    public void sumDivisibleBy3Or5() {
        System.out.println("\nBài 6: Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        // Implement your code here
    }
}
