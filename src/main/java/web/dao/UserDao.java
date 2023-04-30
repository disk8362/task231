package web.dao;

import model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void updateUser(User user);
    public void deleteUser(int id);
}
