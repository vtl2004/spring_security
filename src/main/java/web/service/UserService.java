package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    void saveUser(User user);
    User findUser(long id);
    void updateUser(User user);
    void deleteUser(User user);
    User getUserByUsername(String username);


}
