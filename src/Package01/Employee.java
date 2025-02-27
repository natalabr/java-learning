package Package01;

public class Employee extends User implements IUser {

    public Employee(String name, String membership) {
        super(name, membership);
    }

    public Employee(String name, Membership membership) {
        super(name, membership);
    }

    public String hello() {
        return String.format("Package01.Employee: %s - %s, %s years old", getName(), getMembership(), age);
    }
}
