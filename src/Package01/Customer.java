package Package01;

public class Customer extends User implements IUser{

    public Customer(String name, String membership) {
        super(name, membership);
    }

    public Customer(String name, Membership membership) {
        super(name, membership);
    }

    public String hello() {
        return String.format("Package01.Customer: %s - %s", getName(), getMembership());
    }
}
