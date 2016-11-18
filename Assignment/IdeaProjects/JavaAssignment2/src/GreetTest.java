/**
 * Created by ashvinikumar on 17/11/16.
 */
import techm.itp.rztu_cadets_batch1.Ashvini.*;

import java.util.Scanner;

public class GreetTest {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two names");
        String s1=sc.next();
        String s2=sc.next();
        Greeter gr[]=new Greeter[2];
        gr[0]=new Greeter(s1);
        gr[1]=new Greeter(s2);
        System.out.println(gr[0].sayHello());
        System.out.println(gr[1].sayHello());
        Advice aa=new Advice();
        System.out.println(aa.getAdvice());
        System.out.println(gr[0].sayGoodBye());
        System.out.println(gr[1].sayGoodBye());
    }
}
