package malov.medGP.dao;

import malov.medGP.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDAO {

    @Transactional
    List allUser();
    void add(User user);
    void delet(User user);
    void edit(User user);
    User getById(int id);
}
