package lesson08;

public class Chivtk_Teacher {
    //Tạo một lớp Teacher với các thuộc tính: name, subject, teacherId.
    private String name, subject, teacherId;

    //Tạo các phương thức getter và setter cho các thuộc tính.
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getTeacherId(){
        return teacherId;
    }

    public void setTeacherId(String teacherId){
        this.teacherId = teacherId;
    }

    //Tạo constructor : Phương thức khởi tạo ra đối tượng
    public Chivtk_Teacher(String name, String subject, String teacherId){
        this.name = name;
        this.subject = subject;
        this.teacherId = teacherId;
    }

    //Tạo phương thức displayInfo để hiển thị thông tin của giáo viên.
    public void displayInfo(){
        System.out.println("Thông tin của giáo viên");
        System.out.println("- Mã giáo viên: "+getTeacherId());
        System.out.println("- Tên giáo viên: "+getName());
        System.out.println("- Môn dạy: "+getSubject());
    }

    public static void main(String[] args) {
        Chivtk_Teacher teacher = new Chivtk_Teacher("Kiểu Ngọc Yến Linh", "Tiếng Nhật", "GV001");
        teacher.displayInfo();
    }
}
