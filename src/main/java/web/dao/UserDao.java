package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getUsers();
    void update(int id, User user);
    void delete(int id);
    User getUserById(int id);
}
