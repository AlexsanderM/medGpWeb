package malov.medGP.service;

import malov.medGP.dao.UserDAO;
import malov.medGP.dao.UserDAOImpl;
import malov.medGP.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDAO userDAO;

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

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
