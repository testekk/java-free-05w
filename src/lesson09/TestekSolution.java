package lesson09;

public class TestekSolution {
    public static void main(String[] args) {
        // region Bài 01
        /**
         *   1. Tạo một lớp trừu tượng Shape với phương thức trừu tượng getArea().
         *    2. Tạo các lớp con Circle và Rectangle kế thừa từ Shape và triển khai phương thức getArea().
         *    3. Tạo một đối tượng Circle và một đối tượng Rectangle, gọi phương thức getArea() để tính diện tích của hình tròn và hình chữ nhật.
         */

        // Tạo một đối tượng Circle
        TestekShape circle = new TestekCircle(5.0);
        System.out.println("Circle: " + circle.getArea());

        // Tạo một đối tượng Rectangle
        TestekShape rectangle = new TestekRectangle(5.0, 10.0);
        System.out.println("Rectangle: " + rectangle.getArea());



        //region Bài 02
        // Tính chất đa hình (polymorphism) : Constructor với 01 tham số
        TestekCircle circle1 = new TestekCircle(5.0);
        System.out.println("Circle 1: " + circle1.getArea());

        // Tính chất đa hình (polymorphism) : Constructor với đầy đủ tham số
        TestekCircle circle2 = new TestekCircle("Red", "Circle 2", 10.0);
        System.out.println("Circle 2: " + circle2.getArea());

        // Tính chất đa hình (polymorphism) : Constructor không tham số
        TestekCircle circle3 = new TestekCircle();
        System.out.println("Circle 3: " + circle3.getArea());
        //endregion

        TestekRectangle rectangle1 = new TestekRectangle(5.0, 10.0);
        System.out.println("Rectangle 1: " + rectangle1.getArea());

        TestekRectangle rectangle2 = new TestekRectangle("Blue", "Rectangle 2", 10.0, 20.0);
        System.out.println("Rectangle 2: " + rectangle2.getArea());

        TestekRectangle rectangle3 = new TestekRectangle();
        System.out.println("Rectangle 3: " + rectangle3.getArea());
        //endregion
    }
}
