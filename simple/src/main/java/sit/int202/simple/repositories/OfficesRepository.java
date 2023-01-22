package sit.int202.simple.repositories;

import sit.int202.simple.entities.ConnectionBuilder;
import sit.int202.simple.entities.Offices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class OfficesRepository {
    private final static String FIND_ALL = "select * from offices";
    private final static String FIND_BY_CODE = "select * from offices where officeCode like ?";


    public List<Offices> findAll() throws SQLException, SQLException {
        Connection conn = ConnectionBuilder.getConnection();
        ResultSet rs = conn.createStatement().executeQuery(FIND_ALL);
        List<Offices> officesList = new ArrayList<>();
        while (rs.next()) {
            officesList.add(new Offices(rs.getString("officeCode"),
                    rs.getString("city"),
                    rs.getString("phone"),
                    rs.getString("state"),
                    rs.getString("country"),
                    rs.getString("postalCode")));
        }
        rs.close();
        return officesList;
    }
    private Offices getOffice(ResultSet rs) throws SQLException{
        return new Offices(rs.getString("officeCode"),
                rs.getString("city"),
                rs.getString("phone"),
                rs.getString("state"),
                rs.getString("country"),
                rs.getString("postalCode"));
    }



    public Offices find(String officeCode) throws SQLException {
        Connection conn = ConnectionBuilder.getConnection();
        PreparedStatement pstm = conn.prepareStatement(FIND_BY_CODE);
        pstm.setString(1, officeCode);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            return new Offices(rs.getString("officeCode"),
                    rs.getString("city"),
                    rs.getString("phone"),
                    rs.getString("state"),
                    rs.getString("country"),
                    rs.getString("postalCode"));
        }
        return null;
    }
    private final static String
            UPDATE = "update offices set city=?, country = ? where officeCode like ?";
    public int update(Offices offices) throws SQLException{
        Connection conn = ConnectionBuilder.getConnection();
        PreparedStatement pstm = conn.prepareStatement(UPDATE);
        pstm.setString(1, offices.getCity());
        pstm.setString(2, offices.getCountry());
        pstm.setString(3, offices.getOfficeCode());
        int result = pstm.executeUpdate();
        conn.close();
        return result;
    }

}


