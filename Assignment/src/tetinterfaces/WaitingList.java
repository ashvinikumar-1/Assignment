package tetinterfaces;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ashvinikumar on 23/11/16.
 */
public class WaitingList {
    public static void main(String args[]) {
        Queue<Employee> list = new LinkedList<>();
        list.add(new Employee("Ashvini","Kumar"));
        list.add(new Employee("Virat", "kohli"));
        list.add(new Employee("Rohit", "Sharma"));
        list.add(new Employee("Rohit", "kumar"));
        list.add(new Employee("Rohit", "khanna"));
        Iterator iterator = list.iterator();
        int wait=0;
        while(iterator.hasNext())
        {
            Employee e=(Employee)iterator.next();
            System.out.println(e.firstname+" "+e.lastname+" wait time:"+wait);
            wait=wait+1;
        }
    }
}
