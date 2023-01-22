package sit.int202.register.servlets;

import java.sql.Array;
import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>(32, 0.5f);
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("INT101");
        a1.add("INT102");
        a1.add("INT109");
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("INT101");
        a2.add("INT102");
        a2.add("INT109");
        ArrayList<String> a9 = new ArrayList<>();
        a9.add("INT101");
        a9.add("INT102");
        a9.add("INT109");

        map.put(1, a1);
        map.put(1, a2);
        map.put(1, a9);
        List<String> tmp = map.get(2);
        System.out.println("tmp==a2 ?" + (tmp == a2));
        Set<Integer> semesters = map.keySet();
        for (Integer semester : semesters) {
            System.out.println(" Semester: " + semester);
            for (String subject : map.get(semester)) {
                System.out.println(subject);
            }
            System.out.println("------------------------------------------------");
        }


        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();
        System.out.println("==================================================");
        for(Map.Entry<Integer, List<String>> e : entries) {
            System.out.println("Semester: "+ e.getKey());
            for(String subject : e.getValue()) {
                System.out.println(subject);
            }
            System.out.println("------------------------------------------------");
        }

    }
}

