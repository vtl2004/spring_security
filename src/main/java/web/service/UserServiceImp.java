package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;


    @Transactional(readOnly = true)
    @Override
    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
    @Transactional
    @Override
    public User findUser(long id) {
        return userDao.findUser(id);
    }
    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
    @Transactional
    @Override
    public User getUserByUsername(String username){
        return userDao.getUserByUsername(username);
    }


}
