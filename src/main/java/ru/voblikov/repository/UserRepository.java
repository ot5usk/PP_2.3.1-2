package ru.voblikov.repository;

import ru.voblikov.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();
    void createUser(User user);
    void updateUser(User updatedParameters);
    void deleteUser(int id);
    User getUser(int id);
}