package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by ashvinikumar on 18/11/16.
 */
public class arrayList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList al=new ArrayList();
        System.out.println("enter how many students you want to add");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter name: "+(i+1));
            al.add(sc.next());
        }
        Iterator itr=al.iterator();
        System.out.println("enter name u want to find");
        String st=sc.next();
        int k=0;
        while(itr.hasNext())
        {
            if(itr.next().equals(st)) {
                System.out.println("found");
                k++;
                break;
            }
        }
        if(k==0)
        {
            System.out.println("not found");
        }
    }
}
