package collection;

import java.util.*;

/**
 * Created by ashvinikumar on 18/11/16.
 */
public class ProductDemo {
    public static void main(String args[])
    {
        Hashtable hs=new Hashtable();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter product id and product name :"+(i+1));
            hs.put(sc.next(),sc.next());
        }
        Set s=hs.entrySet ();
        Iterator itr=s.iterator();
        System.out.println("enter product to remove from hashtable");
        String rm=sc.next();
        Object fobj=null;
        while (itr.hasNext ())
        {
            Map.Entry me= (Map.Entry) itr.next ();


            fobj=hs.remove(rm);
        }
        if(fobj==null)
        {

            System.out.println("not found");
        }
        else
            System.out.println(fobj+" removed");
       
    }
}
