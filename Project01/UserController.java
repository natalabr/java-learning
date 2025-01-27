import java.util.ArrayList;

public class UserController {

    private ArrayList<IUser> _users = new ArrayList<IUser>();

    public void addUser(IUser user) {
        _users.add(user);
    }

    public void showUsers() {
        for (IUser user : _users) {
            System.out.println(user.hello());
        }
    }
}
