package lesson08;

import java.util.*;

public class Chivtk_Student {
    //Tạo một lớp Student với các thuộc tính: name, age, studentId.
    private String name;
    private int age;
    private String studentId;

    //Tạo các phương thức getter và setter cho các thuộc tính.
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    //Tạo contructor: Phương thức khởi tạo ra đối tượng
    public Chivtk_Student(String name, int age, String studentId){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    //Tạo phương thức displayInfo để hiển thị thông tin của sinh viên.
    public void displayInfo(){
        System.out.println("Thông tin của sinh viên");
        System.out.println("- Mã sinh viên: "+getStudentId());
        System.out.println("- Tên sinh viên: "+getName());
        System.out.println("- Tuổi sinh viên: "+getAge());
    }

    //Thực hiện tạo 01 sinh viên và hiển thị thông tin của sinh viên đó.
    public static void main(String[] args) {
        Chivtk_Student student = new Chivtk_Student("Vũ Kim Chi", 18, "SV001");
        student.displayInfo();
    }
}
