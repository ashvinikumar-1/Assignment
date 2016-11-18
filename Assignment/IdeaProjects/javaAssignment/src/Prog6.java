import java.util.Scanner;

public class Prog6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nos between 1  and 40");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k[]=new int[5];
        int f1=0;
        int f2=0;
        System.out.println("Enter five nos between 1  and 40 ");
        for(int i=0;i<5;i++)
        {
            k[i]=sc.nextInt();
            if(k[i]==a)
                f1++;
            if(k[i]==b)
                f2++;

        }
        System.out.println("ur array was");
        for(int i=0;i<5;i++)
        {
            System.out.print(k[i]+" ");

        }
        System.out.println("1st no.= "+a+"  2nd no.= "+b);
        if(f1>0 && f2>0)
            System.out.println("Its Bingo!");
        else
            System.out.println("Not Found!");
    }

}