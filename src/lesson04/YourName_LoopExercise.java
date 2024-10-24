package lesson04;

public class YourName_LoopExercise {

    public static void main(String[] args) {
        YourName_LoopExercise exercise = new YourName_LoopExercise();
        exercise.printNumbersFor();
        exercise.printNumbersWhile();
        exercise.printNumbersDoWhile();
        exercise.findMaxFor();
        exercise.findMaxWhile();
        exercise.findMaxDoWhile();
        exercise.findMinFor();
        exercise.findMinWhile();
        exercise.findMinDoWhile();
        exercise.sumEvenFor();
        exercise.sumEvenWhile();
        exercise.sumEvenDoWhile();
    }

    //1. Bài 1: In ra các số từ 1 đến 10
    // For loop
    public void printNumbersFor() {
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10:");
        // Implement your code here
    }

    // While loop
    public void printNumbersWhile() {
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10:");
        // Implement your code here
    }

    // Do-While loop
    public void printNumbersDoWhile() {
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10:");
        // Implement your code here
    }

    //2. Bài 2: Tìm số lớn nhất trong một mảng số nguyên
    // For loop
    public void findMaxFor() {
        System.out.println("\n Bài 2: Tìm số lớn nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            // Implement your code here
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    // While loop
    public void findMaxWhile() {
        System.out.println("\n Bài 2: Tìm số lớn nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int max = numbers[0];
        int i = 1;
        while (i < numbers.length) {
            // Implement your code here
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    // Do-While loop
    public void findMaxDoWhile() {
        System.out.println("\n Bài 2: Tìm số lớn nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int max = numbers[0];
        int i = 1;
        do {
            // Implement your code here
        } while (i < numbers.length);
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    //3. Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên
    // For loop
    public void findMinFor() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        // Implement your code here
    }

    // While loop
    public void findMinWhile() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        // Implement your code here
    }

    // Do-While loop
    public void findMinDoWhile() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        // Implement your code here
    }

    //4. Bài 4: Tính tổng các số chẵn trong một mảng số nguyên
    // For loop
    public void sumEvenFor() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        // Implement your code here
    }

    // While loop
    public void sumEvenWhile() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        // Implement your code here
    }

    // Do-While loop
    public void sumEvenDoWhile() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        // Implement your code here
    }
}
