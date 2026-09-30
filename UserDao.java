import java.util.ArrayList;
import java.util.List;
public class UserDao {
    public List<Users> displayUsers() {
        Users user1 = new Users(1, "Shreya", "Pune");
        Users user2 = new Users(2, "Riya", "Mumbai");
        // System.out.println(user1);
        // System.out.println(user2);
        List<Users> List = new ArrayList<Users>();
        List.add(user1);
        List.add(user2);
        return List;
    }
}
