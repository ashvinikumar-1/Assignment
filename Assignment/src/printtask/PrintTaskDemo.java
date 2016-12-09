package printtask;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by ashvinikumar on 22/11/16.
 */
class PrintTask
{
    int page;
    int time;
    int id;
    public PrintTask(int page,int time,int id)
    {
        this.page=page;
        this.time=time;
        this.id=id;
    }

}

 class Task {
     Queue<PrintTask>  task= new LinkedList<PrintTask>();
     public void addTask(int page,int time,int id)
     {
         PrintTask pt=new PrintTask(page,time,id);
         task.add(pt);
     }
     public void deleteTask()
     {
         task.remove();
     }
     public void display()
     {
         Iterator iterator = task.iterator();
         while(iterator.hasNext()){
         PrintTask p = (PrintTask) iterator.next();
             System.out.println("------------------");
             System.out.println("Task Id: "+p.id);
             System.out.println("Page No: "+p.page);
             System.out.println("Time per page: "+p.time);
     }
     }
     public void waitTime()
     {
         Iterator iterator = task.iterator();
         int wait=0;
         while(iterator.hasNext()){
             PrintTask p = (PrintTask) iterator.next();
             System.out.println("------------------");
             wait=wait+p.time*p.page;
             System.out.println("Task Id: "+p.id);
             System.out.println("Waiting time: "+wait);
         }
     }

}
public class PrintTaskDemo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Task list = new Task();
        char ch;
        do {
            System.out.println("Print Task Operations\n");
            System.out.println("1. add Task");
            System.out.println("2.Display Task");
            System.out.println("3.delete Task");
            System.out.println("4.Check Wait time");
            int choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter task id,page no and page per unit time for execution");
                    int id = scan.nextInt();
                    int page = scan.nextInt();
                    int time = scan.nextInt();
                    list.addTask(page,time,id);
                    break;
                case 2:
                    System.out.println("Display task with their execution time");

                    list.display();
                    break;
                case 3:
                    list.deleteTask();
                    break;
                case 4:
                    list.waitTime();
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}

