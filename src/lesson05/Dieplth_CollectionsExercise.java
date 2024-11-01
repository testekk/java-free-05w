package lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dieplth_CollectionsExercise {
    public static void main(String[] args) {
        Dieplth_CollectionsExercise exercise = new Dieplth_CollectionsExercise();
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
        List<Integer> listInteger = new ArrayList<>();
        for (int i=1; i<=n; i++){
            Scanner scannerElement = new Scanner(System.in);
            System.out.println("Nhập phần tử thứ " + i + " vào danh sách: ");
            int element = scannerElement.nextInt();
            listInteger.add(element);
        }
        for (int element : listInteger) {
            System.out.println(element);
        }

    }

    //2. Bài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.
    public void printStrings() {
        System.out.println("\nBài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của danh sách: ");
        int n = scanner.nextInt();
        // Implement your code here
        List<String> listString = new ArrayList<>();
        for (int i=1; i<=n; i++){
            Scanner scannerElement = new Scanner(System.in);
            System.out.println("Nhập phần tử thứ " + i + " vào danh sách: ");
            String element = scannerElement.nextLine();
            listString.add(element);
        }
        for (String element : listString) {
            System.out.println(element);
        }
    }

    //3. Bài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.
    public void sumNumbersList() {
        System.out.println("\nBài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        // Implement your code here
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public void sumNumbersArray() {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i;
        }

        // Implement your code here
        int sum = 0;
        for (int i = 0; i< numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    //4. Tìm số nguyên tố trong dãy số cho trước
    public void findPrimeNumbers() {
        System.out.println("\nBài 4: Tìm số nguyên tố trong N số được nhập từ bàn phím.");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        List<Integer> primeNumbers = new ArrayList<>();
        // Implement your code here
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i]) == true) {
                primeNumbers.add(numbers[i]);
            };
        }
        for (int primeNumber : primeNumbers) {
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
        List<Integer> fibonacciNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        // Implement your code here
        List<Integer> fibonacci = new ArrayList<>();
        if(n==1){
            fibonacci.add(0);
        } else if (n==2) {
            fibonacci.add(0);
            fibonacci.add(1);
        } else if (n>2){
            fibonacci.add(0);
            fibonacci.add(1);
            int i = 1;
            while (fibonacci.size() <= (n-1)){
                fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i));
                i++;
            }
        } else {
            System.out.println("Vui lòng nhập số lớn hơn 0");
        }
        for(int fibonaci : fibonacci){
            System.out.println(fibonaci);
     }
    }

    //6. Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím
    public void sumDivisibleBy3Or5() {
        System.out.println("\nBài 6: Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        // Implement your code here
        List<Integer> listNumber = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            listNumber.add(i);
        };
        int sum = 0;
        for (int number : listNumber) {
            if ((number%3 ==0) || (number %5 ==0)){
                sum += number;
            };
        }
        System.out.println(sum);

    }
}
