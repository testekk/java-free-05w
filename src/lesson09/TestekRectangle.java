package lesson09;

// Lớp con Rectangle
public class TestekRectangle extends TestekShape {
    private double width;
    private double height;

    // Tính chất đa hình (polymorphism) : Constructor với 02 tham số
    public TestekRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Tính chất đa hình (polymorphism) : Constructor không tham số
    public TestekRectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Tính chất đa hình (polymorphism) : Constructor với đầy đủ tham số
    public TestekRectangle(String color, String name, double width, double height) {
        this.color = color;
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}