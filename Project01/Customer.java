public class Customer extends User {

    public Customer(String name, String membership) {
        super(name, membership);
    }

    public Customer(String name, Membership membership) {
        super(name, membership);
    }
}
