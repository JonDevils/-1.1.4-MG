package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


import java.sql.ResultSet;
import java.sql.SQLException;



public class Main {
    // private static final UserService useService = new UserServiceImpl();

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Антон", "Антонович", (byte) 22);
        userDao.saveUser("Бнтон", "Бнтонович", (byte) 56);
        userDao.saveUser("Внтон", "Внтонович", (byte) 15);
        userDao.saveUser("Гнтон", "Гнтонович", (byte) 37);

        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
