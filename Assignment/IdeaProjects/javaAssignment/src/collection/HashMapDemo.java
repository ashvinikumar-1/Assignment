package collection;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ashvinikumar on 18/11/16.
 */
class HashMaphm
{
    HashMap hm=new HashMap();
    public void addElement(String s,String s1)
    {
        hm.put(s,s1);
    }
    public void display(String s)
    {
        Object f=hm.get(s);
        if(f==null)
            System.out.println("not found");
        else
            System.out.println(s+" : "+f);
    }
}
class PhoneBookDemo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashMaphm hm=new HashMaphm();
        int t=1;
        while(t==1) {
            System.out.println("*********menu***********");
            System.out.println("1.Add name and phone number\n2.get Number \n3.Exit");
            System.out.println("Enter ur choice");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("enter name");
                    String s=sc.next();
                    System.out.println("Enter number");
                    String s1=sc.next();
                    hm.addElement(s,s1);
                    break;
                case 2:System.out.println("enter name");
                    String s2=sc.next();
                    hm.display(s2);
                    break;
                case 3:System.exit(1);
                    break;
                default:System.out.println("invalid input");
                    break;
            }
        }

    }
}
