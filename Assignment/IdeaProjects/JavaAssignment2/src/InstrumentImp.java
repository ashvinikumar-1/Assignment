/**
 * Created by ashvinikumar on 17/11/16.
 */
abstract class Instrument
{
    abstract void instrument();
}
class Piano extends Instrument
{
    public void instrument()
    {
        System.out.println("Piano is playing  tan tan tan tan ");
    }
}
class Flute extends Instrument
{
    public void instrument()
    {
        System.out.println("Flute is playing  toot toot toot toot ");
    }
}
class Guitar extends Instrument
{
    public void instrument()
    {
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}

public class InstrumentImp {
    public static void main(String args[])
    {
        Instrument[] ins=new Instrument[10];
        ins[0]=new Piano();
        ins[1]=new Guitar();
        ins[2]=new Flute();
        ins[3]=new Piano();
        ins[4]=new Piano();
        ins[5]=new Piano();
        ins[6]=new Guitar();
        ins[7]=new Guitar();
        ins[8]=new Flute();
        ins[9]=new Flute();
        for(int i=0;i<10;i++)
        {
            System.out.println("Index at: "+(i+1));
            ins[i].instrument();
        }
    }
}
