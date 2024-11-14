package lesson08;

public class DiepLTHStudent {
    // Implement your code here
    String name;
    int age;
    int studentID;

    public DiepLTHStudent(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentID());
    }
    public static void main(String[] args) {
        // Implement your code here
        DiepLTHStudent diep = new DiepLTHStudent("James", 20, 1);
        diep.display();
    }
}
