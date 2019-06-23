package malov.medGP.dao;

import malov.medGP.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDAOImpl implements UserDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> users = new HashMap<Integer, User>();
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUser() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Users").list();
    }

    public void add(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put(user.getId(), user);
    }

    public void delet(User user) {
        users.remove(user.getId());
    }

    public void edit(User user) {
        users.put(user.getId(), user);
    }

    public User getById(int id) {
        return users.get(id);
    }
}
