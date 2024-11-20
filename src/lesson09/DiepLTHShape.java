package lesson09;

public abstract class DiepLTHShape {
    protected String name;
    protected String color;

    public DiepLTHShape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public abstract double getArea();
    public String getInfo(){
        return "Name: " + name + ", Color: " + color;
    }
}
