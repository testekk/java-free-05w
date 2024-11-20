package lesson09;

public class DiepLTHCircle extends DiepLTHShape {
    private double radius;
    private boolean isEclipse;

    public DiepLTHCircle(String name, String color, double radius, boolean isEclipse){
        super(name, color);
        this.radius= radius;
        this.isEclipse = isEclipse;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", Is Eclipse: " + isEclipse;
    }
}
