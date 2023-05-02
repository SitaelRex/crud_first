package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
@Transactional
public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    public UserDao() {

    }

    public User getUser(long id) {
        String hql = "FROM User user WHERE user.id = :userId";
        Query query = entityManager.createQuery(hql);
        query.setParameter("userId", id);
        List results = query.getResultList();

        if (results != null && !results.isEmpty()) {
            return (User)results.get(0);
        }
        return null;
    }
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    public void deleteUser(long id) {
        String hql = "DELETE FROM User WHERE id = :userId";
        Query query = entityManager.createQuery(hql);
        query.setParameter("userId", id);
        query.executeUpdate();
      //  entityManager.createQuery();
    }

    public List<User> getUsersList() {
        String hql = "FROM User";
        Query query = entityManager.createQuery(hql);
        return query.getResultList();
    }

    public void updateUser(long id, User newUser) {
        String hql = "UPDATE User user set user.firstName = :newFirstName WHERE id = :userId";
        Query query = entityManager.createQuery(hql);
        query.setParameter("userId", (long)id);
        query.setParameter("newFirstName", newUser.getFirstName());
        query.executeUpdate();
    }
}
