package lesson09;

public class Solution {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        System.out.println("Name: " + dog.getName());


        Currency usd = new USD();
        usd.displayCurrency();

        Currency eur = new EUR();
        eur.displayCurrency();
    }
}
