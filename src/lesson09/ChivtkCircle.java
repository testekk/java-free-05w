package lesson09;
//Tạo các lớp con Circle kế thừa từ Shape
public class ChivtkCircle extends ChivtkShape{
    private double R;
    private double a; //ban truc chinh cua eclip
    private double b; //ban truc phu cua eclip
    boolean isEclipse;

    //constructor voi 1 tham so
//    public ChivtkCircle(double R){
//        this.R = R;
//    }

    //constructor khong tham so
//    public ChivtkCircle(){
//        this.R = 1.0;
//    }

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

    public double getR(){
        return R;
    }
    public void setR(String R){
        this.color = color;
    }

    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }

    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }

    public boolean getIseclipse(){
        return isEclipse;
    }
    public void setIseclipe(boolean isEclipse){
        this.isEclipse = isEclipse;
    }

    //constructor voi day du tham so
    public ChivtkCircle(String color, String name, double R, double a, double b){
        this.R = R;
        this.color = color;
        this.name = name;
        this.a = a;
        this.b = b;
//        this.isEclipse = isEclipse;
    }

    public boolean isEclipse(){
        if(a != b){
            return true;
        }
        else{
            return false;
        }
    }

    //Thong tin cua hinh tron:
    public void displayInfo(){
        System.out.println("Thong tin cua hinh tron");
        System.out.println("Mau sac: "+getColor());
        System.out.println("Ten hinh tron: "+getName());
        System.out.println("Ban kinh hinh tron: "+getR());
        System.out.println("Ban kinh truc chinh cua hinh tron: "+getA());
        System.out.println("Ban kinh truc phu cua hinh tron: "+getB());
        System.out.println("Day co phai hinh eclipse khong: "+getIseclipse());
    }

    //Triển khai phương thức getArea()
    @Override
    public double getArea(){
        return Math.PI * Math.pow(R, 2);
    }
}
