import java.util.ArrayList;

public class UserController {

    private ArrayList<User> _users = new ArrayList<User>();

    public void addUser(User user) {
        _users.add(user);
    }

    public void showUsers() {
        for (User user : _users) {
            System.out.println(user.toString());
        }
    }
}
