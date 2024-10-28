package lesson04;

public class AnhThai_LoopExercise {
    public static void main(String[] args) {
        AnhThai_LoopExercise exercise = new AnhThai_LoopExercise();
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
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10 (For loop):");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    // While loop
    public void printNumbersWhile() {
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10 (While loop):");
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }

    // Do-While loop
    public void printNumbersDoWhile() {
        System.out.println("\n Bài 1: In ra các số từ 1 đến 10 (Do ... While loop:");
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i <= 10);
    }

    //2. Bài 2: Tìm số lớn nhất trong một mảng số nguyên
    // For loop
    public void findMaxFor() {
        System.out.println("\n Bài 2: Tìm số lớn nhất trong một mảng số nguyên (For loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("Gia tri max: " + max);
    }

    // While loop
    public void findMaxWhile() {
        System.out.println("\n Bài 2: Tìm số lớn nhất trong một mảng số nguyên (While loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int max = numbers[0];
        int i = 1;
        while(i < numbers.length) {
            if(max < numbers[i]){
                max = numbers[i];
            }
            i++;
        }
        System.out.println("Gia tri lon nhat: "+max);
    }

    // Do-While loop
    public void findMaxDoWhile() {
        System.out.println("\n Bài 2: Tìm số lớn nhất trong một mảng số nguyên (Do ... while loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int max = numbers[0];
        int i = 1;
        do {
            max = Math.max(max, numbers[i]);
            i++;
        } while (i < numbers.length);
        System.out.println("Gia tri max: " + max);
    }

    //3. Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên
    // For loop
    public void findMinFor() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên (For loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            min = Math.min(min, numbers[i]);
        }
        System.out.println("Gia tri min: "+min);
    }

    // While loop
    public void findMinWhile() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên (While loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int min = numbers[0];
        int i = 0;

        while (i < numbers.length){
            min = Math.min(min, numbers[i]);
            i++;
        }
        System.out.println("Gia tri min: "+min);
    }

    // Do-While loop
    public void findMinDoWhile() {
        System.out.println("\n Bài 3: Tìm số nhỏ nhất trong một mảng số nguyên (o ... While loop)");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int min = numbers[0];
        int i = 0;

        do{
            min = Math.min(min, numbers[i]);
            i++;
        }
        while (i < numbers.length);
        System.out.println("Gia tri min: "+min);
    }

    //4. Bài 4: Tính tổng các số chẵn trong một mảng số nguyên
    // For loop
    public void sumEvenFor() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên (For loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int sum = 0;

        for(int i =0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                sum += numbers[i];
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là: "+sum);
    }

    // While loop
    public void sumEvenWhile() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên (hile loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int sum = 0;
        int i = 0;

        while (i < numbers.length){
            if(numbers[i] % 2 == 0){
                sum += numbers[i];
            }
            i++;
        }
        System.out.println("Tong cac so chan: "+sum);
    }

    // Do-While loop
    public void sumEvenDoWhile() {
        System.out.println("\n Bài 4: Tính tổng các số chẵn trong một mảng số nguyên (Do ...While loop):");
        int[] numbers = {1, 3, 5, 7, 5, 8, 9, 10, 11, 33, 13, 17, 28, 19, 44};
        int sum = 0;
        int i = 0;

        do{
            if(numbers[i] % 2 == 0){
                sum += numbers[i];
            }
            i++;
        }
        while(i < numbers.length);
        System.out.println("Tong cac so chan: "+sum);
    }
}
