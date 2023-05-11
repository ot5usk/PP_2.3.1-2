package ru.voblikov.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.voblikov.dao.UserDao;
import ru.voblikov.model.User;
import ru.voblikov.repository.UserRepository;

import java.util.List;

@Component
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserDao userDao, UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public void updateUser(User updatedParameters) {
        userRepository.updateUser(updatedParameters);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    @Override
    public User getUser(int id) {
        return userRepository.getUser(id);
    }
}
