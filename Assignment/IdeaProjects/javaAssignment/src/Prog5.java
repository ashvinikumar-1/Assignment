import java.util.Scanner;

/**
 * Created by ashvinikumar on 16/11/16.
 */
public class Prog5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t;
        int k;
        int s;
        System.out.print(a+" "+b);
        for(int i=0;i<13;i++)
        {
            s=a+b;
            a=b;
            b=s;
            System.out.print(" "+s);

        }
    }
}
