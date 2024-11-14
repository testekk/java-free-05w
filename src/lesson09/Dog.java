package lesson09;

public class Dog extends Animal {
    private int age = 10;
    // Phuong thuc phat am thanh
    @Override
    void sound() {
        System.out.println("Gau gau");
    }

    Dog() {
        super();
        this.age = 16;
    }

    public void sound(String sound) {
        System.out.println(sound);
    }

    public void sound(String sound, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(sound);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
