public class Employee extends User {

    public Employee(String name, String membership) {
        super(name, membership);
    }

    public Employee(String name, Membership membership) {
        super(name, membership);
    }
}
