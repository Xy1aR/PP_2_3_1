package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(Long id);

    void addUser(User user);

    void removeUser(Long id);

    void editUser(User user);
}
