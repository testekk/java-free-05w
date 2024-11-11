package lesson08;

public class Tester extends Person {
    private String testingRole;

    public Tester(String name, int age, String testingRole) {
        super(name, age);
        this.testingRole = testingRole;
    }

    public String getRole() {
        return testingRole;
    }

    public void setRole(String testingRole) {
        this.testingRole = testingRole;
    }
}
