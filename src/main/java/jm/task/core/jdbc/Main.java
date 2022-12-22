package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


import java.sql.ResultSet;
import java.sql.SQLException;

import static jm.task.core.jdbc.util.Util.statement;

public class Main {
    private static final UserService useService = new UserServiceImpl();
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        useService.saveUser("Антон", "Антонович", (byte) 22);
        useService.saveUser("Бнтон", "Бнтонович", (byte) 56);
        useService.saveUser("Внтон", "Внтонович", (byte) 15);
        useService.saveUser("Гнтон", "Гнтонович", (byte) 37);

        useService.removeUserById(2);
        useService.getAllUsers();
        useService.cleanUsersTable();
        useService.dropUsersTable();











    }

}
