package sit.int202.simple.entities;

import java.sql.*;

public class ConnectionBuilder {

        private final static String URL = "jdbc:mysql://localhost:3306/classicmodels";
        private final static String USER = "root";
        private final static String PASSWORD = "Benz22072545";
        public  static Connection getConnection(){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                return conn;

            } catch (ClassNotFoundException e) {
                System.out.println("Can;t load driver !!!");
            } catch (SQLException sqle) {
                System.out.println(" Can't create connection !!!");
            }
            return null;
        }

}
