
public class Program {
    public static void main(String[] args) {

        User u = new User("Caleb", "Gold");
        //u.setName("Caleb");
        //u.setMembership("Gold");

        User u2 = new User("Sally", Membership.SILVER);
        //u2.setName("Sally");
        //u2.setMembership(Membership.SILVER);

        printUser(u);
        printUser(u2);
    }

    public static void printUser(User user) {
        System.out.println(String.format("%s - %s", user.getName(), user.getMembership()));
    }
}
