package tetinterfaces;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by ashvinikumar on 23/11/16.
 */
public class UniqueFirstName {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Ashvini", "Kumar"));
        list.add(new Employee("Virat", "kohli"));
        list.add(new Employee("Rohit", "Sharma"));
        list.add(new Employee("Rohit", "kumar"));
        list.add(new Employee("Rohit", "khanna"));
        SortedSet<String> ss=new TreeSet<>();
        for(Employee e:list)
        {
            Employee t=e;
            ss.add(e.firstname);
        }
        System.out.println("unique First Name");
        for(String s: ss)
        {
            System.out.println(s);
        }
    }
}
