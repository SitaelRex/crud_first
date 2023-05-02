package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Component
public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    public UserDao() {

    }
    @Transactional
    public void saveUser(User user) {
         entityManager.persist(user);
    }

    public List<User> getUsersList() {
        return null;
    }
}
