package sit.int202.classicmodelweb;

import at.favre.lib.crypto.bcrypt.BCrypt;
import sit.int202.classicmodelweb.entities.Customer;
import sit.int202.classicmodelweb.entities.Employee;
import sit.int202.classicmodelweb.entities.Office;
import sit.int202.classicmodelweb.repositories.CustomerRepository;
import sit.int202.classicmodelweb.repositories.EmployeeRepository;
import sit.int202.classicmodelweb.repositories.OfficeRepository;
import sit.int202.classicmodelweb.repositories.ProductRepository;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer = customerRepository.findByName("Jean King");
        System.out.println(customer);
        BCrypt.Result result = BCrypt.verifyer().verify("1@qWaSzX".toCharArray(), customer.getPassword());
        System.out.println(result);
//        ProductRepository productRepository = new ProductRepository();
//        System.out.println(productRepository.countAll());
//        System.out.println(productRepository.findAll(1,10));
 //       OfficeRepository officeRepository = new OfficeRepository();
//        Office office = officeRepository.find("1");
//        office.setCity("Vientiane");
//        officeRepository.update(office);
//        officeRepository.delete("11");
//        for(Employee e : office.getEmployeeList()) {
//            System.out.println(e);
//        }
//         Office newOffice = new Office();
//         newOffice.setId("10");
//         newOffice.setCity("Hanoi");
//         newOffice.setCountry("TH");
//         newOffice.setAddressLine1(office.getAddressLine1());
//         newOffice.setAddressLine2(office.getAddressLine2());
//         newOffice.setPhone(office.getPhone());
//         newOffice.setPostalCode(office.getPostalCode());
//         newOffice.setTerritory(office.getTerritory());
//         //officeRepository.save(newOffice);
//
//        for(Office o : officeRepository.findAll()) {
//            System.out.println(o.getId() + ": " + o.getCity());
//            System.out.println("-----------------------");
//            if (o.getEmployeeList() != null) {
//                o.getEmployeeList().forEach(employee -> {
//                    printEmp(employee);
//                });
//                System.out.println("\n");
//            }
//        }
//        EmployeeRepository employeeRepository = new EmployeeRepository();
//        System.out.println("-------------------------------------");
//        employeeRepository.findByDescription("pa").forEach(employee -> {
//            printEmp(employee);
//        });

    }
    private static void printEmp(Employee e) {
        System.out.printf("%7d %-10s %-15s %-20s %s\n", e.getId(), e.getFirstName(),
                e.getLastName(), e.getJobTitle(), e.getEmail());
    }

}
