package malov.medGP.dao;

import malov.medGP.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUser();
    void add(User user);
    void delet(User user);
    void edit(User user);
    User getById(int id);
}
