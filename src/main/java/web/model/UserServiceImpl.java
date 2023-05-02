package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
//import web.dao.UserDao;

import java.util.List;
@Component
public class UserServiceImpl implements UserService{
    UserDao dao;
    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }
    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    public List<User> getUsersList() {
        return dao.getUsersList();
    }
}
