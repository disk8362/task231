package web.service;

import model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    void deleteUser(int id);
    public void updateUser(User user);
}
