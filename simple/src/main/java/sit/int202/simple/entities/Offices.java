package sit.int202.simple.entities;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"officeCode" , "city" , "country" , "phone"})

public class Offices {
    private String officeCode;
    private String city;
    private String phone;
    private String state;
    private String country;
    private String postalCode;
}
