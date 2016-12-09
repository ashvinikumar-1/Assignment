package personageproblem;

import java.util.Scanner;

/**
 * Created by ashvinikumar on 22/11/16.
 */
class PersonNickName
{
    String name;
    String nick[]=new String[20];
    String recv[]=new String[20];
    public void set(String name,String nick1[])
    {
        this.name=name;
        for(int i=0;i<nick1.length;i++)
        {
            nick[i]=nick1[i];
        }
    }
    public String getName()
    {
        return name;
    }
    public String[] getNick()
    {
        return nick;
    }
    public void forgot() {
        for (int i = 0; i < 20; i++) {
            recv[i] = nick[i];
            nick[i]=null;
        }
    }
    public void recovery()
    {
        for (int i = 0; i < 20; i++) {
            nick[i]  = recv[i] ;
        }
    }

}
public class PersonNickNameDemo {
    public static void main(String args[]) {
        System.out.print("enter number of person");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PersonNickName pn[] = new PersonNickName[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of person: " + (i + 1));
            String s = sc.next();
            System.out.println("Enter number of nick namee of person: " + (i + 1));
            int k = sc.nextInt();
            String nick[] = new String[k];
            for (int j = 0; j < k; j++) {
                System.out.println("Enter nick names of person: " + (i + 1));
                nick[j] = sc.next();
            }
            pn[i] = new PersonNickName();
            pn[i].set(s, nick);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("name: " + pn[i].getName());
            String nick[] = pn[i].getNick();
            for (int j = 0; j < nick.length; j++) {
                if (nick[j] == null)
                    break;
                System.out.println("nickname: " + nick[j]);
            }
        }
        System.out.println("enter person no to forgot nickname");
        int ch = sc.nextInt();
        pn[ch].forgot();
        System.out.println("name: " + pn[ch].getName());
        String nick[] = pn[ch].getNick();
        for (int j = 0; j < nick.length; j++) {
            if (nick[j] == null) {
                if (j == 0)
                    System.out.println("no nick name");
                break;
            }

            System.out.println("nickname: " + nick[j]);


        }
        System.out.println("after recovery");
        pn[ch].recovery();
        for (int j = 0; j < nick.length; j++) {
            if (nick[j] == null) {
                if (j == 0)
                    System.out.println("no nick name");
                break;
            }

            System.out.println("nickname: " + nick[j]);


        }

    }
}
