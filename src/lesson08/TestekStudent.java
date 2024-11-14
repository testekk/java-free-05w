package lesson08;

public class TestekStudent extends Person {
    private String studentId;   // Mã sinh viên

    // Constructor
    public TestekStudent(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Constructor không tham số
    public TestekStudent() {}

    // Constructor với 1 tham số, sau đó người dùng có thể gọi setter để thiết lập giá trị cho các thuộc tính còn lại
    public TestekStudent(String name) {
        super(name);
    }

    // Get Student ID
    public String getStudentId() {
        return studentId;
    }

    // Set Student ID
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        String info = "\tTestekStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId='" + studentId + '\'' +
                '}';
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "TestekStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TestekStudent student = new TestekStudent("Nguyen Van A", 20, "B20DCCN001");
        student.displayInfo();
    }
}