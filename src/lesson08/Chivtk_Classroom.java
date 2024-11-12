package lesson08;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Chivtk_Classroom {
    //Tạo một lớp Classroom với các thuộc tính: className, students (danh sách sinh viên), teacher.
    private String className;
    private List<Chivtk_Student> students;
    private Chivtk_Teacher teacher;

    //Tạo các phương thức getter và setter cho các thuộc tính.
    public String getClassname(){
        return className;
    }

    public void setClassname(String className){
        this.className = className;
    }

    public List<Chivtk_Student> getStudents(){
        return students;
    }

    public void setStudents(List<Chivtk_Student> students){
        this.students = new ArrayList<>();
    }

    public Chivtk_Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Chivtk_Teacher teacher){
        this.teacher = teacher;
    }

    //Tạo contructor: Phương thức khởi tạo ra đối tượng
    public Chivtk_Classroom(String className, Chivtk_Teacher teacher){
        this.className = className;
        this.students = new ArrayList<>();
        this.teacher = teacher;
    }

    //Tạo phương thức displayClassInfo để hiển thị thông tin của lớp học, bao gồm thông tin giáo viên và danh sách sinh viên.
    public void displayClassInfo(){
        System.out.println("Thông tin của lớp học "+getClassname());
//        System.out.println("Thông tin của lớp học "+getTeacher());
        System.out.println("Thông tin của giáo viên");
        teacher.displayInfo();
//        System.out.println("Danh sách sinh viên"+getStudents());
        for(Chivtk_Student student : students){
            student.displayInfo();
        }
    }

    // Thêm sinh viên vào danh sách
    public void addStudent(Chivtk_Student student){
        students.add(student);
    }

    public static void main(String[] args) {
        //Thực hiện tạo 01 lớp học và hiển thị thông tin của lớp học đó.
        Chivtk_Teacher teacher = new Chivtk_Teacher("Nguyen Van A", "Toán", "GV001");

        Chivtk_Student student1 = new Chivtk_Student("Vũ Thị Kim Chi", 18, "SV001");
        Chivtk_Student student2 = new Chivtk_Student("lưu Chấn Nam", 19, "SV002");

        Chivtk_Classroom classroom = new Chivtk_Classroom("lớp K21HTTTA", teacher);
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.displayClassInfo();
    }
}
