package malov.medGP.service;

import malov.medGP.dao.UserDAO;
import malov.medGP.dao.UserDAOImpl;
import malov.medGP.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDAO userDAO = new UserDAOImpl();

    public List<User> allUsers() {
        return userDAO.allUser();
    }

    public void add(User user) {
        userDAO.add(user);
    }

    public void delete(User user) {
        userDAO.delet(user);
    }

    public void edit(User user) {
        userDAO.edit(user);
    }

    public User getById(int id) {
        return userDAO.getById(id);
    }
}
