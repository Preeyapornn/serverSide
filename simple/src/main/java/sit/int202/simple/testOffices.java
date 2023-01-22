package sit.int202.simple;

import sit.int202.simple.entities.Offices;
import sit.int202.simple.repositories.OfficesRepository;

import java.sql.SQLException;

public class testOffices {
    public static void main(String[] args) throws SQLException {
        OfficesRepository officesRepository = new OfficesRepository();
//        officesRepository.findAll().forEach(o-> System.out.println(o));
//        System.out.println(officesRepository.find("1"));
//        System.out.println(officesRepository.find("3"));
//        System.out.println(officesRepository.find("5"));
//        System.out.println(officesRepository.find("7"));
//        System.out.println(officesRepository.find("9"));
        Offices o = officesRepository.find("1");
        o.setCity("Bangkok");
        o.setCountry("Thailand");
        officesRepository.update(o);
    }
}
