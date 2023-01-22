package sit.int202.simple;

import java.sql.*;

public class TestJdbc {
    private final static String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private final static String USER = "root";
    private final static String PASSWORD = "Benz22072545";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(conn.getCatalog());
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from offices");
            showOffice(rs);

        } catch (ClassNotFoundException e) {
            System.out.println("Can;t load driver !!!");
        } catch (SQLException e1) {
            System.out.println("Cant login");
        }
    }

    private static void showOffice(ResultSet rs) throws SQLException{
        while (rs.next()){
            System.out.printf("%2s %-25s %-25s\n",
                    rs.getString("officeCode"),
                    rs.getString("city"),
                    rs.getString("country"));
        }
    }
}
