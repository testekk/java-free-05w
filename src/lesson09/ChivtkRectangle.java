package lesson09;
//Tạo lớp con Rectangle kế thừa từ Shape
public class ChivtkRectangle extends ChivtkShape {
    private double chieuDai, chieuRong;

    //getter va setter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }

    public double getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong = chieuRong;
    }

    //constructor
    public ChivtkRectangle(String color, String name, double chieuDai, double chieuRong){
        this.color = color;
        this.name = name;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    //In thong tin hinh chu nhat
    public void displayInfor(){
        System.out.println("\nThong tin cua hinh chu nhat");
        System.out.println("Mau sac hinh chu nhat: "+getColor());
        System.out.println("Ten hinh chu nhat: "+getName());
        System.out.println("Chieu dai hinh chu nhat: "+getChieuDai());
        System.out.println("Chieu rong hinh chu nhat: "+getChieuRong());
    }

    @Override
    //triển khai phương thức getArea().
    public double getArea(){
        return chieuDai * chieuRong;
    }
}
