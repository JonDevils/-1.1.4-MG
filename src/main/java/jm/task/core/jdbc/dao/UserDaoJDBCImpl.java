package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*public class UserDaoJDBCImpl implements UserDao {
  public static Connection connection = Util.getConnection();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        try (Statement statement = connection.createStatement()) {
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS users " +
                        "(id BEGINT  PRIMARY KEY AUTO_INCREMENT, " +
                        "name varchar(100) , " +
                        "lastname varchar(100), " +
                        "age INT)");



            } catch(SQLException e){
            System.out.println("!createUsersTable");
                throw new RuntimeException(e);

        }
    }

        public void dropUsersTable() {
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate("DROP TABLE IF EXISTS users");
            } catch (SQLException e) {
                System.out.println("!dropUsersTable");
                throw new RuntimeException(e);
            }
        }

    public void saveUser(String name, String lastName, byte age) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name,last_name,age)VALUES (?,?,?)"))
        {
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,lastName);
            preparedStatement.setByte(3,age);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("!saveUser");
            throw new RuntimeException(e);
        }
    }

    public void removeUserById(long id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")){
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("!removeUserById");
            throw new RuntimeException(e);
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM users")) {
            while (resultSet.next()) {
                User user = new User(resultSet.getString("name"),resultSet.getString("last_name"),resultSet.getByte("age"));
            user.setId(resultSet.getLong("id"));
            users.add(user);
            }
        } catch (SQLException e) {
            System.out.println("!getAllUsers");
            throw new RuntimeException(e);
        }
        return users;
    }

    public void cleanUsersTable() {
        try(Statement statement = connection.createStatement()){
            statement.executeUpdate("TRUNCATE TABLE users");
        } catch (SQLException e) {
            System.out.println("!cleanUsersTable");
            throw new RuntimeException(e);
        }
    }
}*/
