package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
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
    public void deleteUser(long id) {
        dao.deleteUser(id);
    }

    @Override
    public User getUser(long id) {
        return dao.getUser(id);
    }

    public void updateUser( long id, User user) {
        dao.updateUser(id, user);
    }

    @Override
    public List<User> getUsersList() {
        return dao.getUsersList();
    }
}
