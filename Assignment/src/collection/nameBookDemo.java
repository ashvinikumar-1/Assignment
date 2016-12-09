package collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by ashvinikumar on 18/11/16.
 */
class nameBook
{
    Vector v=new Vector();
    public void addElement(String s)
    {
        v.add(s);
    }
    public void display()
    {
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements())
            System.out.println(vEnum.nextElement());
    }
}
public class nameBookDemo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        nameBook pb=new nameBook();
        int t=1;
        while(t==1) {
            System.out.println("*********menu***********");
            System.out.println("1.Add first and last name\n2.Display Name\n3.Exit");
            System.out.println("Enter ur choice");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("enter first and last name");
                    sc.nextLine();
                    pb.addElement(sc.nextLine());
                    break;
                case 2:pb.display();
                    break;
                case 3:System.exit(1);
                    break;
                default:System.out.println("invalid input");
                    break;
            }
        }

    }
}
