package techm.itp.rztu_cadets_batch1.Ashvini;

import java.util.Random;

/**
 * Created by ashvinikumar on 17/11/16.
 */
public class Advice {
    String message[]=new String[5];
    public Advice()
    {
        message[0]="never say no!!";
        message[1]="be hungry!!";
        message[2]="dont stop until you reach the goal";
        message[3]="you are hero!!";
        message[4]="go ahead!!";
    }
    public String getAdvice()
    {
        Random no=new Random();
        return message[no.nextInt(5)];
    }
}
