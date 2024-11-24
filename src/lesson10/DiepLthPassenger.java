package lesson10;

public class DiepLthPassenger {
    private int id;
    private String name;
    private String address;
    private String phone;

    public DiepLthPassenger(String name, int id, String address, String phone) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printPassenger(){
        System.out.println("Passenger ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
    }


}
