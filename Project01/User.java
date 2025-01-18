import java.lang.reflect.Member;

public class User {

    private String _name;
    private String _membership;
    public int age;

    public User(String name, String membership) {
        setName(name);
        setMembership(membership);
    }

    public User(String name, Membership membership) {
        this(name, membership.toString());
        //setName(name);
        //setMembership(membership);
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        _name = name;
    }

    public String getMembership() {
        return _membership;
    }

    public void setMembership(String membership) {
        _membership = membership;
    }

    public void setMembership(Membership membership) {
        _membership = membership.toString();
    }
}
