package lesson08;

public class TestekTeacher extends Person {
    private String subject;     // Môn học
    private String teacherId;   // Mã giáo viên

    // Constructor
    public TestekTeacher(String name, String subject, String teacherId) {
        super(name);
        this.subject = subject;
        this.teacherId = teacherId;
    }

    // Constructor không tham số
    public TestekTeacher() {
    }

    // Get Subject
    public String getSubject() {
        return subject;
    }

    // Set Subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Get Teacher ID
    public String getTeacherId() {
        return teacherId;
    }

    // Set Teacher ID
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        String info = "\tTestekTeacher{" +
                "name='" + getName() + '\'' +
                ", subject='" + subject + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
        System.out.println(info);
    }

    public static void main(String[] args) {
        TestekTeacher teacher = new TestekTeacher("Vincent T", "Testing", "Testek001");
        teacher.displayInfo();
    }
}
