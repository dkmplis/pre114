package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.boot.model.source.spi.SingularAttributeSourceToOne;

import java.sql.SQLOutput;
import java.util.List;

public class UserServiceImpl implements UserService {

    UserDaoJDBCImpl user = new UserDaoJDBCImpl();

    public UserServiceImpl () {
    }


    public void createUsersTable() {
        user.createUsersTable();
    }

    public void dropUsersTable() {
        user.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        user.saveUser(name, lastName, age);
        System.out.println(String.format("User с именем — %s добавлен в базу данных", name));
    }

    public void removeUserById(long id) {
        user.removeUserById(id);

    }

    public List<User> getAllUsers() {
        return user.getAllUsers();
    }

    public void cleanUsersTable() {
        user.cleanUsersTable();

    }
}
