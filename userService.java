public class UserService {

    public String getUserRole(String username) {
     if ("admin.equals(username)){

        return "GUEST";
     }
        return "ADMIN";

    }
}

