package lesson08;

import java.util.ArrayList;
import java.util.List;

public class DiepLTHClassroom {
    // Implement your code here
    String className;
    List<DiepLTHStudent> students;
    String teachers;

    public DiepLTHClassroom(String className, List<DiepLTHStudent> students, String teachers){
        this.className = className;
        this.students = students;
        this.teachers = teachers;
    }
    public String getClassName(){
        return className;
    }
    public List<DiepLTHStudent> getStudents(){
        return students;
    }
    public String getTeachers(){
        return teachers;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setStudents(List<DiepLTHStudent> students) {
        this.students = students;
    }
    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }
    public void display(){
        System.out.println("Class: " + getClassName());
        System.out.println("Students: " );
        for (DiepLTHStudent s : students){
            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge() + ", ID: " + s.getStudentID());
        }
        System.out.println("Teachers: " + getTeachers());

    }
    public static void main(String[] args) {
        // Implement your code here
        DiepLTHStudent student1 = new DiepLTHStudent("A", 20, 1);
        DiepLTHStudent student2 = new DiepLTHStudent("B", 20, 2);
        DiepLTHStudent student3 = new DiepLTHStudent("C", 20, 3);
        List<DiepLTHStudent> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        DiepLTHClassroom classroom = new DiepLTHClassroom("Lớp Mầm", students, "Hồng Vân");
        classroom.display();
    }
}
