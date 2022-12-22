package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private  static final String USERNAME = "root";
    private static final String PASWORD = "root";

    public static Connection connection;
    public static Statement statement;



        public static Connection getConnection () {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USERNAME, PASWORD);
            } catch (ClassNotFoundException e) {
                e.getStackTrace();
                System.out.println("Драйвер не найден");
            } catch (SQLException e) {
                e.getStackTrace();
                System.out.println("Соединение с БД не установлено");
            }
            return connection;
        }

}


      /*  try {

            statement = connection.createStatement();

        } catch (SQLException e) {
            System.out.println("БД не подключен");
            throw new RuntimeException(e);
        }*/






