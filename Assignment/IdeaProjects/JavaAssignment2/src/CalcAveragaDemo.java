import java.util.Scanner;

/**
 * Created by ashvinikumar on 17/11/16.
 */
class CalcAverage
{
    public double avgFirstN(int n) throws ArithmeticException
    {
        if(n<0)
        {
            throw new ArithmeticException();
        }
        else {
            double sum = n * (n + 1) / 2;
            sum = sum / n;
            return sum;
        }
    }
}
public class CalcAveragaDemo {
    public static void main(String args[])
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a natural number");
            int a = sc.nextInt();
            System.out.println("average of " + a + " natural no=" + new CalcAverage().avgFirstN(a));
        }
        catch (ArithmeticException e)
        {
           System.out.println("invalid natural number: "+e);
        }
    }
}
