package lesson04;

public class CuongNB_LoopExercise {
    public static void main(String[] args) {
        LeNga_LoopExercise exercise = new LeNga_LoopExercise();
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
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    // While loop
    public void printNumbersWhile() {
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10:");
        int number=1;
        while (number<=10){
            System.out.println(number);
            number++;
        }
    }

    // Do-While loop
    public void printNumbersDoWhile() {
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10:");
        int number=0;
        do{
            number++;
            System.out.println(number);
        }while (number <10);
    }

    //2. Bài 2: Tìm số lớn nhất trong một mảng số nguyên
    // For loop
    public void findMaxFor() {
        System.out.println("\n Bài 2: Tìm số lớn nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int number = numbers[i];
            if(number>max){
                max =number;
            }
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
            int number = numbers[i];
            if(number>max){
                max =number;
            }
            i++;
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
            int number = numbers[i];
            if(number>max){
                max =number;
            }
            i++;
        } while (i < numbers.length);
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    //3. Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên
    // For loop
    public void findMinFor() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int min= numbers[0];
        for (int i=1;i<numbers.length;i++){
            int number = numbers[i];
            if (min > number){
                min = number;
            }
        }
        System.out.println("Số nhor nhất trong mảng là: " + min);
    }

    // While loop
    public void findMinWhile() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int min= numbers[0];
        int i =1;
        while (i<numbers.length){
            int number = numbers[i];
            if (min > number){
                min = number;
            }
            i++;
        }
        System.out.println("Số nhor nhất trong mảng là: " + min);
    }

    // Do-While loop
    public void findMinDoWhile() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int min= numbers[0];
        int i =1;
        do{
            int number = numbers[i];
            if (min > number){
                min = number;
            }
            i++;
        }while (i<numbers.length);
        System.out.println("Số nhor nhất trong mảng là: " + min);
    }

    //4. Bài 4: Tính tổng các số chẵn trong một mảng số nguyên
    // For loop
    public void sumEvenFor() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int sum = 0;
        for (int number : numbers){
            if(number % 2==0){
                sum +=number;
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là: "+ sum);
    }

    // While loop
    public void sumEvenWhile() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int sum = 0,i=0;
        while (i<numbers.length){
            int number = numbers[i];
            if(number % 2==0){
                sum +=number;
            }
            i++;
        }
        System.out.println("Tổng các số chẵn trong mảng là: "+ sum);
    }

    // Do-While loop
    public void sumEvenDoWhile() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên:");
        int[] numbers = {1, 25, 36, 43, 5, 8, 9, 10, 11, 32, 13, 17, 28, 19, 20};
        int sum = 0,i=0;
        do{
            int number = numbers[i];
            if(number % 2==0){
                sum +=number;
            }
            i++;
        }while (i<numbers.length);
        System.out.println("Tổng các số chẵn trong mảng là: "+ sum);
    }

}
