package lesson09;

public class Animal {
    String name;

    // Phuong thuc phat am thanh
    void sound() {
        System.out.println("Animal sound");
    }

    Animal() {
        this.name = "Animal";
    }

    public String getName() {
        return name;
    }
}
