package tester;

import java.util.Scanner;

/**
 * Created by ashvinikumar on 21/11/16.
 */
class Tester {
    public String iType;
    public String iTitle;
    public String iDescription;
    public int iPrice;
    public Tester link;
    public Tester()
    {
    link=null;
    }
    public Tester(String itype,String ititle,String idescription,int iprice)
    {
        iType=itype;
        iDescription=idescription;
        iPrice=iprice;
        iTitle=ititle;
    }
    /*  Function to set link to next Node  */
    public void setLink(Tester n)
    {
        link = n;
    }
    /*  Function to get link to next node  */
    public Tester getLink()
    {
        return link;
    }
    /*  Function to get data from current Node  */
   public void displayLink()
   {
       System.out.println("****************************************");
       System.out.println("type="+iType+"  "+"name of item"+iTitle+"  Desc"+iDescription+" price"+iPrice);
   }
}
class linkedList {
    private  Tester head;
    private Tester end;
    private int size = 0;

    /*  Constructor  */
    public linkedList() {
        head = null;
        end=null;
        size = 0;
    }

    public void insertFirst(String iType, String iTitle, String iDescription, int iPrice)
    { // make new link
        Tester temp = new Tester(iType, iTitle, iDescription, iPrice);
        temp.link=head ; // it points to old first link
        head = temp; // now first points to this
    }



    /*  Function to check if list is empty  */
    public boolean isEmpty() {
        return head == null;
    }
    /*  Function to get size of list  */
    public int getSize() {
        return size;
    }


    /*  Function to display elements  */
    public void displayList() // display the list
    {
        Tester current = head; // start at beginning of list
        if (current == null)
            System.out.println("empty");
        else {
            while (current != null) // until end of list,
            {
                current.displayLink(); // print data
                current = current.link; // move to next link
            }
            System.out.println("");
        }
    }
    public void find(String key) // find link with given key
    { // (assumes non-empty list)
        Tester current = head; // start at ‘first’
        int f=0;
        while(current!= null) // while no match,
        {

            if(current.iType .equals(key)) // if end of list,
            {
                current.displayLink();
                f++;

            }

            current=current.link;

        }

        if( f==0)
        {
            System.out.println("not found");
        }


    }
    public void delete(String key) // delete link with given key
    { // (assumes non-empty list)
        Tester current = head; // search for link
        Tester previous = head;
        int f=0;
        while(current!= null) // while no match,
        {

            if(current.iType .equals(key)) // if end of list,
            {
                f++;
                if(current == head) // if first link,
                    head = head.link; // change first
                else // otherwise,
                    previous.link = current.link; // bypass it


            }

            current=current.link;

        }

        if( f==0)
        {
            System.out.println("not found");
        }

    }

}

class TesterDemo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        linkedList list = new linkedList();
        System.out.println("Singly Linked List Test\n");
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert");
            System.out.println("2.find");
            System.out.println("3.delete");
            System.out.println("4.display");
            int choice = scan.nextInt();
            switch (choice)
            {

                case 1 :
                    System.out.println("Enter type,title,description,price of element to insert");
                    String type=scan.next();
                    String title=scan.next();
                    scan.nextLine();
                    String description=scan.nextLine();
                    int price=scan.nextInt();
                    list.insertFirst(type,title,description,price);
                    break;
                case 2 :
                    System.out.println("Enter type of item");
                    String s = scan.next() ;
                    list.find(s);
                    break;
                case 3 :
                    System.out.println("Enter type of item");
                    String s1 = scan.next() ;
                    list.delete(s1);
                    break;
                case 4 :
                   //System.out.println("Empty status = "+ list.isEmpty());
                    list.displayList();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}

