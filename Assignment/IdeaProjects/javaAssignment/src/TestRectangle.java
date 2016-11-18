import java.util.Scanner;
import java.util.StringJoiner;

public class TestRectangle
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("created object no: "+(i+1));
            System.out.println("enter length");
            int l = sc.nextInt();
            System.out.println("enter width");
            int w = sc.nextInt();
            Rectangle r = new Rectangle(l, w);
            System.out.println("get Lenght=" + r.retLen());
            System.out.println("get width=" + r.retWid());
            System.out.println("Area=" + r.Area());
            System.out.println("enter length to set new length");
            int l1 = sc.nextInt();
            System.out.println("enter width to set width");
            int w1 = sc.nextInt();
            r.setSize(l1, w1);
            System.out.println(" new  Lenght=" + r.retLen());
            System.out.println("new  width=" + r.retWid());
            System.out.println("new Area=" + r.Area());

        }
    }
}
