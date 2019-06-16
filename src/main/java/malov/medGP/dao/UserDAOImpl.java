package malov.medGP.dao;

import malov.medGP.model.User;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class UserDAOImpl implements UserDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> users = new HashMap<Integer, User>();

    static {
        User user1 = new User();
        user1.setId(AUTO_ID.getAndIncrement());
        user1.setName("qqqqq");
        users.put(user1.getId(), user1);

        User user2 = new User();
        user1.setId(AUTO_ID.getAndIncrement());
        user1.setName("qqqqq");
        users.put(user1.getId(), user1);
    }

    public List<User> allUser() {
        return new ArrayList<User>(users.values());
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
