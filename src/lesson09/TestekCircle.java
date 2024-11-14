package lesson09;

public class TestekCircle extends TestekShape{
    private double radius;

    // Tính chất đa hình (polymorphism) : Constructor với 01 tham số
    public TestekCircle(double radius) {
        this.radius = radius;
    }

    // Tính chất đa hình (polymorphism) : Constructor với đầy đủ tham số
    public TestekCircle(String color, String name, double radius) {
        this.color = color;
        this.name = name;
        this.radius = radius;
    }

    // Tính chất đa hình (polymorphism) : Constructor không tham số
    public TestekCircle() {
        this.radius = 1.0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
