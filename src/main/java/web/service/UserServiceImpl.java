package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;
@Component
public class UserServiceImpl implements UserService {
    private final UserDao dao;
    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }
    @Override
    @Transactional
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        dao.deleteUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(long id) {
        return dao.getUser(id);
    }
    @Override
    @Transactional
    public void updateUser( long id, User user) {
        dao.updateUser(id, user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsersList() {
        return dao.getUsersList();
    }
}
