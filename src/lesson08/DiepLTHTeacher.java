package lesson08;

public class DiepLTHTeacher {
    String name;
    String subject;
    int teacherId;


    public DiepLTHTeacher(String name, String subject, int teacherId){
        this.name = name;
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    public int getTeacherId(){
        return teacherId;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setTeacherId(int teacherId){
        this.teacherId = teacherId;
    }
    public void displayTeacher(){
        System.out.println("Tên: " + getName());
        System.out.println("Môn học: " + getSubject());
        System.out.println("ID: " + getTeacherId());
    }
    public static void main(String[] args) {
        DiepLTHTeacher testcherA = new DiepLTHTeacher("Mai Thị A", "Toán", 12345);
        testcherA.displayTeacher();
    }
}
