package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private final EntityManager entityManager;


    public UserDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = entityManager.createQuery("from User order by id", User.class).getResultList();
        return users;
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User findUser(long id) {
        return  entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(User user) {
       entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));

    }

    @Override
    public User getUserByUsername(String username) {
        User user = entityManager.createQuery("FROM User WHERE username = :username", User.class)
                .setParameter("username", username)
                .getSingleResult();
        return user;
    }


}
