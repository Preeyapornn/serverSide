package sit.int202.register;

import sit.int202.register.models.CourseRegistered;
import sit.int202.register.models.CourseRepository;
import sit.int202.register.models.Semester;
import sit.int202.register.models.Subject;

import java.util.List;
import java.util.Map;

public class TestModels {
    public static void main(String[] args) {
        List<Subject> subjectList = CourseRepository.getSubjects(9);
//        subjectList.forEach(s -> System.out.println(s));
//        System.out.println("-------------------------");
//        for (Subject s : subjectList ){
//            System.out.println(s);
//        }
        System.out.println(Semester.getSemesterText(2));
        for (String semester : Semester.getAllSemesterText()) {
            System.out.println(semester);
        }
        CourseRegistered cr = new CourseRegistered();
        cr.registerSubject(1, CourseRepository.getSubject(1, "INT100"));
        cr.registerSubject(1, CourseRepository.getSubject(1, "INT101"));

        cr.registerSubject(2, CourseRepository.getSubject(2, "INT104"));
        cr.registerSubject(2, CourseRepository.getSubject(2, "INT105"));

        Map<Integer, List<Subject>> registers = cr.getHistory();
        for( int semester : registers.keySet()){
            System.out.println("Semester: " + semester);
            System.out.println("--------------------------");
            cr.getRegisteredCourse(2).forEach( subject -> System.out.println(subject));
        }


    }
}
