public class User {
    public int userId;
    public  String  name;
    public String email;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public User(int userId, String name, String email){
        this.email=email;
        this.name=name;
        this.userId=userId;
    }
}