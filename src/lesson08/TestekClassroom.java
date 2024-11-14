package lesson08;

import java.util.List;

public class TestekClassroom {
    private String className;
    private List<TestekStudent> students;
    private TestekTeacher teacher;

    // Constructor
    public TestekClassroom(String className, List<TestekStudent> students, TestekTeacher teacher) {
        this.className = className;
        this.students = students;
        this.teacher = teacher;
    }

    // Getter và Setter
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<TestekStudent> getStudents() {
        return students;
    }

    public void setStudents(List<TestekStudent> students) {
        this.students = students;
    }

    public TestekTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(TestekTeacher teacher) {
        this.teacher = teacher;
    }

    // Phương thức hiển thị thông tin lớp học
    public void displayClassInfo() {
        System.out.println("Class Name: " + className);
        System.out.println("Teacher Info:\t");
        teacher.displayInfo();
        System.out.println("Students Info:");
        for (TestekStudent student : students) {
            student.displayInfo();
        }
    }

    public static void main(String[] args) {
        TestekTeacher teacher = new TestekTeacher("Vincent T", "Testing", "Testek001");
        TestekStudent student1 = new TestekStudent("Lan", 20, "Testek001");
        TestekStudent student2 = new TestekStudent("Huệ", 22, "Testek002");
        TestekStudent student3 = new TestekStudent("Hằng", 21, "Testek003");
        TestekClassroom classroom = new TestekClassroom("TestekVN - Testing", List.of(student1, student2, student3), teacher);
        System.out.println("This is my classroom:");
        classroom.displayClassInfo();
    }
}
