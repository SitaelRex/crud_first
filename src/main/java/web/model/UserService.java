package web.model;

import java.util.List;

public interface UserService {
   void saveUser(User user);
   List<User> getUsersList();
}
