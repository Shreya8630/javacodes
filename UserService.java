import java.util.List;
public class UserService {
    public static void main(String[] args) {
        UserDao u = new UserDao();
        List<Users> users = u.displayUsers();
        for (Users user : users) {
            System.out.println(user.name);
        }
        System.out.println("Service called");
    }
}
