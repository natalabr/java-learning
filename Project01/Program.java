import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        UserController userController = new UserController();

        IUser u = new Employee("Caleb", "Gold");
        u.setAge(LocalDate.of(1979, 1, 8));
        //u.setName("Caleb");
        //u.setMembership("Gold");

        IUser u2 = new Customer("Sally", Membership.SILVER);
        //u2.setName("Sally");
        //u2.setMembership(Membership.SILVER);

        IUser u3 = new God();

        //printUser(u);
        //printUser(u2);

        userController.addUser(u);
        userController.addUser(u2);
        userController.addUser(u3);

        userController.showUsers();
    }

   /* public static void printUser(User user) {
        System.out.println(String.format("%s - %s", user.getName(), user.getMembership()));
    }*/
}
