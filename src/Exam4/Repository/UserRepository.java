package Exam4.Repository;

import Exam4.Domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User  findByEmail(String email) {
        return  users.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}
