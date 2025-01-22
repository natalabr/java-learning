
public class Program {
    public static void main(String[] args) {

        UserController userController = new UserController();

        User u = new Employee("Caleb", "Gold");
        //u.setName("Caleb");
        //u.setMembership("Gold");

        User u2 = new Customer("Sally", Membership.SILVER);
        //u2.setName("Sally");
        //u2.setMembership(Membership.SILVER);

        //printUser(u);
        //printUser(u2);

        userController.addUser(u);
        userController.addUser(u2);

        userController.showUsers();
    }

    public static void printUser(User user) {
        System.out.println(String.format("%s - %s", user.getName(), user.getMembership()));
    }
}
