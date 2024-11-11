package lesson08;

public class Person { // Khởi tạo bản vẽ của đối tượng con người: tên, tuổi, giới tính, địa chỉ
    // Có 2 thông tin  bắt buộc mỗi người can phai co
    private String name;    // Tên nguoi
    private int age;        // Tuổi nguoi\

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //
    void eat(String food) {
        System.out.println("I am eating " + food);
    }

    void play() {

    }

    // Method (~hanh vi): access modifier + return type + method name + (parameter list) + {method body}
    public String study() {
        String level = "University";
        System.out.println("I am studying");
        return level;
    }


}
