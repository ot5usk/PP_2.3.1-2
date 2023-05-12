package ru.voblikov.service;

import ru.voblikov.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void createUser(User user);
    void updateUser(int id, User updatedParameters);
    void deleteUser(int id);
    User getUser(int id);
}
