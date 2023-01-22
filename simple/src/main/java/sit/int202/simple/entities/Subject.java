package sit.int202.simple.entities;
import lombok.*;


//@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Subject {
    private String id;
    private String title;
    private double credit;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCredit() {
        return credit;
    }
    public String getTestMethodNameByEl(){
        return "OK";
    }
    public double getGpax(){
        return 3.0;
    }

}




