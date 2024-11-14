package lesson09;

public class Cat extends Animal {
    Cat(){}

    Cat(String name){
        this.name = name;
    }

    Cat(String name, int age){
        this.name = name;
    }

    // Phuong thuc phat am thanh
    @Override
    void sound() {
        System.out.println("Meo meo");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
