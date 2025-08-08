package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Anton", "Ivanov", (byte) 3);
        userService.saveUser("Anton", "Ivanov", (byte) 3);
        userService.saveUser("Anton", "Ivanov", (byte) 3);
        userService.saveUser("Anton", "Ivanov", (byte) 3);
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeConnection(userService.getUserDao().getConnection());
    }
}
