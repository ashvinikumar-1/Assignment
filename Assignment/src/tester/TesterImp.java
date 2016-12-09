package tester;

import java.util.Scanner;

class Link {
    public String iType;
    public String iTitle;
    public String iDesc;
    public int iPrice;
    public double data2;
    public Link nextLink;

    //Link constructor
    public Link(String itype,String ititle,String idescription,int iprice) {
        iType=itype;
        iDesc=idescription;
        iPrice=iprice;
        iTitle=ititle;
    }

    //Print Link data
    public void printLink() {
        System.out.print("{" + iType + ", " + iTitle + iDesc + iPrice+ "} ");
    }
}

class LinkList {
    private Link first;

    //LinkList constructor
    public LinkList() {
        first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
        return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(String itype,String ititle,String idescription,int iprice) {
        Link link = new Link(itype,ititle,idescription,iprice);
        link.nextLink = first;
        first = link;
    }

    //Deletes the link at the first of the list
    public Link delete() {
        Link temp = first;
        first = first.nextLink;
        return temp;
    }

    //Prints list data
    public void printList() {
        Link currentLink = first;
        System.out.print("List: ");
        while(currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }
}

class TesterImp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        linkedList list = new linkedList();
        //System.out.println("Singly Linked List Test\n");
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert");
            System.out.println("2.delete");
            System.out.println("3.display");
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
                    LinkList li = new LinkList();
                    li.insert(type,title,description,price);
                    break;
                case 2 :
                    LinkList ll=new LinkList();
                    while(!list.isEmpty()) {
                    Link deletedLink = ll.delete();
                    System.out.print("deleted: ");
                    deletedLink.printLink();
                    System.out.println("");
                }

                    break;
                case 3 :
                    //System.out.println("Empty status = "+ list.isEmpty());
                    LinkList kk=new LinkList();
                    kk.printList();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            //list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }


}



/**
 * Created by ashvinikumar on 21/11/16.
 */

