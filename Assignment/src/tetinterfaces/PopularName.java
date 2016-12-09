package tetinterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashvinikumar on 23/11/16.
 */
public class PopularName {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Ashvini", "Kumar"));
        list.add(new Employee("Virat", "kohli"));
        list.add(new Employee("Rohit", "Sharma"));
        list.add(new Employee("Rohit", "kumar"));
        list.add(new Employee("Rohit", "khanna"));
        ArrayList<String> name=new ArrayList<>();
        for(Employee e:list)
        {
            Employee t=e;
            name.add(e.firstname);
        }
        Map<String,Integer> count=new HashMap<>();
        for(String array:name)
        {
            if(count.containsKey(array))
            {
                count.put(array,count.get(array)+1);
            }
            else
                count.put(array,1);
        }
        for(Map.Entry<String,Integer> entry:count.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
