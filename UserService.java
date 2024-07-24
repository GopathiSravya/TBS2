import java.util.ArrayList;
import java.util.List;

public class UserService {
    public List<User>users=new ArrayList<>();
    public void addUser(User user){
        users.add(user);
        System.out.println("user added"+user);
    }
    public List<User>getAllUsers(){
        return users;
    }
}