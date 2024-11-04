package lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeNga_CollectionsExercise {
    public static void main(String[] args) {
        LeNga_CollectionsExercise exercise = new LeNga_CollectionsExercise();
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

        if(n>0) {

            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " của danh sách: ");
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Các phần tử trong danh sách là:");
            for (int number : numbers) {
                System.out.println(number);
            }
        }else {
            System.out.print("Số phần tử phải lớn hơn 0");
        }
    }

    //2. Bài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.
    public void printStrings() {
        System.out.println("\nBài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n>0) {

            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println(" Nhập vào phần tử thứ " + (i + 1) + ": ");
                stringArray[i] = scanner.nextLine();
            }

            System.out.println("Các phần tử trong danh sách là:");
            for (String element : stringArray) {
                System.out.println(element);
            }
        }else {
            System.out.print("Số phần tử phải lớn hơn 0");
        }
    }

    //3. Bài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.
    public void sumNumbersList() {
        System.out.println("\nBài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        int sum=0;
        for (int number:numbers){
            sum +=number;
        }
        System.out.println("Tổng dãy số trên là: "+sum);
    }

    public void sumNumbersArray() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i;
        }

        int sum=0;
        for (int number:numbers){
            sum +=number;
        }
        System.out.println("Tổng dãy số trên là: "+sum);
    }

    //4. Tìm số nguyên tố trong dãy số cho trước
    public void findPrimeNumbers() {
        System.out.println("\nBài 4: Tìm số nguyên tố trong N số được nhập từ bàn phím.");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        List<Integer> primeNumbers = new ArrayList<>();
        System.out.println("Dãy số nguyên tố là: ");
        for (int number: numbers) {
            if (isPrime(number)){
                primeNumbers.add(number);
            }
        }
        System.out.println("Các số nguyên tố trong dãy trên là:");
        for (int primeNumber:primeNumbers) {
            System.out.println(primeNumber);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();

        if (n>0) {
            List<Integer> fibonacciNumbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i < 2) {
                    fibonacciNumbers.add(i);
                } else {
                    fibonacciNumbers.add(fibonacciNumbers.get(i - 2) + fibonacciNumbers.get(i - 1));
                }
            }
            System.out.println("Kết quả là:");
            int sum = 0;
            for (int fibonacciNumber : fibonacciNumbers) {
                System.out.println(fibonacciNumber);
                sum +=fibonacciNumber;
            }
            System.out.println("Tổng của dãy số Fibonaci đến số N đã nhập là: "+sum);
        }else {
            System.out.print("Số phần tử phải lớn hơn 0");
        }
    }

    //6. Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím
    public void sumDivisibleBy3Or5() {
        System.out.println("\nBài 6: Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        if(n>0) {
            int sum = 0;
            System.out.println("Những số chia hết cho 3 hoặc 5 là: ");
            for (int i = 0; i < n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    System.out.println(i);
                    sum +=i;
                }
            }
            System.out.println("Tổng các số chia hết cho 3 hoặc 5 của dãy trên là: "+sum);
        }else {
            System.out.print("Số phần tử phải lớn hơn 0");
        }
    }
}
