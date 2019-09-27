package Lesson17;

import java.sql.*;

public class Main {
    public static final String jdbc = "jdbc:mysql:";
    public static final String hostAndPort = "//localhost:3306";
    public static final String url = "/addressBook";
    public static final String unicode = "useUnicode = true";
    public static final String jdbcTimezoneShift = "useJDBCCompliantTimezoneShift=true";
    public static final String dateTime = "useLegacyDateTimeCode = false";
    public static final String serverTimezone = "serverTimezone=UTC";
    public static final String separator = "?";
    public static final String separatorAnd = "&";
    public static final String fullurl =
            jdbc
                    + hostAndPort
                    + url
                    + separator
                    + unicode
                    + separatorAnd
                    + jdbcTimezoneShift
                    + separatorAnd
                    + dateTime
                    + separatorAnd
                    + serverTimezone;
    public static final String USER_NAME = "root";
    public static final String password = "root";
    public static final String insertPerson = "insert into person (name,age) values (?,?);";


    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(fullurl, USER_NAME, password);


        Statement statement = connection.createStatement();
        statement.execute("create table if not exists person(" +
                "id int primary key auto_increment, " +
                "name varchar(255), " +
                "married boolean default false)");
//        statement.execute("insert into person (id,name,married) value (2,'Timmy',false)");
//        statement.execute("update person set name = 'Karl', married=true where id = 2");
//        statement.execute("delete from person where name = 'Timmy'");
//        statement.execute("alter table person add age int");

        /*
        по умолчанию у statement параметр setAutoCommit = true, т.е.
        statement.setAutoCommit(true), и все execute выполняются сразу
        но если его поставить в false (отложить выполнение), то они не выполнятся, пока не дать команду
        connection.commit();
        чтобы не дергать постоянно БД, а выполнить несколько операций за 1 раз
        */

        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into person (name,married,age) value(?,?,?)");

        preparedStatement.setString(1, "Slava");
        preparedStatement.setBoolean(2, false);
        preparedStatement.setInt(3, 12);
        preparedStatement.execute();

        statement.execute("select * from person");

        ResultSet set = statement.getResultSet();
        while (set.next()) {
            System.out.println(
                    "ID: " + set.getInt(1) + ",  " +
                            " name: " + set.getString(2) + ",  " +
                            " married: " + set.getBoolean(3) + ",  " +
                            " age: " + set.getInt(4));


        }
        statement.close();
        connection.close();
    }
}
