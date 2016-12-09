import java.util.Scanner;

/**
 * Created by ashvinikumar on 16/11/16.
 */
class Book
{
    String name;
    double price;
    public void setTitle(String name1,double price1)
    {

            name=name1;
        price=price1;
    }
    public String getTitle()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
}
public class ImpBooks {
    static int n;
    Book[] l;
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {

        System.out.println("Enter how many books you want to create");
          n=sc.nextInt();
        ImpBooks imp=new ImpBooks();
        imp.createBooks();
        imp.displayBooks();

    }
    public void createBooks() {

       l = new Book[n];
        for(int j=0;j<n;j++)
        {
            l[j]=new Book();
            System.out.println("enter book title no "+(j+1));
            sc.nextLine();
            String s=sc.nextLine();

            System.out.println("enter book price "+(j+1));
            double p =sc.nextDouble();
            l[j].setTitle(s,p);
        }
    }
    public void displayBooks()
    {
        String t="Title";
        String pr="Price";
        System.out.println("Title"+" price");
        System.out.printf("%-15s%s%n", t, pr);
           for(int i=0;i<n;i++)
           {
               System.out.printf("%-15s%f%n",l[i].getTitle(), l[i].getPrice());
               System.out.println();
           }
    }
}
