package ru.voblikov.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.voblikov.model.User;
import ru.voblikov.repository.UserRepository;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userRepository.getUser(id);
    }

    @Transactional
    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Transactional
    @Override
    public void updateUser(int id, User updatedParameters) {
        updatedParameters.setId(id);
        userRepository.updateUser(updatedParameters);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}
