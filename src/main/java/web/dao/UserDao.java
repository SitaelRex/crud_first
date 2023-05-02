package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDao {
    @Autowired
    EntityManager entityManager;

    public UserDao() {

    }
    public void saveUser(User user) {
         entityManager.persist(user);
    }

    public List<User> getUsersList() {
        return null;
    }
}
