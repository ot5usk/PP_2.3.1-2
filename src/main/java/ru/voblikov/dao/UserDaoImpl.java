package ru.voblikov.dao;

import org.springframework.stereotype.Controller;
import ru.voblikov.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserDaoImpl implements UserDao {

    private static int USER_ID;
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++USER_ID, "Vladimir", "Voblikov", (byte) 25, "vladimir.voblikov.774@gmail.com"));
        users.add(new User(++USER_ID, "Gregory", "Malyshev", (byte) 25, "gregory.malyshev.774@gmail.com"));
    }
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void createUser(User user) {
        user.setId(++USER_ID);
        users.add(user);
    }

    @Override
    public void updateUser(User updatedParameters) {
        User updatedUser = users.stream()
                .filter(user -> user.getId() == updatedParameters.getId())
                .findAny().orElse(null);

        if (updatedUser != null) {
            updatedUser.setName(updatedParameters.getName());
        }
        if (updatedUser != null) {
            updatedUser.setSurname(updatedParameters.getSurname());
        }
        if (updatedUser != null) {
            updatedUser.setAge(updatedParameters.getAge());
        }
        if (updatedUser != null) {
            updatedUser.setEmail(updatedParameters.getEmail());
        }
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    @Override
    public User getUser(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findAny().orElse(null);
    }
}
