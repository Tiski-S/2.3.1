package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getUsers();
    void update(int id, User updateUser);
    void delete(int id);
    User getUserById(int id);
}
