package tetinterfaces;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ashvinikumar on 23/11/16.
 */
public class RandomEmployee {
    public static void main(String args[])
    {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("Ashvini","Kumar"));
        list.add(new Employee("Virat","kohli"));
        list.add(new Employee("Rohit","Sharma"));
        list.add(new Employee("Rohit","kumar"));
        list.add(new Employee("Rohit","khanna"));
        Random r=new Random();
        int size=list.size();
        int random=r.nextInt(size);
        Employee e=list.get(random);
        System.out.println("Random employee: Fname "+e.firstname+" Lname: "+e.lastname);

    }
}
