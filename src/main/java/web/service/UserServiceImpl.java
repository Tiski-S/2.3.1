package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void update(int id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
