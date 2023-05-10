package ru.voblikov.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import ru.voblikov.dao.UserDao;
import ru.voblikov.model.User;

import java.util.List;

@Controller
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public void updateUser(User updatedParameters) {
        userDao.updateUser(updatedParameters);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
