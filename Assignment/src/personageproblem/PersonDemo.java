package personageproblem;

import java.util.Scanner;

/**
 * Created by ashvinikumar on 22/11/16.
 */
abstract class SearchEqual
{
    abstract void equal(Person p[]);
}
class Person extends SearchEqual
{
    String name;
    String dob;
    public void set(String name,String dob)
    {
        this.name=name;
        this.dob=dob;
    }
    public void equal(Person p[] )
    {
        for(int i=0;i<2;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(p[i].getName().equals(p[j].getName()) && p[i].getDOB().equals(p[j].getDOB()))
                {
                    System.out.println("person "+(i+1)+" Person "+ (j+1)+" same");
                }
            }
        }
    }
    public String getName()
    {
        return name;
    }
    public String getDOB()
    {
        return dob;
    }
}
public class PersonDemo {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Person p[]=new Person[3];
    for(int i=0;i<3;i++)
    {
        p[i]=new Person();
        System.out.println("enter name and date of birth");
        p[i].set(sc.next(),sc.next());
    }
    for(int i=0;i<3;i++)
    {
        System.out.println("name: "+p[i].getName()+"  DOB: "+ p[i].getDOB());
    }

    Person q=new Person();
    q.equal(p);


}
}
