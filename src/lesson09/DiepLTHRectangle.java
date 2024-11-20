package lesson09;

public class DiepLTHRectangle extends DiepLTHShape{
    private double width;
    private double height;

    public DiepLTHRectangle(String name, String color, double w, double h){
        super(name, color);
        this.width = w;
        this.height = h;
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String getInfo(){
        return super.getInfo();
    }
}
